# Desafio de projeto - Barbearia API

Essa documentação foi desenvolvida por **Gabriel Rosa**. Em caso de dúvida, estou disponibilizando minhas redes sociais para contato.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-gabriel--rosaa-blue?logo=linkedin)](https://www.linkedin.com/in/gabriel-rosaa/) [![GitHub](https://img.shields.io/badge/GitHub-Gabriel--Pink-black?logo=github)](https://github.com/Gabriel-Pink) ![Discord](https://img.shields.io/badge/Discord-gabriel.tec-%237289DA?logo=discord)
[![Whatsapp](https://img.shields.io/badge/Whatsapp-(11)%2091356--4300-%237289DA?logo=whatsapp)](https://wa.me/+5511913564300) 

---


Esse projeto trabalha em conjunto com o projeto: https://github.com/Avanade-Bootcamp/challenge-barbearia-front

Este é uma API simples, só para poder realizar a integração com o frontend.

Basicamente, consiste no agendamento de horário em uma barbearia. Contendo duas models, Users e Appointment.

## Rotas

### Usuários

![image](https://github.com/user-attachments/assets/441c2a0c-3358-4d78-a445-46fa13d3fb22)

```
POST - Criar Usuário
http://localhost:8080/users
```
Payload:

```json
{
  "name": "Gabriel Rosa",
  "email": "gabriel1@gmail.com"
}
```

Resposta:

```json
{
  "id": 3,
  "name": "Gabriel Rosa",
  "email": "gabriel1@gmail.com"
}
```

```
GET - Listar Usuários
http://localhost:8080/users
```

Resposta:

```json
[
  {
    "id": 1,
    "name": "Gabriel Rosa",
    "email": "gabriel@gmail.com"
  },
  {
    "id": 3,
    "name": "Gabriel Rosa",
    "email": "gabriel1@gmail.com"
  }
]
```

```
GET - Pega Usuário por ID
http://localhost:8080/users/{passar ID}
```

Resposta:

```json
{
  "id": 1,
  "name": "Gabriel Rosa",
  "email": "gabriel@gmail.com"
}
```

---

### Agendamento

![image](https://github.com/user-attachments/assets/e1195e0f-8174-4bec-bcf2-0294a9b81c7b)
```
POST - Criar agendamento
http://localhost:8080/appointments
```

Payload:

```json
{
  "dateTime": "2025-02-24T14:00:00",
  "user": {
    "id": 1
  }
}
```

Resposta:

```json
{
    "id": 2,
    "dateTime": "2025-02-24T14:00:00",
    "user": {
        "id": 1,
        "name": "Gabriel Rosa",
        "email": "gabriel@gmail.com"
    }
}
```

```
GET - Listar agendamentos
http://localhost:8080/appointments
```

Resposta:

```json
[
    {
        "id": 1,
        "dateTime": "2025-02-25T14:00:00",
        "user": {
            "id": 1,
            "name": "Gabriel Rosa",
            "email": "gabriel@gmail.com"
        }
    },
    {
        "id": 2,
        "dateTime": "2025-02-24T14:00:00",
        "user": {
            "id": 1,
            "name": "Gabriel Rosa",
            "email": "gabriel@gmail.com"
        }
    }
]
```
