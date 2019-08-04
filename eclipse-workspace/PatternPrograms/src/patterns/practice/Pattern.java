package patterns.practice;

public class Pattern {
	//1
	//12
	//123
	//1234
	//12345

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		
		//12345 
		//1234
		//123
		//12
		//1
		
		int k,l=5;
		for(k=5;k>=1;k--) {
			for(l=1;l<=k;l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		

	}

}
