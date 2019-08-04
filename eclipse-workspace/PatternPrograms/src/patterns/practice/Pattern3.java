package patterns.practice;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<i+1;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		char ch='A';
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(ch);
				ch++;
			}
			
			System.out.println();
			
		}
	}

}
