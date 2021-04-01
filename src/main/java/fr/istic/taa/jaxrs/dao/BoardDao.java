package fr.istic.taa.jaxrs.dao;


import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Board;
import fr.istic.taa.jaxrs.domain.Section;

import java.util.List;

public class BoardDao extends AbstractJpaDao<Long, Board> {

    public BoardDao() {
        super(Board.class);
    }

    public List<Board> getBoardsByUserId(Long userId) {

        return this.entityManager
                .createQuery("SELECT b FROM " + clazz.getName() + " b WHERE b.owner.id = :userId", clazz)
                .setParameter("userId", userId)
                .getResultList();
    }

    public Board getBoard(Long boardId) {

        return this.entityManager
                .createQuery("SELECT b FROM " + clazz.getName() + " b LEFT JOIN FETCH b.sections s WHERE b.id = :boardId", clazz)
                .setParameter("boardId", boardId)
                .getSingleResult();
    }

    public List<Board> getBoardsByTeamId(Long teamId) {

        return this.entityManager
                .createQuery("SELECT b FROM " + clazz.getName() + " b JOIN b.teams t WHERE t.id = :id", clazz)
                .setParameter("id", teamId)
                .getResultList();
    }
}
