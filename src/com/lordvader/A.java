package com.lordvader;

public class A {

	private int a1;
	private float a2;
	private String a3;
	private String aPrinc4;
	
	
	public String getaPrinc4() {
		return aPrinc4;
	}
	public void setaPrinc4(String aPrinc4) {
		this.aPrinc4 = aPrinc4;
	}
	public String getA3() {
		return a3;
	}
	public void setA3(String a3) {
		this.a3 = a3;
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public float getA2() {
		return a2;
	}
	public void setA2(float a2) {
		this.a2 = a2;
	}
	
	public double soma(){
		return this.a1+this.a2;
	}
}
