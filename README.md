# sistema-recomendacao-livros-grafo-java
Sistema de recomendação de livros em Java utilizando grafos (HashMap) para representar relações entre obras.
# 📚 Sistema de Recomendação de Livros com Grafos em Java

Este projeto foi desenvolvido como parte de uma atividade acadêmica com o objetivo de aplicar conceitos de **estruturas de dados**, especialmente **grafos**, utilizando Java.

A aplicação simula um sistema de recomendação de livros, semelhante aos utilizados por plataformas digitais, onde livros são conectados com base em critérios como gênero.

---

## 🚀 Tecnologias utilizadas

* Java
* Estrutura de dados: `HashMap` e `Set`
* Programação orientada a objetos (POO)

---

## 🧠 Conceitos aplicados

* Grafos (representação com HashMap)
* Nós e arestas
* Relações de similaridade entre objetos
* Sobrescrita de `equals()` e `hashCode()`
* Estruturas de coleção (`LinkedList`, `HashSet`)

---

## 🗺️ Como o grafo funciona

O grafo é representado da seguinte forma:

```java
HashMap<Livro, Set<Livro>>
```

* Cada **Livro** é um nó
* Cada conjunto (`Set<Livro>`) representa as **recomendações (arestas)**

As conexões são criadas com base em **gênero**, ou seja, livros do mesmo gênero são considerados relacionados.

---

## 📖 Funcionalidades

* Listagem de livros disponíveis e emprestados
* Recomendação de livros baseada em:

  * 📌 Título
  * 📌 Gênero
* Visualização completa das conexões do grafo

---

## 📂 Estrutura do projeto

```
📦 projeto
 ┣ 📂 model
 ┃ ┗ 📜 Livro.java
 ┣ 📂 main
 ┃ ┗ 📜 Main.java
```

---

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/sistema-recomendacao-livros-grafo-java.git
```

2. Abra o projeto em uma IDE (IntelliJ, Eclipse ou VS Code)

3. Execute a classe `Main.java`

---

## 💡 Exemplo de uso

O usuário pode:

* Ver todos os livros cadastrados
* Buscar recomendações por gênero (ex: Fantasia, Romance)
* Buscar recomendações a partir de um livro específico

---

## 📌 Melhorias futuras

* Implementar algoritmos de busca em grafos (BFS/DFS)
* Adicionar pesos às conexões (nível de similaridade)
* Criar interface gráfica
* Persistência de dados (banco de dados)

---

## 👩‍💻 Autora

Desenvolvido por **Eduarda Angeli**

---

## 📄 Licença

Este projeto é apenas para fins educacionais.
