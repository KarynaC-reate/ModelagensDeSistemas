# 🚀 API de Cadastro de Leads para a SNCT

Uma API RESTful desenvolvida em **Spring Boot** para gerenciar o cadastro de leads da Semana Nacional de Ciência e Tecnologia (SNCT).

Este projeto é resultado da aplicação prática de conceitos de Teste de Software, Implementação de Sistemas e Modelagem de Sistemas, com foco em criar uma solução robusta e escalável para um desafio real proposto pelo SENAI.

<br>

<p align="center">
  <img src="https://img.shields.io/badge/Status-Online-brightgreen?style=for-the-badge&logo=appveyor" alt="API Status"/>
  <img src="https://img.shields.io/badge/Made%20with-Java%20&%20Spring%20Boot-orange?style=for-the-badge&logo=java" alt="Made with Java & Spring Boot"/>
</p>

---

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias:

![Java](https://img.shields.io/badge/Java-17+-%23ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.x-%236DB33F?style=for-the-badge&logo=spring&logoColor=white)
![JPA & Hibernate](https://img.shields.io/badge/JPA_&_Hibernate-5.x-%2354A05D?style=for-the-badge&logo=hibernate&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-%234479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Flyway](https://img.shields.io/badge/Flyway-9.x-%23CC3333?style=for-the-badge&logo=flyway&logoColor=white)

---

## ⚙️ Pré-requisitos para o Desenvolvimento

Para rodar a aplicação, você precisará ter as seguintes ferramentas instaladas em sua máquina:

* <font color="#51aff7">**JDK 17+**</font> ☕ - A máquina virtual Java para execução do código.
* <font color="#51aff7">**Maven**</font> 📦 - Gerenciador de dependências e build do projeto.
* <font color="#51aff7">**Docker e Docker Compose**</font> 🐳 - Para orquestração do ambiente de banco de dados.

---

## ✨ Como Colocar a API para Rodar

Siga os passos abaixo para preparar e iniciar a aplicação em seu ambiente local:

### <font color="#51aff7">1. Clonar o Repositório</font>

Comece clonando o projeto para sua máquina local:

```bash
git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
cd seu-repositorio
```

### <font color="#51aff7">2\. Configurar e Iniciar o Banco de Dados</font>

Utilizamos **Docker Compose** para uma configuração de ambiente simples e consistente do MySQL.

```bash
docker-compose up -d mysql
```

> 💡 **Dica**: Este comando inicia o MySQL em background, acessível na porta `3306`.

### <font color="#51aff7">3\. Migrações de Banco de Dados com Flyway</font>

As migrações do banco de dados serão aplicadas automaticamente pelo Flyway na inicialização da aplicação, garantindo que seu esquema esteja sempre atualizado.

### <font color="#51aff7">4\. Executar a Aplicação Spring Boot</font>

Escolha uma das opções abaixo para iniciar a API:

#### **Opção A: Via Maven (Recomendado)**

```bash
./mvnw spring-boot:run
```

#### **Opção B: Via IDE**

Abra o projeto em sua IDE (IntelliJ IDEA, Eclipse, VS Code) e execute a classe principal `SeuNomeApplication.java`.

### <font color="#51aff7">5\. Acessar a API</font>

A API estará disponível em `http://localhost:8080`.

Utilize ferramentas como **Postman**, **Insomnia** ou **cURL** para interagir com os endpoints.

