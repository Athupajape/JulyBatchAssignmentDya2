package Arithmetic;

public class Assignment2 {

	//Given Expression 1
	// (((((10/2)-2)*2)-2)+2)
	
	
	public int division(int num1,int num2) {
		int s1;
		s1=num1/num2;
		return s1;
	}
	
	public int sub(int a1,int a2) {
		int y;
		y=a1-a2;
		return y;
	}
	
	public int multiply(int n1,int n2) {
		int x;
		x=n1*n2;
		return x;
	}
	
	public void sum(int d1,int d2) {
		int result;
		result=d1+d2;
		System.out.println("The final result of (((((10+2)*2)-2)*2)/2)  is : "+ result);
	}
	
	public static void main(String[] args) {
		
		Assignment2 m1=new Assignment2();
		int result1=m1.division(10,2);
		int result2=m1.sub(result1, 2);
		int result3=m1.multiply(result2, 2);
		int result4=m1.sub(result3, 2);
		m1.sum(result4, 2);
	}
}
