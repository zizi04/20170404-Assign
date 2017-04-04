package programming;

public class Cylinder {
	
	public static double getVoulme(Circle cir,double height){
		return cir.getArea()*height;
	}
	public static void main(String[] args){
		Circle cir = new Circle(2.8);
		double height=5.6;
		System.out.println("반지름이 2.8,높이가 5.6인 원통부피: "+getVoulme(cir,height));
	}
}
