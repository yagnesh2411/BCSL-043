class Strings
{
    String name;
    Strings(String n){name=n;}
    void String_find()
    {
        int i,cnt=0;
        int l=name.length();
        for(i=0;i<l;i++)
        {
            char ch=name.charAt(i);
            if(ch=='a'||ch=='A')
            {
                System.out.println("a occurs at positon"+i);
                cnt++;
            }
        }
        System.out.println("number of times a occurs in a name:"+cnt);
    }
}
public class Exce21 {
    public static void main(String[] args) {
        Strings obj=new Strings("MaheshA");
        obj.String_find();
    }
    
}