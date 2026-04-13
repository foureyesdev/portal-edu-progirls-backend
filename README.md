<div align="center">
  <h1>
    Nome do Projeto
  </h1>
  
API backend desenvolvida com **[tecnologia principal]** para **[objetivo do sistema]**.

<p>
  <a href="#tecnologias">Tecnologias</a> •
  <a href="#estrutura">Estrutura</a> •
  <a href="#endpoints">Endpoints</a> •
  <a href="#como-executar">Como executar</a> •
  <a href="#variáveis-de-ambiente">Variáveis de ambiente</a> •
  <a href="#testes">Testes</a> •
  <a href="#arquitetura">Arquitetura</a> •
  <a href="#segurança">Segurança</a> •
  <a href="#banco-de-dados">Banco de Dados</a> •
  <a href="#licença">Licença</a> •
  <a href="#contribuidores">Contribuidores</a>
</p>
  
</div>

---

<!-- Explique o propósito da API -->

Este projeto foi desenvolvido para **[resolver problema X]**, permitindo **[resultado principal]**.

<!-- Contexto técnico -->

**Contexto:**

* API REST / Microsserviço / Monólito
* Integração com banco de dados
* Integração com outros serviços (se houver)

---

## Tecnologias

<!-- Liste apenas o que foi usado -->

✔ Exemplo:

* Java + Spring Boot
* Spring Security
* Hibernate / JPA

<!-- Evite listar coisas que não estão no projeto -->

---

## Estrutura

<!-- Ajuste conforme o projeto -->

Para cada pasta:

* Descreva responsabilidade, não implementação

✔ Exemplo:

```bash
src/
 ├── controller/    # endpoints da API
 ├── service/       # regras de negócio
 └── util/          # classes utilitárias
```

---

## Endpoints

✔ Exemplo:

| Método | Endpoint    | Descrição               |
| ------ | ----------- | ----------------------- |
| POST   | /auth/login | Autenticação de usuário |
| GET    | /users      | Listar usuários         |
| POST   | /users      | Criar usuário           |

---

## Como executar

### Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

* **Java 17**
* **Docker + Docker Compose**
* Uma IDE (IntelliJ IDEA, VS Code, etc)

---

### Variáveis de ambiente

Este projeto utiliza variáveis de ambiente para configuração.

Crie um arquivo `.env` na raiz do projeto:

```env
POSTGRES_DB=
POSTGRES_USER=
POSTGRES_PASSWORD=

SPRING_DATASOURCE_URL=
SPRING_DATASOURCE_USERNAME=
SPRING_DATASOURCE_PASSWORD=
```

⚠️ **Importante:**

> O arquivo `.env` **não deve ser versionado** (já está no `.gitignore`)

> **Nunca subir dados sensíveis** como senha, tokens ou chaves

---

### Configurando na IDE (IntelliJ)

Se estiver usando o IntelliJ:

1. Vá em **More Actions > Edit**
2. Em **Environment Variables**
3. Aponte para o arquivo `.env`

Isso garante que o projeto consiga ler as variáveis corretamente.

---

### Subindo o banco de dados

```bash
docker-compose up -d
```

* O projeto utiliza **PostgreSQL (Alpine)** para ser mais leve
* Caso já tenha PostgreSQL instalado, pode usar sua instância local

---

### Rodando a aplicação

#### Opção 1 — Pela IDE (recomendado)

A forma mais simples:

* Clique em **Run** na sua IDE

---

#### Opção 2 — Via terminal (Gradle)

Se for rodar via terminal, pode ser necessário passar as variáveis:

```bash
./gradlew bootRun

# Build do projeto
./gradlew build

# Rodar testes
./gradlew test

# Limpar build
./gradlew clean
```

Caso dê erro com variáveis de ambiente, prefira rodar pela IDE.

---

### Acessando a API

Após subir a aplicação, acesse:

🟣 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## Boas práticas

* Não versionar `.env`
* Não expor credenciais no código
* Sempre validar se as variáveis de ambiente estão configuradas antes de rodar

---

## Testes

<!-- Incluir apenas se houver -->

✔ Exemplo:

```bash
./mvnw test
```

---

## Arquitetura

Descreva:

* Padrão utilizado (ex: camadas, hexagonal, clean architecture)
* Separação de responsabilidades
* Estratégias importantes

✔ Exemplos:

* Arquitetura em camadas (Controller → Service → Repository)
* Uso de DTO para isolamento de domínio
* Autenticação via JWT com Spring Security
* Tratamento global de exceções

---

## Segurança

<!-- 👉 Importante para backend -->

Descreva:

* Tipo de autenticação (JWT, OAuth, etc.)
* Como o token é validado
* Proteção de rotas

✔ Exemplo:

* Autenticação via JWT
* Rotas protegidas com Spring Security
* Token enviado no header Authorization

---

## Banco de Dados

<!-- 👉 Opcional, mas forte diferencial -->

Descreva:

* Qual banco foi utilizado
* Estratégia de migrations

✔ Exemplo:

* PostgreSQL
* Migrations controladas com Flyway

---

## Licença

<!-- TODO: linkar licença -->
Este projeto está sob a licença MIT.

---

## Contribuidores

- **Tech Leader:** [Natália](https://github.com/nataliatsi)
- **Backend:** [Nome](https://github.com/usuario)

<!-- Adicione:
- Função (Backend, Tech Lead, etc.)
- Nome
- Link do GitHub
-->
