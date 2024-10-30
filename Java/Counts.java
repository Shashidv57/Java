class Sample
{
void range()
{
int count=0;
for(int i=1;i<=20;i++)
{
if(i%2==0)
{
count++;
}
}
System.out.println(count);
}
}
class Counts
{
public static void main(String[]args)
{
Sample s1=new Sample();
s1.range();
}
}