package loop.demo;

import java.util.Arrays;
import java.util.Scanner;

public class NegArray {
		//finding Negative numbers in array and store it in another array
	public static void main(String[] args) {
	
	int []arr= {10,-20,-30,40,50};
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
		}
		int j=0;
		int [] negtivearray=new int[count];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<0) {
					negtivearray[j]=arr[i];
					j++;
					
				}
				if(count==j) {
					break;
				}
			}
			System.out.println(Arrays.toString(negtivearray));
		
	}
	

}
