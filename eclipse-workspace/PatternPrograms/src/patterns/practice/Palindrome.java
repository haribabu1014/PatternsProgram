package patterns.practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k="radar";
		String revString="";
		
		for(int i=k.length()-1;i>=0;i--) {
			revString=revString+k.charAt(i);
			
		}
			
		System.out.println(revString);
			
		if(k.equals(revString)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		int x=101;
		//String y=Integer.toString(x);
		
		}
	
	
		
	
	

}
