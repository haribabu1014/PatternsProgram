package patterns.practice;

public class SwappingWithOutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=5;
		x=x+y;//x becoms 15
		y=x-y;//y becomes 10
		x=x-y;//x becomes 5
		System.out.println("after swapping:" +"x:"+ x +" " + "y:"+ y);
		
		String a="love";
		String b="you";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("after swapping:" +"x:"+ a +" " + "y:"+ b);
		
		
				

	}

}
