class fibonacci
{
    int n;
    public fibonacci(int nn)
    {
        n=nn;
    }
    public void series_fibo()
    {
        int i,a=0,b=1,c;
        for(i=0;i<n;i++)
        {
            if(i==0)
                System.out.print(a+"\t");
            else if(i==1)
                System.err.print(b+"\t");
            else
            {
                c=a+b;
                System.out.print(c+"\t");
                a=b;
                b=c;
            }
        }    
    }
}
public class Fibonacci{
    public static void main(String[] args) {
         fibonacci obj=new fibonacci(10);
    obj.series_fibo();
    }
   
}