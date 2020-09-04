import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number==0){
		    System.out.print(0);
		    return;
		}
		if(number%9==0){
		    System.out.println(9);
		    return;
		}
		System.out.print(number%9);

	}
}