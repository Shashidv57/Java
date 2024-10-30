
class IfHappyGoForPrimeNumber
{
	public static void main(String[] args)
	{
		
		int no=10;
		int copy=no;
		
		//System.out.println(happyNumber(no));
		
		while(no>9)
		{
			no=happyNumber(no);
		}
		//System.out.println(no);
		
		if(no==1 || no==7)
		{
			if(prime(copy))
			{
				System.out.println(copy+" is a happy Number and also Prime Number");
			}
			else{
				System.out.println(copy+" is not a Prime Number, but is a happy Number");
			}
		}
		else{
			System.out.println(no+" is not a happy Number");
		}
		
	}
	
	
	static int happyNumber(int number)
	{
		int sum=0;
		while(number!=0)
		{
			int rem= number%10;
			sum=sum+(rem*rem);
			number=number/10;
		}
		return sum;
	}
	static boolean prime(int num)
	{
		boolean flag=true;
		for(int i=2; i<num;i++)
		{
			if(num%i==0)
				flag=false;
				break;
		}
		return flag;
		
	}
}