# Binary Search Tree (BST) em Java

Este repositório contém uma implementação simples e educativa de uma **Árvore Binária de Busca (Binary Search Tree — BST)** em Java.
A BST permite **inserir**, **buscar** e **percorrer** elementos de forma organizada e eficiente.

---

## 📌 Funcionalidades Implementadas

* Inserção de novos valores na árvore
* Busca de valores utilizando recursão
* Percurso **in-order**, exibindo os valores em ordem crescente
* Estrutura do nó representada por uma classe `Node`
* Classe principal `BinarySearchTree` contendo as operações da árvore

---

## 🧠 O que é uma Árvore Binária de Busca?

Uma **Binary Search Tree** é uma estrutura onde:

* Todo valor **menor** que o nó atual fica **à esquerda**
* Todo valor **maior** fica **à direita**
* Valores são organizados de forma hierárquica

Isso permite buscas rápidas e inserções eficientes.

---

## 🧩 Código Principal

A árvore é construída desta forma:

```java
bst.root = bst.insert(bst.root, 50);
bst.root = bst.insert(bst.root, 30);
bst.root = bst.insert(bst.root, 70);
bst.root = bst.insert(bst.root, 20);
bst.root = bst.insert(bst.root, 40);
bst.root = bst.insert(bst.root, 60);
bst.root = bst.insert(bst.root, 80);
```

Resultado do percurso **in-order**:

```
20 30 40 50 60 70 80
```

---

## 🔍 Exemplo de Busca

```java
bst.search(bst.root, 40);  // Encontrado
bst.search(bst.root, 100); // Não encontrado
```

Saída:

```
Buscando 40: Encontrado!
Buscando 100: Não encontrado.
```

---

## ▶️ Como Executar

1. Instale o Java (JDK 17 ou superior recomendado)
2. Clone este repositório:

```
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
```

3. Compile:

```
javac BinarySearchTree.java
```

4. Execute:

```
java BinarySearchTree
```

---

## 📚 Estrutura do Projeto

```
/src
 └── BinarySearchTree.java
README.md
```

---

## 🚀 Melhorias Futuras (opcional)

* Remoção de nós (delete)
* Percurso pré-ordem e pós-ordem
* Versão gráfica em JavaFX
* Implementação iterativa das funções
* Balanceamento automático (AVL ou Red-Black Tree)

---

