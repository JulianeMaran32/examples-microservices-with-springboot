# Address Management  


- OpenFeign: utilizado para integração e consumo de Serviços REST  
- 


### Payload ViaCep

URL: https://viacep.com.br/ws/01001000/json/

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}
```

### Request  

```
curl --location --request GET 'http://localhost:8887/api/80030-000'
```

### Response 

```json
{
  "cep": "80030-000",
  "logradouro": "Avenida João Gualberto",
  "complemento": "até 1343/1344",
  "bairro": "Alto da Glória",
  "localidade": "Curitiba",
  "uf": "PR",
  "ibge": "4106902",
  "gia": "",
  "ddd": "41",
  "siafi": "7535"
}
```