package loop.demo;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Value:");
		 int no=sc.nextInt();
		 
		 int m=no,c=0,temp;
		 while(no>0) {
			 temp=no%10;
			 c=c+(temp*temp*temp);
			 no=no/10;
		 }
		 if(m==c) {
			 System.out.println("Armstrong number");
		 }
		 else {
			 System.out.println("Not a Armstrong number");
		 }

	}

}
