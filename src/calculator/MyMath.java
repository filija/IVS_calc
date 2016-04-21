package calculator;

public class MyMath{
	
	public static double plus(double a, double b)
	{
		return a+b;
	}
	
	public static double minus(double a, double b)
	{
		return a-b;
	}
	
	public static double krat(double a, double b)
	{
		return a*b;
	}
	
	public static double deleno(double a, double b)
	{
		return a/b;
	}
	
	public static double naDruhou(double a)
	{
		return a*a;
	}
	
	public static double naEntou(double a, int exp)
	{
		double result=1;
		for(int i=0; i<exp; i++)
		{
			result*=a;
		}
		
		return result;
	}
	
	public static double odmocnina(double a)
	{
		return Math.sqrt(a);
	}
	
	public static int faktorial(int a)
	{
		int x, fact=1;
		for(x=a; x>1; x--)
		{
			fact*=x;
		}
		
		return fact;
	}
	
	public static int modulo(int a, int b)
	{
		return a%b;
	}
	
}