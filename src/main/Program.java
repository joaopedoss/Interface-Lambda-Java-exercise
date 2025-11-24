package main;

import java.util.Scanner;

import model.Circle;
import model.Rectangle;
import model.Square;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 1;
		do {
		System.out.println("Selecione de 1 a 3:");
		System.out.println("1 - Circle");
		System.out.println("2 - Rectangle");
		System.out.println("3 - Square");
		System.out.println("Qualquer numero - Sair");
		int opcao = sc.nextInt();
		
		Runnable circleAction = () -> {
		    System.out.println("Digite o valor do raio");
		    double raio = sc.nextDouble();
		    Circle circle = new Circle(raio);
		    System.out.println("A area do circulo é: " + circle.formula());
		};

		Runnable rectangleAction = () -> {
		    System.out.println("Digite o valor do lado maior");
		    double ladoM = sc.nextDouble();
		    System.out.println("Digite o valor do lado menor");
		    double ladom = sc.nextDouble();
		    Rectangle rectangle = new Rectangle(ladoM, ladom);
		    System.out.println("A area do retangulo é: " + rectangle.formula());
		};

		Runnable squareAction = () -> {
		    System.out.println("Digite o valor do lado");
		    double lado = sc.nextDouble();
		    Square square = new Square(lado);
		    System.out.println("A area do quadrado é: " + square.formula());
		};
		switch (opcao) {
	    case 1 -> circleAction.run();
	    case 2 -> rectangleAction.run();
	    case 3 -> squareAction.run();
	    default -> start = 0;
	}
			
		} while (start!=0);
		System.out.println("");
		System.out.println("Fim do programa");
	}

}
