package loop.demo;
import java.util.Scanner;
public class MultiDimensionalArray {

	public static void main(String[] args) {
		int value=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows you want: ");
		 int row=sc.nextInt();
		 System.out.println("Enter the col you want: ");
		 int col=sc.nextInt();
		 
		 int [][]arr=new int [row][col];
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 arr[i][j]=value;
				 value++;
			 }
		 }
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		

	}

}
