# Informações do Documento

* **Projeto** → Portal de Conteúdos Educacionais
* **Área** → Tecnologia | ProGirls
* **Versão** → 1.0
* **Responsável** → [**Natália S. Gomes | Líder Técnica**](https://github.com/nataliatsi)
* **Data de criação** → 24/03/2026
* **Última atualização** → 27/03/2026
* **Escopo** → MVP (Minimum Viable Product)
* **User Story de referência** → [US1] Definir Entidades do Sistema

---

## Descrição

Este documento descreve as entidades e seus atributos para o sistema **Portal de Conteúdos Educacionais**.

A modelagem foi definida com foco no MVP, contemplando apenas funcionalidades de leitura (consulta), mas já preparada para suportar operações de gerenciamento (CRUD) em versões futuras.

---

## Objetivo

Definir de forma clara e estruturada os dados do sistema, garantindo:

* Organização e padronização das entidades
* Facilidade de manutenção e evolução
* Base sólida para implementação do backend e banco de dados

---

## Entidades do Sistema

---

### Conteudo

Representa um material educacional disponível na plataforma.

* **id** → Identificador único do conteúdo
* **titulo** → Nome do conteúdo exibido para o usuário
* **descricao** → Descrição resumida do conteúdo
* **link** → URL de acesso ao conteúdo externo
* **imagemUrl** → Link da imagem de capa do conteúdo
* **dataPublicacao** → Data em que o conteúdo foi publicado na plataforma
* **dataCriacao** → Data em que o conteúdo foi cadastrado no sistema (curadoria)
* **areaId** → Identificador da área à qual o conteúdo pertence
* **categoriaId** → Identificador da categoria do conteúdo (ex: artigo, vídeo, curso)

#### Relacionamentos

* Um conteúdo pode estar associado a várias **tecnologias**
* Um conteúdo pode possuir múltiplas **tags**

---

### Area

Representa uma área de conhecimento (ex: Backend, Frontend, Dados).

* **id** → Identificador único da área
* **nome** → Nome da área
* **dataCriacao** → Data de criação do registro no sistema

---

### Categoria

Define o formato do conteúdo (ex: artigo, vídeo, curso).

* **id** → Identificador único da categoria
* **nome** → Nome da categoria
* **dataCriacao** → Data de criação do registro no sistema

---

### Tecnologia

Representa tecnologias associadas aos conteúdos (ex: Java, React, Python).

* **id** → Identificador único da tecnologia
* **nome** → Nome da tecnologia
* **dataCriacao** → Data de criação do registro no sistema

---

### Tag

Palavras-chave utilizadas para classificação (ex: iniciante, recomendado).

* **id** → Identificador único da tag
* **nome** → Nome da tag
* **dataCriacao** → Data de criação do registro no sistema

---

### Roadmap

Representa uma trilha de aprendizado composta por conteúdos.

* **id** → Identificador único do roadmap
* **titulo** → Nome do roadmap
* **descricao** → Descrição da trilha de aprendizado
* **nivel** → Nível do roadmap (INICIANTE, INTERMEDIARIO, AVANCADO)
* **dataCriacao** → Data de criação do roadmap

#### Relações com Conteúdos

* Um roadmap é composto por vários **conteúdos**
* Um conteúdo pode estar presente em múltiplos roadmaps

---

### ReferenciaExterna

Representa links externos relevantes relacionados à área de tecnologia.

* **id** → Identificador único da referência
* **titulo** → Nome da referência
* **descricao** → Descrição do recurso externo
* **link** → URL de acesso
* **dataCriacao** → Data de criação do registro

---

### MembroEquipe

Representa um membro da equipe do projeto.

* **id** → Identificador único do membro
* **nome** → Nome do membro
* **cargo** → Função desempenhada no projeto
* **fotoUrl** → Link da foto do membro
* **linkedinUrl** → Link do perfil no LinkedIn
* **githubUrl** → Link do perfil no GitHub
* **dataCriacao** → Data de cadastro do membro

---

## Entidades de Relacionamento

> Utilizadas para representar relações muitos-para-muitos.

---

### ConteudoTecnologia

Relaciona conteúdos com tecnologias.

* **id** → Identificador único do relacionamento
* **conteudoId** → Identificador do conteúdo
* **tecnologiaId** → Identificador da tecnologia

---

### ConteudoTag

Relaciona conteúdos com tags.

* **id** → Identificador único do relacionamento
* **conteudoId** → Identificador do conteúdo
* **tagId** → Identificador da tag

---

### RoadmapConteudo

Relaciona conteúdos a um roadmap, mantendo a ordem da trilha.

* **id** → Identificador único do relacionamento
* **roadmapId** → Identificador do roadmap
* **conteudoId** → Identificador do conteúdo
* **ordem** → Define a posição do conteúdo dentro do roadmap
