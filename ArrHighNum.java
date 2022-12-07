package loop.demo;
import java.util.Scanner;
public class ArrHighNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length:");
		int len=sc.nextInt();
		int []arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		findBigNumber(arr);
	}
	static void findBigNumber(int []arr) {
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
			
		}
		System.out.println("The biggest number in Array is "+temp);
	}

}
