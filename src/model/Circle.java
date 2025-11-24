package model;

import model.interfaces.GeometricForms;

public class Circle implements GeometricForms {
	private double raio;
	private static final double PI = 3.1415;
	
	
	public Circle(double raio) {
		this.raio = raio;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	public static double getPi() {
		return PI;
	}


	@Override
	public double formula() {
		return raio*raio*PI;
	}

}
