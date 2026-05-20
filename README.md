# Alura Backend Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)
![Learning](https://img.shields.io/badge/Learning-Alura-0077FF)

Repositório de estudos da trilha **Desenvolvimento Back-End Java** da Alura. Este projeto documenta minha jornada de aprendizado desde os fundamentos da linguagem até conceitos avançados de arquitetura de microsserviços, Spring Boot, APIs REST e infraestrutura moderna.

## 📍 Status Atual

**Fase 1 – Nível 3**

Atualmente estudando os fundamentos de Java e Programação Orientada a Objetos, com foco em:
- Sintaxe e estruturas básicas da linguagem
- Conceitos de POO (herança, polimorfismo, encapsulamento)
- Collections e estruturas de dados
- Ordenação de coleções (Collections.sort)
- Interface Comparable
- Casting e conversão de tipos
- Construtores e boas práticas iniciais
- **Tratamento de exceções (try-catch-finally)**
- **Exceções personalizadas (checked e unchecked)**
- **Consumo de APIs REST com HttpClient**
- **Integração com APIs externas de terceiros**

## 🛠️ Tecnologias Utilizadas

- **Java** – Linguagem principal
- **Git/GitHub** – Controle de versão

## 📂 Estrutura do Projeto

```
alura-backend-java/
└── src/
    └── br/
        └── com/
            └── wenderson/
                └── exercicios/
                    ├── collections/
                    │   ├── collectionOrdenacao/      # Ordenação e interface Comparable
                    │   │   ├── app/
                    │   │   ├── examples/
                    │   │   └── model/
                    │   └── desafiocomprascartao/     # Sistema de compras com cartão
                    │       ├── app/                  # Aplicação principal
                    │       ├── model/                # Modelos (Compra, CartaoCredito)
                    │       └── service/              # Lógica de negócio
                    ├── desafio02/
                    │   ├── casting/                  # Exercícios de casting
                    │   │   ├── app/
                    │   │   └── models/
                    │   ├── collections/              # Collections básicas
                    │   ├── construtores/             # Construtores e inicialização
                    │   └── heranca/                  # Herança e polimorfismo
                    └── estudoApi/
                        └── consumindoApi/            # Consumo de APIs externas
                            ├── receita/              # API TheMealDB (receitas)
                            ├── google_books/         # API Google Books
                            ├── coincgecko/           # API CoinGecko (criptomoedas)
                            └── exception/            # Tratamento de exceções
                                ├── DivisaoError.java           # Divisão por zero
                                ├── github/                     # Consulta GitHub API
                                │   ├── ConsultaGitHub.java
                                │   └── ErroConsultaGitHubException.java
                                └── leitorSenha/                # Validação de senha
                                    ├── LeitorSenha.java
                                    └── SenhaInvalidaException.java
```

## 🎯 Destaques dos Exercícios

### 🛒 Sistema de Compras com Cartão de Crédito
Um sistema completo que simula compras com cartão, incluindo:
- Controle de limite de crédito
- Validação de compras
- Ordenação de compras por valor
- Encapsulamento adequado dos dados

### ⚠️ Tratamento de Exceções
Implementação de diversos cenários de tratamento de erros:
- **DivisaoError**: Tratamento de divisão por zero com ArithmeticException
- **LeitorSenha**: Validador de senha com exceção checked personalizada (SenhaInvalidaException)
  - Mínimo de 8 caracteres
  - Ao menos uma letra maiúscula
  - Ao menos um número
- **ConsultaGitHub**: Integração com GitHub API incluindo exceção unchecked (ErroConsultaGitHubException)
  - Validação de nome de usuário
  - Tratamento de usuário não encontrado (404)
  - Tratamento de erros HTTP diversos

### 🌐 Consumo de APIs REST
Integração com múltiplas APIs públicas:
- **TheMealDB**: Busca de receitas culinárias
- **Google Books**: Consulta de livros
- **CoinGecko**: Cotação de criptomoedas
- **GitHub**: Consulta de perfis de usuários

## 📚 Conteúdos Praticados

### Fundamentos e POO
- ✅ Fundamentos de Java (variáveis, operadores, estruturas de controle)
- ✅ Programação Orientada a Objetos
- ✅ Classes e objetos
- ✅ Herança e polimorfismo
- ✅ Casting de objetos
- ✅ Construtores
- ✅ Encapsulamento e getters
- ✅ Boas práticas de código

### Collections
- ✅ Collections (ArrayList, LinkedList, List)
- ✅ Ordenação de coleções (Collections.sort)
- ✅ Interface Comparable
- ✅ Polimorfismo com List (ArrayList vs LinkedList)
- ✅ Sistema de compras com cartão de crédito (controle de limite, validação)

### Tratamento de Exceções
- ✅ Try-catch-finally
- ✅ ArithmeticException (divisão por zero)
- ✅ Exceções personalizadas (checked exceptions)
- ✅ Exceções personalizadas (unchecked exceptions)
- ✅ Herança de Exception vs RuntimeException
- ✅ Tratamento de múltiplas exceções
- ✅ Validação com exceções customizadas

### Consumo de APIs REST
- ✅ HttpClient do Java 11+
- ✅ Requisições HTTP (GET)
- ✅ Integração com APIs externas
  - TheMealDB (receitas)
  - Google Books (livros)
  - CoinGecko (criptomoedas)
  - GitHub API (usuários)
- ✅ Tratamento de exceções em requisições HTTP
- ✅ Validação de status HTTP (404, 200, etc.)
- ✅ IOException e InterruptedException

## 🗺️ Roadmap da Trilha

### 📌 Nível 1: Fundamentos e Bases do Backend
- [x] Fundamentos de Java
- [x] Programação Orientada a Objetos
- [x] Collections e estruturas de dados
- [ ] Git e GitHub avançado
- [x] Consumo de APIs
- [x] Tratamento de exceções
- [x] Exceções personalizadas (checked e unchecked)
- [ ] Serialização JSON
- [ ] Testes básicos com JUnit
- [ ] Introdução ao Spring Framework

### 📌 Nível 2: APIs REST e Arquitetura Moderna
- [ ] Spring Boot
- [ ] APIs REST (CRUD completo)
- [ ] Spring Data JPA
- [ ] Validação e tratamento de erros
- [ ] Spring Security (autenticação e autorização)
- [ ] Documentação com Swagger/OpenAPI
- [ ] Microsserviços
- [ ] Mensageria com RabbitMQ
- [ ] Testes de integração
- [ ] CI/CD básico
- [ ] Docker (containerização)

### 📌 Nível 3: Sistemas Distribuídos e Produção
- [ ] Arquitetura de microsserviços avançada
- [ ] Apache Kafka (streaming de dados)
- [ ] Spring WebFlux (programação reativa)
- [ ] Spring Batch (processamento em lote)
- [ ] Kubernetes (orquestração de containers)
- [ ] Helm (gerenciamento de deployments)
- [ ] Istio (service mesh)
- [ ] Observabilidade (logs, métricas, tracing)
- [ ] Performance e otimização
- [ ] Deploy em nuvem (AWS/Azure/GCP)

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 11 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Executando os arquivos

```bash
# Clone o repositório
git clone https://github.com/Wendersonjose/java-backend-studies.git

# Navegue até a pasta do projeto
cd alura-backend-java

# Compile um arquivo específico
javac src/br/com/wenderson/exercicios/desafio02/[pasta]/[arquivo].java

# Execute
java -cp src br.com.wenderson.exercicios.desafio02.[pasta].[classe]
```

## 🎯 Objetivo

Este repositório serve como registro do meu progresso na trilha de desenvolvimento backend Java, consolidando o conhecimento adquirido através de exercícios práticos e aplicação de conceitos fundamentais. O objetivo é construir uma base sólida que me prepare para o desenvolvimento profissional de aplicações backend escaláveis, seguras e bem arquitetadas.

## 🔜 Próximos Passos

- ~~Finalizar exercícios de fundamentos e POO~~
- ~~Iniciar consumo de APIs externas~~
- ~~Aprender tratamento de exceções~~
- ~~Criar exceções personalizadas~~
- Aprender serialização e desserialização JSON (Gson, Jackson)
- Implementar parsing de JSON das APIs consumidas
- Estudar testes unitários com JUnit
- Dar os primeiros passos com Spring Framework

## 📧 Contato

<div align="left">
  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/wenderson-jose)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Wendersonjose)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/wenderson.jose_silva/)
[![Email](https://img.shields.io/badge/Email-0078D4?style=for-the-badge&logo=microsoft-outlook&logoColor=white)](mailto:wenderson.teles@icloud.com)

📱 **Telefone:** (34) 99158-8061  
📧 **E-mail:** wenderson.teles@icloud.com

</div>

---

**Repositório:** [java-backend-studies](https://github.com/Wendersonjose/java-backend-studies.git)  
**Trilha:** Alura – Desenvolvimento Back-End Java  
**Última atualização:** Maio 2026
