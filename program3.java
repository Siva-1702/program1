import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
		    String num=""+i;
		    for(int j=0;j<num.length();j++){
		        if(num.charAt(j)=='1'){
		            count++;
		        }
		    }
		}
        System.out.print("The number of ones present in given range is "+count);
	}
}