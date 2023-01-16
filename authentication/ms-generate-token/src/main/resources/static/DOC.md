# Generate Token

> O microsserviço tem como objetivo gerar token, utilizando o Spring Security.  
> Para gerar o token faça o clone do repositório e roda o projeto:

```bash
git clone 
mvn spring-boot:run
```

[Mais informações sobre o projeto](./src/main/resources/static/README.md)

---

URI: http://localhost:8090/api

| Method | path               | Description                                      |  
|:-------|:-------------------|:-------------------------------------------------|
| POST   | /auth/token        | Gerar token deve inserir o username e o password |
| POST   | /auth/login        | Gerar token e efetuar login                      |
| GET    | /home              | Página principal sem autenticação                |
| GET    | /home/user-profile | Perfil do usuário após login                     |

---

- **Method**: POST
- **Path**: /auth/token
- **Description**: Gerar token deve inserir o username e o password

### Request

```text
curl --location --request POST 'http://localhost:8090/api/auth/token' \
--header 'Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ='
```

```http request
POST /api/auth/token HTTP/1.1
Host: localhost:8090
Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ=
```

---

- **Method**: POST
- **Path**: /auth/login
- **Description**: Gerar token e efetuar login

### Request

```text
curl --location --request POST 'http://localhost:8090/api/auth/login' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "username",
    "password": "password"
}'
```


```http request
POST /api/auth/login HTTP/1.1
Host: localhost:8090
Content-Type: application/json
Content-Length: 61

{
    "username": "username",
    "password": "password"
}
```

---

- **Method**: GET
- **Path**: /home
- **Description**: Página principal SEM autenticação

### Request

```text
curl --location --request GET 'http://localhost:8090/api/home'
```


```http request
GET /api/home HTTP/1.1
Host: localhost:8090
```

---

- **Method**: GET
- **Path**: /home/user-profile
- **Description**: Perfil do usuário após login

### Request

```text
curl --location --request GET 'http://localhost:8090/api/home/user-profile'
```


```http request
GET /api/home/user-profile HTTP/1.1
Host: localhost:8090
```
