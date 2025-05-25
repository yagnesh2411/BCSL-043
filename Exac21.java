class data
{
String yagnesh;
data(String n)
{ yagnesh=n; }
void disp()
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Name :"+yagnesh);
int c=0;
int len=yagnesh.length();
for(int i=0;i<len;i++)
if(yagnesh.charAt(i)=='A'||yagnesh.charAt(i)=='a')
{
c++;
System.out.println("number of occurance :"+c);
System.out.println("Possition :"+(i+1));
}
if(c==0)
System.out.println("there is no 'A' available in the string");
}
}
class s08_01
{
public static void main(String ar[])
{
data d1=new data("anil patel");
d1.disp();
data d2=new data("binali");
d2.disp();
}
}