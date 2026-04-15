# 📚 Sistema de Recomendação de Livros com Grafos (Java)

Este projeto implementa um sistema de recomendação de livros utilizando **grafos**, uma estrutura de dados amplamente usada para modelar relações complexas.

A aplicação simula o funcionamento básico de sistemas de recomendação utilizados por plataformas digitais, sugerindo livros com base em similaridade.

---

## 🧠 Objetivo

Aplicar conceitos de:

* Estruturas de dados (grafos)
* Programação orientada a objetos (POO)
* Algoritmos de recomendação
* Manipulação de coleções em Java

---

## 🗺️ Modelagem do problema

O sistema utiliza um grafo representado por:

```java
HashMap<Livro, Set<Livro>>
```

* 📌 Cada **Livro** é um nó
* 📌 Cada conjunto de livros representa **arestas (recomendações)**

As conexões são criadas com base em **similaridade de gênero**.

---

## ⚙️ Funcionalidades

* Listagem de livros disponíveis e emprestados
* Recomendação baseada em:

  * 🔎 Título
  * 🏷️ Gênero
* Exibição das relações entre livros

---

## 💡 Como funciona a recomendação

O sistema percorre o grafo e retorna livros relacionados ao nó escolhido.

Exemplo:

* Se o usuário escolher um livro de **Fantasia**
* O sistema sugere outros livros do mesmo gênero

---

## 🧱 Estrutura do projeto

```
📦 src
 ┣ 📂 model
 ┃ ┗ 📜 Livro.java
 ┣ 📂 main
 ┃ ┗ 📜 Main.java
```

---

## ▶️ Como executar

```bash
git clone https://github.com/DudaAngeli/sistema-recomendacao-livros-grafo-java.git
```

* Abra em uma IDE (IntelliJ, Eclipse ou VS Code)
* Execute `Main.java`

---

## 🚀 Possíveis melhorias

* Implementar BFS/DFS para navegação no grafo
* Adicionar pesos às recomendações
* Criar interface gráfica
* Persistência em banco de dados

---

## 👩‍💻 Autora

Eduarda Angeli

---

## 📌 Sobre o projeto

Este projeto foi desenvolvido com fins educacionais, mas estruturado para demonstrar habilidades práticas em desenvolvimento back-end e estruturas de dados.
