package hw5;

class B extends A{
	B(){System.out.println("B()");}
	static void s(){System.out.println("B.s()");}
	void m(){System.out.println("B.m()");}
	void f(){
		super.m(); 
		C obja= (C) this;
		obja.m();
		this.m();
	}
}
