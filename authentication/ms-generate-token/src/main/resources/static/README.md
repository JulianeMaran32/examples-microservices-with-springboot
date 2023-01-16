## Configuração de Segurança

1 - Desabilita CSRF  
2 - usuario deve ser autenticado para qualquer solicitacao no app  
3 - o Spring Security não criará HttpSession e nem usará para obter o Security Context  
4 - o suporte de autenticação básica HTTP do Spring Security é ativado por padrão qlqr config baseada em servlet for
fornecida, o HTTP Basic deverá ser fornecido

**OBS.**: csrf desativado e sessão ativada = abrirá ataques de falsificação de solicitação entre sites, ou seja, ambos
desativados ou ativados

* Servidor de recursos OAuth 2.0
* accessDeniedHandler: personaliza como os erros de acesso negado são tratados
* authenticationEntryPoint: personaliza como as falhas de autenticação são tratadas
* bearerTokenResolver: personaliza como resolver um token de portador da solicitação
* jwt (personalizado): ativa o suporte ao token do portador codificado em jwt
* opaqueToken (customizador): ativa o suporte de token de portador opaco
* Cria um usuário na memória
* Utilizado apenas para testes
* JWT Decoder e Encoder

---

## Gerar RSA Public & Private Keys

```bash
# create rsa key pair
openssl genrsa -out keypair.pem 2048

# extract public key
openssl rsa -in keypair.pem -pubout -out public.pem

# create private key in PKCS#8 format
openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem
```

Após gerar os arquivos "public.pem" e "private.pem", pode excluir o arquivo "keypair.pem"

--- 

## Postman

Na aba "**Authorization**" selecionar "**Basic Auth**" e inserir o **Username** e **Password** que foi incluído na
classe SecurityConfig.java

## Request

```text
curl --location --request POST 'http://localhost:8090/api/token' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA=='
```

## Response

```text
eyJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoidXNlciIsImV4cCI6MTY3MzcxMjQ3MSwiaWF0IjoxNjczNzA4ODcxLCJzY29wZSI6InJlYW
QifQ.UnC4NQyp4tlq0UbuEvAAN9Y2dikLWoLRD7tNgRW3QCI8YxNSP7A0_s6j72kcYq6ZZId_awvmSQr1yEWGhHIyepb_5yQRa4Kb-JHxP_INqXt9GSXml2
Cp72NvsmbQLpaHLYKzkg7JS2mVBPDzSC10DYfZjV31ZpaSGP1OyOWf6bJjzx8uGegUFzUS6sHZgKuNyPC4n_5jjzRE1wElkONdZX44wxTxAMHLhELyO4yP1
WalSABqSsRKYpP7nplbrWXlRDMU5rCQ-crB3i0suEffZkv_AR9IghXXZM6s8sD50T5wuE9iIUnY-k0ETfLJ6IZd97RlSZeGpqKAqAvjayZJ8A
```

**Obs.**: o Token está configurado para exprirar em 1h, este tempo poderá ser alterado conforme a necessidade.
