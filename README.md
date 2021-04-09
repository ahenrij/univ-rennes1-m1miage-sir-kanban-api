# KanbanBoard API

1. Import this project in your favorite IDE, 
2. Create a SQL Database named : kanbanboard (running by default on port 3306)
4. Start the backend. There is a main class to start the backend

You can change database connection configurations in __persistence.xml__ file.


The API is by default available on http://localhost:8090/api \
Open the link above in your favorite browser to get API Documentation generated by SwaggerUi.

Get started testing the routes by importing this [Postman Collection](https://www.getpostman.com/collections/07b2f834ed3d99eed13a). 
You will need to create an environment with two variables :

* __url__: http://localhost:8090/api
* __access_token__: (empty) - the access token is filled automatically right after login request succeeded.

NOTE : All routes except those for authentication (__login__ and __register__), require the access token from __login__ response,
as Bearer Token in Authorization Header, to add a security layer to the API and ease getting the current user making a request.\
The access token is a Json Web Token (JWT).

You may also want to have a look at the [KanbanBoard Class Diagram](https://drive.google.com/file/d/1IRkcH4XR_PGaDw5jp9CDikefMnfvkEbJ/view?usp=sharing)

### Contributors:
* Henri AÏDASSO
* Octaviana DIACONU
