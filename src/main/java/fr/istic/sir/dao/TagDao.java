package fr.istic.sir.dao;

import fr.istic.sir.dao.generic.AbstractJpaDao;
import fr.istic.sir.model.Tag;

import java.util.List;

public class TagDao extends AbstractJpaDao<Long, Tag> {

    public TagDao() {
        super(Tag.class);
    }

    public List<Tag> getTagsByUserId(Long userId) {

        return this.entityManager
                .createQuery("SELECT t FROM " + clazz.getName() + " t WHERE t.owner.id = :userId", clazz)
                .setParameter("userId", userId)
                .getResultList();
    }
}
