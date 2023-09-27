import java.lang.Math;
public class TestQuadratic{
	public static void main(String[] args){
		QuadraticEquation equation = new QuadraticEquation(1, 3, -1);
		System.out.println(equation.getRoot1());
	}
}

class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	
	QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA(){
		return this.a;
	}
	public double getB(){
		return this.b;
	}
	public double getC(){
		return this.c;
	}
	public double getDiscriminant(){
		if(this.b * this.b >= 4 * this.a * this.c){
			return this.b * this.b - 4 * this.a * this. b;
		}
		else{
			System.out.println("There is not discriminant");
			return -1;
		}
	}
	public double getRoot1(){
		return(-1 * this.b + (Math.sqrt(this.b * this.b - 4 * this.a * this.c)))/this.a * 2;
	}
	public double getRoot2(){
		return(-1 * this.b + (Math.sqrt(this.b * this.b - 4 * this.a * this.c)))/2 * this.a;
	}
}