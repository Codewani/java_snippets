public class MainPoints{
	public static void main(String[] args){
		Points p = new Points(3,4);
		System.out.println(p.distance(0, 0));
		System.out.println(p.mytoString());
	}
}
class Points{
	double x = 0;
	double y = 0;
	static int numberOfPoints = 0;
	Points(double newX, double newY){
		x = newX;
		y = newY;
		numberOfPoints++;
	}
	double distance(double x1, double y1){
		return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
	}
	double distance(Points p){
		return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
	}
	double getX(){
		return x;
	}
	double getY(){
		return y;
	}
	String mytoString(){
		return "(" + x + ", " + y + ")";
	}
}



