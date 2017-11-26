
public class Factorial {

	public static void main(String[] args) 
	{
		int sum = 0;
		int a[] = {1,2,3,4,5};
		
		for(int num : a)
		{
			sum = sum+num;
			
		}
		System.out.println("sum is " +sum);
		
		
		int fact=1;
		int number = 5;
		for(int i = 1 ; i<= number ; i++)
		{
			fact = fact*i;
			
			
		}
		System.out.println(fact);
	
	
	}
	
	

}
