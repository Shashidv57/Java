class Disarium
{
public static void main(String[]args)
{
int no=135;
int n=no;
int copy=no;
int sum=0;
int count=0;
while(n!=0)
{
n=n/10;
count++;
}
while(no!=0)
{
int rem=no%10;
sum+=Math.pow(rem,count);
count--;
no=no/10;
}
if(copy==sum)
{
System.out.println(copy+" Disarium "+ sum);
}
else
{
System.out.println(copy+" not disarium "+sum);
}
}
}