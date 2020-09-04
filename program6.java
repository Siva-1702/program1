import java.util.*;
public class Hello {
    static int calcAngle(double h,double m){
        if(h<0||m<0||h>12||m>60){
            System.out.println("Wrong input");
        }
        if(h==12){
            h=0;
        }
        if(m==60){
            m=0;
            h+=1;
            if(h>12)
            h=h-12;
        }
        int ha=(int)(0.5*(h*60+m));
        int ma=(int)(6*m);
        int angle=Math.abs(ha-ma);
        angle=Math.min(360-angle,angle);
        return angle;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h1=sc.nextInt();
		int m1=sc.nextInt();
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		System.out.println(calcAngle(h1,m1)+" degree");
		System.out.println(calcAngle(h2,m2)+" degree");

	}
}