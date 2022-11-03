package test1;

public class Sample1 
{
	public static void main(String[] args) 
	{	
		Addition();
		Addition(50,50,60);
		
		Sample2		S1=new		Sample2();
		S1.M6("Rohit");
		
		S1.M6("rahul");
	}
	
	public static void Addition()
	{

		int a=10;
		int b=20;
		int Sum=a+b;
		
		System.out.println(Sum);
		
	}
	public static void Addition(int a ,int b, int c)
	{
		int Sum1=a+b+c;
		
		System.out.println(Sum1);
		
		
		
	}
	
	
	
}
