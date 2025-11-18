# Controle Geral de Artes Marciais 🥋  
Aplicação Java Spring Boot com integração a PostgreSQL usando Docker

Este projeto é uma aplicação REST desenvolvida em **Java 21 + Spring Boot**, utilizando **Docker** para orquestrar o ambiente e **PostgreSQL** como banco de dados.  
A aplicação fornece uma estrutura inicial completa para criação de entidades, serviços, repositórios e controladores.

---

## 🚀 Tecnologias utilizadas

- **Java 21**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **PostgreSQL**
- **Docker & Docker Compose**
- **Hibernate**
- **Maven**

# Modelo Descritivo das Tabelas do Sistema

---

## **TB_movimentos**
**Finalidade:** Armazena os movimentos executados nas graduações.

_Campos:_
- id – Identificador único do movimento.
- nome – Nome do movimento.
- descricao – Descrição do movimento.

_Relacionamentos:_
- Relaciona-se com **TB_graduacao_movimento** (1,N)

---

## **TB_kata**
**Finalidade:** Armazena os katas existentes e suas características.

_Campos:_
- id – Identificador único do kata.
- nome – Nome do kata.
- descricao – Explicação/resumo sobre o kata.
- qtd_movimentos – Número total de movimentos do kata.

_Relacionamentos:_
- Relaciona-se com **TB_graduacao_kata** (1,N)

---

## **TB_graduacao**
**Finalidade:** Representa cada graduação do sistema (faixa, nível etc.).

_Campos:_
- id – Identificador único da graduação.
- graduacao – Nome/nível da graduação.

_Relacionamentos:_
- N:N com **TB_movimentos** via **TB_graduacao_movimento**
- N:N com **TB_kata** via **TB_graduacao_kata**
- 1,N com **TB_usuario** (uma graduação pode ter vários usuários)

---

## **TB_graduacao_movimento**
**Finalidade:** Tabela intermediária que mapeia movimentos atribuídos a cada graduação.

_Campos:_
- graduacao_id – FK para **TB_graduacao**
- movimento_id – FK para **TB_movimentos**

_Relacionamentos:_
- (N,1) com **TB_graduacao**
- (N,1) com **TB_movimentos**

---

## **TB_graduacao_kata**
**Finalidade:** Tabela intermediária que mapeia katas atribuídos a cada graduação.

_Campos:_
- graduacao_id – FK para **TB_graduacao**
- movimento_id – FK para **TB_kata** *(ideal renomear para kata_id)*

_Relacionamentos:_
- (N,1) com **TB_graduacao**
- (N,1) com **TB_kata**

---

## **TB_perfil**
**Finalidade:** Define os tipos de perfis do sistema (ex.: aluno, professor, administrador).

_Campos:_
- id – Identificador único.
- perfil – Nome do perfil.

_Relacionamentos:_
- 1,N com **TB_usuario**

---

## **TB_usuario**
**Finalidade:** Armazena dados dos usuários do sistema.

_Campos:_
- id – Identificador único.
- nome – Nome do usuário.
- email – E-mail do usuário.
- senha – Senha criptografada.
- data_nascimento – Data de nascimento.
- perfil – FK para **TB_perfil**.
- graduacao – FK para **TB_graduacao**.

_Relacionamentos:_
- (N,1) com **TB_perfil**
- (N,1) com **TB_graduacao**
- (1,N) com **TB_treino**

---

## **TB_treino**
**Finalidade:** Registra treinos semanais ministrados por professores.

_Campos:_
- id – Identificador único.
- dia_da_semana – Dia da semana em que o treino ocorre.
- professor_id – FK para **TB_usuario**.
- observacoes – Observações gerais.

_Relacionamentos:_
- (N,1) com **TB_usuario** (somente professores)

Anexos (se necessário)
[Controle Geral de Artes Marciais.html](https://github.com/user-attachments/files/23590868/Controle.Geral.de.Artes.Marciais.html)
[Ideia principal (com complementos).pdf](https://github.com/user-attachments/files/23590869/Ideia.principal.com.complementos.pdf)
