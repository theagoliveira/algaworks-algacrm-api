# How to Create a REST API with Spring Boot (step-by-step tutorial)

Tutorial by [AlgaWorks](https://www.youtube.com/channel/UCIPQ0ZqTl5e5U2OFKENOh9g).

- [:clapper: Video on YouTube (:brazil:)](https://youtu.be/9GWK9A79tEc)

## Table of Contents

- [Description](#description)
- [Project Summary](#project-summary)
- [API Documentation](#api-documentation)
  - [Get Clients](#get-clients)
    - [Request](#request)
    - [Sample Response (200 OK)](#sample-response-200-ok)
  - [Add Client](#add-client)
    - [Request](#request-1)
    - [Sample Request Body](#sample-request-body)
    - [Sample Response (201 Created)](#sample-response-201-created)
- [Deployment](#deployment)

## Description

From the YouTube description:

> "In this video you will learn how to implement a REST API using some Spring ecosystem projects, such as Spring Boot and Spring Data JPA."

## Project Summary

- Project: Maven
- Java: 16
- Spring Boot: 2.4.5
- Dependencies
  - Spring Web
  - Spring Boot DevTools
  - Spring Boot Starter Test
  - H2 Database
  - Spring Data JPA
  - Lombok
  - Spring Security
  - Bucket4j Spring Boot Starter
  - Spring Cache Abstraction
  - Ehcache
  - Logback
- Plugins
  - Spring Boot Maven Plugin
  - Heroku Maven Plugin

## API Documentation

### Get Clients

Retrieves a list of all clients.

#### Request

```http
GET /clientes
```

#### Sample Response (200 OK)

```json
[
    {
        "id": "uuid-1",
        "nome": "client-1"
    },
    {
        "id": "uuid-2",
        "nome": "client-2"
    }
]
```

### Add Client

Add a new client to the application.

#### Request

```http
POST /clientes
```

#### Sample Request Body

```json
{
    "nome": "new-client"
}
```

#### Sample Response (201 Created)

```json
{
    "id": "new-uuid",
    "nome": "new-client"
}
```

## Deployment

API deployed on [Heroku](https://nameless-falls-38710.herokuapp.com/)
