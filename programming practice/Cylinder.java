package programming;

public class Cylinder {
	public static double getVolume(Circle cir,double height){
		return cir.getArea()*height;
	}
	public static void main(String[] args){
		Circle cir = new Circle(2.8);
		double height = 5.6;
		System.out.println("������2.8 ����5.6�� ������ ���� :"+getVolume(cir,height));
	}
}
