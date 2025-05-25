public class Palindrome {

     public static void main(String[] args)
     {
        String s1 = "Indira Gandhi National Open University";
        System.out.println("Original String Lengh: " + s1.length());
        StringBuffer s2 = new StringBuffer(s1);
        System.out.println("Reverse of String: " + s2.reverse());
        System.out.println(s1.equals(s2.toString()) ? "Palindrome" : "Not Palindrome");
     }
}