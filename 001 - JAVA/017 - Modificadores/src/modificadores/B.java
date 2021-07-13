package modificadores;

class B {

	String b;
	
	B() {
		this.b = "Hola desde B";
	}
	
	String getB() { return this.b;}
	
	void setB(String b) { this.b = b;}
	
	//String aMasB(A a) { return a.getA() + b; } No se puede usar, A esta en otro package
}
