import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
		    arr[i]=sc.nextInt();
		}
        Arrays.sort(arr);
        int lostNum=-1;
        for(int i=1;i<num;i++){
            if(arr[i]-arr[i-1] > 1){
                lostNum=arr[i]-1;
            }
        }
        System.out.print("The missing number is "+lostNum);
	}
}