package 과제;
import java.util.*;
public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random r = new Random();
       int num1 = r.nextInt(6) + 1; 
       int num2 = r.nextInt(6) + 1;
       double abc = num1 + num2;
       double bcd = abc/2;
       System.out.println(num1);
       System.out.println(num2);
       System.out.println(abc);
       System.out.println(bcd);
	}

}
