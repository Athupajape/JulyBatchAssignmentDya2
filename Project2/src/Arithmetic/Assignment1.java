package Arithmetic;

public class Assignment1 {

	//Given Expression 1
	// (((((10+2)*2)-2)*2)/2)
	
	
	public int sum(int num1,int num2) {
		int s1;
		s1=num1+num2;
		return s1;
	}
	
	public int multiply(int n1,int n2) {
		int x;
		x=n1*n2;
		return x;
	}
	
	public int sub(int a1,int a2) {
		int y;
		y=a1-a2;
		return y;
	}
	
	public void division(int d1,int d2) {
		int result;
		result=d1/d2;
		System.out.println("The final result of (((((10+2)*2)-2)*2)/2)  is : "+ result);
	}
	
	public static void main(String[] args) {
		
		Assignment1 obj=new Assignment1();
		int result1=obj.sum(10, 2);
		int result2=obj.multiply(result1, 2);
		int result3=obj.sub(result2,2);
		int result4=obj.multiply(result3, 2);
		obj.division(result4, 2);
	}
}
