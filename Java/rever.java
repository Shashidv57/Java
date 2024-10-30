class rever
{
public static void main(String[]args)
	{
	int x=123;
	reve(x);
    System.out.println(reve(x));
	}
	static int reve(int no)
	{
int res=0;
while(no!=0)
		{
	int rem=no%10;
	res=(res*10)+rem;
	no=no/10;
		}

	if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE){
		return 0;
	}
	else{
		return(int)res;
	}
	}
}