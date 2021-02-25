import java.util.Scanner;
import java.lang.Math;

public class btvn_giaiphuongtrinh {
    public static void main(String[] args) {
	System.out.println("MENU:");
	System.out.println(" [1].a*x + b = 0\n [2].a1*x + b1*y = c1 vs a2*x + b2*y = c2\n [3].a*x^2 + b*x = c\n");
	Scanner myObj = new Scanner(System.in);
	int n;
	System.out.println("ban chon chuc nang: ");
	n = myObj.nextInt();
	//
	switch(n) {
	    //1. phuong trinh bac nhat.
	case 1: {
	    float a, b;
	    System.out.println("nhap a: ");
	    a = myObj.nextFloat();
	    System.out.println("nhap b: ");
	    b = myObj.nextFloat();
	    if(a == 0) {
		if(b == 0) System.out.println("vo so nghiem");
		else System.out.println("vo nghiem");
	    }
	    else System.out.println("x = "+ (-b/a));
	}
	    break;
	case 2: {
	    float a1, b1, c1, a2, b2, c2, d, dx, dy;
	    System.out.println("nhap gia tri a1, b1, c1 [a1 b1 c1]: ");
	    a1 = myObj.nextFloat();
	    b1 = myObj.nextFloat();
	    c1 = myObj.nextFloat();
	    System.out.println("nhap gia tri a2, b2, c2 [a2 b2 c2]: ");
	    a2 = myObj.nextFloat();
	    b2 = myObj.nextFloat();
	    c2 = myObj.nextFloat();

	    d = a1*b2 - a2*b1;
	    dx = c1*b2 - c2*b1;
	    dy = a1*c2 - a2*c1;
	    if( d == 0 ) {
		if(dx + dy == 0)
		    System.out.println("vo so nghiem");
		else
		    System.out.println("vo nghiem");
	    }
	    else {
		System.out.println("x= " + dx/d + "\ny= " + dy/d);
	    }
	}
	    break;
	case 3: {
	    float a, b, c, delta;
	    System.out.println("nhap gia tri a b c [a b c]: ");
	    a = myObj.nextFloat();
	    b = myObj.nextFloat();
	    c = myObj.nextFloat();
	    if( a == 0) {
		if(b == 0) {
		    if(c == 0) System.out.println("vo so nghiem");
		    else System.out.println("vo nghiem");
		}
		else System.out.println("x = "+ (c/b));
	    }
	    else{
		delta = b*b - 4*a*c;
		if(delta<0) System.out.println("vo nghiem");
		if(delta == 0) System.out.println(" x1 = x2 = " + (-b/(2*a)) );
		else {
		    float k = (float)Math.sqrt(delta);
		    float x1 = (-b-k)/(2*a), x2 = (-b+k)/(2*a);
		    System.out.println("x1 = " + x1 + "\nx2 = " + x2);
		}
	    }
	    
	}
	    break;
	default: System.out.println("ERROR!");
	}
    }
}
	
