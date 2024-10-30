class Palindrome
{
static String rever()
{
String str="appa";
String res="";
for(int i=str.length()-1;i>=0;i--)
{
res=res+str.charAt(i);
}
if(str.equals(res))
{
return("palindrome");
}
else
{
return("not a Palindrome");
}
}
public static void main(String[]args)
{
String s1=rever();
System.out.println(s1);
}
}