package programming;

public class Cylinder {
	Circle ci;
	private double height;
	
	public Cylinder(Circle ci, double height) {
		this.ci = ci;
		this.height = height;
	}
	
	public static double getVoulme(double circleArea,double height){
		return circleArea*height;
	}
	public static void main(String[] args){
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println("원통부피는 :"+cd.getVoulme(cd.ci.getArea(),cd.height));
	}
}
