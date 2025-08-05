# Sistema de Postagens com Java, Spring Boot e MongoDB
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/pedrosntx/spring-boot-mongodb/blob/main/LICENSE) 

# Sobre o projeto

Esta aplicação foi desenvolvida como parte da prática aplicada durante um curso de desenvolvimento back-end com Java. O objetivo foi consolidar as habilidades adquiridas durante o curso, além de proporcionar experiência prática com frameworks da linguagem, como o Spring Boot, e com bancos de dados NoSQL, como o MongoDB.

Este projeto consiste em uma aplicação Java desenvolvida com Spring Boot e MongoDB que simula uma rede social simplificada. O sistema possui usuários pré-instanciados que são autores de posts e comentários em outros posts, também previamente instanciados.

## Funcionalidades
- CRUD completo para usuários
- Listar todos os usuários
- Buscar usuário por ID
- Obter todos os posts de um determinado usuário
- Realizar buscas por uma string em qualquer lugar (no título, corpo ou comentário) e em um dado intervalo de datas

## Modelo conceitual
![Modelo Conceitual](https://github.com/pedrosntx/assets/blob/main/springboot-mongodb-workshop/modelo-conceitual.png)

# Tecnologias utilizadas
## Back-end
- Java
- Spring Boot
- Maven

## Banco de Dados
- MongoDB

## Ferramentas
- MongoDB Compass
- Postman

## Objetivos de aprendizado
- Desenvolver APIs RESTful com Spring Boot
- Praticar a integração com bancos de dados NoSQL
- Utilizar o padrão DTO para controlar os dados expostos pelas APIs
- Se familiarizar com a organização de projetos em camadas

# Como executar o projeto

Pré-requisitos: Java 17+, MongoDB, MongoDB Compass e Postman instalados

```bash
# clonar repositório
# git clone git@github.com:pedrosntx/spring-boot-mongodb.git

# abra o MongoDB Compass

# inicie o localhost com o comando mongod no shell

# se conecte ao localhost e crie a database do projeto

# crie as coleções user e post que serão utilizadas no projeto

# execute a aplicação localizada em:
# src/main/java/com/pedrosantos/workshopmongodb/WorkshopMongodbApplication.java

# utilize o Postman para testar os endpoints
```

# Autor

Pedro Henrique Gomes dos Santos

https://www.linkedin.com/in/pedrosantos091/

