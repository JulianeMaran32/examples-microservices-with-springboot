# **Generate Token with Username and Password **

- URL: http://localhost:8888/api
- Executar Dockerfile: `docker build -t ms-auth .`

<hr>

## **Token**

- Method: **POST**
- Base path: `/token`

### **Request**

|               | type   | Mandatory | Example                          |
|:--------------|:-------|:----------|:---------------------------------|
| Authorization | header | required  | `Basic dXNlcm5hbWU6cGFzc3dvcmQ=` |
| Content-Type  | header | required  | `application/json`               |
| username      | body   | required  | Username                         |
| password      | body   | required  | Password                         |

<br>

```text
curl --location --request POST 'localhost:8888/api/token' \
--header 'Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "username",
    "password": "password"
}'
```

### **Response**

```text
eyJraWQiOiJlYzY5OGZkNy1kNmNlLTQ1NzUtYjUzOS1mMDBiZTUwMGE3NmYiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoidXNlcm5hbWU
iLCJleHAiOjE2NzM3MTU1MDUsImlhdCI6MTY3MzcxMTkwNSwic2NvcGUiOiJyZWFkIn0.Mq9HVc-KX6nZ4HPe7ybpmwcbT9WEbEfa9I6Si4og2L2L_Eb1mdY
lUGda0l7y-sahuSGN0Pz8RWdlTztCUN_FqvgzZrkb7xq8DhLIiMuJoiOxou0HG92kkWThBvDpHGkDAZMIfYK2ING0z5KauTUG9IRHnryniiWyZvo030o76sZ
sfMTA4gdZMZhoqyT-H4AfH9fdxmv83k7Nmh-dqsSw2dHqvfA-9F2h-BM3vN_0ImNWOQDazEpBU-tleH3bZGVjB9gh1boDb0RtQqBa0ndD1iHZ6ro4JiSgASX
Hx0LS9tcjETGMQvjWG46axRF012e2HrfDpdyXBEnoQ1pBOy-FyA
```

<hr>

## **Secure**

- Method: **GET**
- Base path: `/secure`

|               | type   | Mandatory | Example                        |
|:--------------|:-------|:----------|:-------------------------------|
| Authorization | header | required  | `Authorization: Bearer eyJ...` |

### **Request**

```text
curl --location --request GET 'localhost:8888/api/secure' \
--header 'Authorization: Bearer eyJraWQiOiJlYzY5OGZkNy1kNmNlLTQ1NzUtYjUzOS1mMDBiZTUwMGE3NmYiLCJhbGciOiJSUzI1NiJ9.eyJpc3
MiOiJzZWxmIiwic3ViIjoidXNlcm5hbWUiLCJleHAiOjE2NzM3MTU1MDUsImlhdCI6MTY3MzcxMTkwNSwic2NvcGUiOiJyZWFkIn0.Mq9HVc-KX6nZ4HPe7
ybpmwcbT9WEbEfa9I6Si4og2L2L_Eb1mdYlUGda0l7y-sahuSGN0Pz8RWdlTztCUN_FqvgzZrkb7xq8DhLIiMuJoiOxou0HG92kkWThBvDpHGkDAZMIfYK2
ING0z5KauTUG9IRHnryniiWyZvo030o76sZsfMTA4gdZMZhoqyT-H4AfH9fdxmv83k7Nmh-dqsSw2dHqvfA-9F2h-BM3vN_0ImNWOQDazEpBU-tleH3bZGV
jB9gh1boDb0RtQqBa0ndD1iHZ6ro4JiSgASXHx0LS9tcjETGMQvjWG46axRF012e2HrfDpdyXBEnoQ1pBOy-FyA'
```

<hr>

## **Links**

[jwt.io](https://jwt.io/)  
[SPRING BOOT JWT](https://www.danvega.dev/blog/2022/09/06/spring-security-jwt/)  

