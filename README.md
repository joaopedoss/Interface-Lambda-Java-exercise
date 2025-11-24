# Sistema de Cálculo de Áreas Geométricas (Java)

Este projeto em Java permite ao usuário calcular áreas de diferentes formas geométricas utilizando POO, interfaces e expressões lambda.

---

## Funcionalidades

-Escolha entre as formas:

-Círculo

-Retângulo

-Quadrado

-Entrada de valores via teclado (Scanner)

-Cálculo da área utilizando o método formula() da interface GeometricForms

-Uso de lambda expressions para organizar as ações do menu

-Estrutura simples, limpa e fácil de expandir

---

## Tecnologias Utilizadas

-Java 17+

-Programação Orientada a Objetos

-Interfaces

-Lambdas (Runnable)

-Estruturas de repetição e decisão

---

## Estrutura do Projeto
src/
 ├── main/
 │    └── Program.java
 ├── model/
 │    ├── Circle.java
 │    ├── Rectangle.java
 │    └── Square.java
 └── model/interfaces/
      └── GeometricForms.java

---

## Como Executar

Compile o projeto:

javac main/Program.java


Execute:

java main.Program


Escolha uma das opções exibidas no menu:

1 - Circle
2 - Rectangle
3 - Square
Outro número - Sair

---

## Exemplo de Uso
```java
Selecione de 1 a 3:
1 - Circle
2 - Rectangle
3 - Square
Qualquer numero - Sair
1
Digite o valor do raio
5
A area do circulo é: 78.53750000000001
```

---

## Interface GeometricForms

Todas as formas implementam:

public interface GeometricForms {
    double formula();
}

---

## Uso de Lambda

```java
//As ações do menu são funções lambda:

Runnable circleAction = () -> {
    System.out.println("Digite o valor do raio");
    double raio = sc.nextDouble();
    Circle circle = new Circle(raio);
    System.out.println("A area do circulo é: " + circle.formula());
};


//Isso deixa o switch mais limpo:

switch (opcao) {
    case 1 -> circleAction.run();
    case 2 -> rectangleAction.run();
    case 3 -> squareAction.run();
    default -> start = 0;
}


```

---

## Objetivo Didático
Este projeto foi criado para:

✔️ Praticar POO

✔️ Usar interfaces corretamente

✔️ Entender lambdas na prática

✔️ Trabalhar com Scanner

✔️ Criar um menu simples em Java
