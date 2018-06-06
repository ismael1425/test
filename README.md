## Rest API JPA + HSQLDB engine in memory

1. **Get**  : http://localhost:8080/api/personas
2. **POST** : http://localhost:8080/api/persona
3. **PUT**  : http://localhost:8080/api/changepersona
4. **DELETE**  : http://localhost:8080/api/removepersona/id
5. **GET (Only One)**  : http://localhost:8080/api/viewsinglepersona/id

### HSQLDB Setup
```
spring.datasource.url = jdbc:hsqldb:mem:test
spring.datasource.username =SA
spring.datasource.password =
```

### Consumes
**POST** :

```
{
  "personaNombre": "Javier",
  "personaApellido": "Garcia",
  "personaEdad": 24,
  "personaSexo": "masculino"
}
```
**PUT** :

```
{
  "personaId": 1
  "personaNombre": "Javier",
  "personaApellido": "Garcia",
  "personaEdad": 24,
  "personaSexo": "masculino"
}
```
