package loop.demo;

public class SumArray {

	public static void main(String[] args) {
		int []ar= {15,17,19,23,25};
	//	int total=0;
		int i=0;
		
//		for(i=0;i<ar.length;i++) {
//			total=total+ar[i];
//			System.out.println(total);
//		}
		
	//in this program we adding odd numbers of length	
//		int b=0;
//		for(i=0;i<ar.length;i++) {
//		
//			if(i%2!=0) {
//				
//				b=b+ar[i];
//			}
//			
//		}
//		System.out.println(b);
		
		//printing all ar variables;
		System.out.print("{");
		for(i=0;i<ar.length;i++) {
			System.out.print(ar[i]+",");
		}
		System.out.print("}");
		
		
	}

}
