package model;

import model.interfaces.GeometricForms;

public class Rectangle implements GeometricForms{
	private double lado;
	private double lado2;
	
	
	
	public Rectangle(double lado, double lado2) {
		this.lado = lado;
		this.lado2 = lado2;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado) {
		this.lado2 = lado;
	}

	@Override
	public double formula() {
		return lado*lado2;
	}

}
