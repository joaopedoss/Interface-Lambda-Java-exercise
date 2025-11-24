package model;

import model.interfaces.GeometricForms;

public class Square implements GeometricForms{
	private double lado;
	
	
	
	public Square(double lado) {
		this.lado = lado;
	}



	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double formula() {
		return lado*lado;
	}

}
