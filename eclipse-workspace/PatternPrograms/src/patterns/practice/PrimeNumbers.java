package patterns.practice;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=55;
		int count=0;
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				count++;
				
			}
		}
		if(count==0) {
			System.out.println("x is prime number");
		}
		else {
			System.out.println("x is not a prime number");
		}
		

	}

}
