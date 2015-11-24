package oop1;

public class Circulo {

	
	private double radio ;
	
	public Circulo(){
	
	}

	public void setRadio(double radioParam){
		this.radio=radioParam;
	}
	public double getRadio1 (){
		return this.radio;
	}
	
	public Circulo (double radioParam ){
		this.radio=radioParam;
	}
	public double getArea (){
		return Math.PI*radio*radio;
	}

	}


