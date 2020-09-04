import java.util.*;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int number= sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("Enter "+i+"student quaterly marks");
            int m1=sc.nextInt();
            int m2=sc.nextInt();
            int m3=sc.nextInt();
            int m4=sc.nextInt();
            int m5=sc.nextInt();
            System.out.println("  English Mark "+m1);
            System.out.println("  Tamil Mark "+m2);
            System.out.println("  Maths mark"+m3);
            System.out.println("  science Mark"+m4);
            System.out.println("  social Mark"+m5);
            System.out.println("Enter half yearly marks");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            int n4=sc.nextInt();
            int n5=sc.nextInt();
            System.out.println("  English Mark "+n1);
            System.out.println("  Tamil Mark "+n2);
            System.out.println("  Maths mark"+n3);
            System.out.println("  science Mark"+n4);
            System.out.println("  social Mark"+n5);
            System.out.println("Average mark of "+i+"student");
            System.out.println("English "+(m1+n1)/2.0);
            System.out.println("Tamil "+(m2+n2)/2.0);
            System.out.println("Maths "+(m3+n3)/2.0);
            System.out.println("science "+(m4+n4)/2.0);
            System.out.println("social "+(m5+n5)/2.0);

        }
    }
}