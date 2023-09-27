import jave.util.Math;
public interface Objects{
	public int getPerimeter();
	public int getArea();
}
public class Cirle2D implements Objects{
	double x;
	double y;
	double radius;
	double PI = 3.142
	Circle2D(){
		this(0, 0, 1);
	}
	Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getPerimeter(){
		return 2 * PI * this.radius;
	}
	public double getArea(){
		return PI * this.radius * this.radius;
	}
	public boolean containsPoint(double x, double y){
		//distance between point and center
		distanceBetween = Math.Sqrt(Math.Pow(this.x - x, 2) + Math.Pow(this.y - y, 2));
		if(distanceBetween < this.radius)
			return true;
		return false;
	}
	public boolean containsCircle(Circle2D circle){
		//distance between "this" circle's center and the other circle's center
		double distanceBetween = Math.Sqrt(Math.Pow(circle.x - this.x, 2) + Math.Pow(circle.y - this.y, 2));
		//sum of 'distanceBetween' and radius of the other circle
		double sum = distanceBetween + circle.radius;
		if(sum < this.radius && containsPoint(circle.x, circle.y)
			return true;
		return false;
	}
	public boolean overlaps(Circle2D circle){
		//distance between the centers of the two circles
		double distanceBetween = Math.Sqrt(Math.Pow(circle.x - this.x, 2) + Math.Pow(circle.y - this.y, 2));
		//sum of the radii of the two circles
		double sum = this.radius + circle.radius;
		if(distanceBetween < sum)
			return true;
		return false;
	}
}
			
	