import java.util.Scanner;

class Rectangle

{

double length,width,area;

String colour;

Scanner obj=new Scanner(System.in);

double get_length()

{

System.out.println("Enter the length");

length=obj.nextDouble();

return length;

}

double get_width()

{

System.out.println("Enter the width");

width=obj.nextDouble();

return width;

}

double find_area()

{

area=length*width;

return area;

}

String get_colour()

{

System.out.println("Enter colour");

colour=obj.next();

return colour;

}

}

class Exp3

{

public static void main(String[] args)

{

Rectangle r1= new Rectangle();

Rectangle r2= new Rectangle();

r1.get_length();

r1.get_width();

String c1=r1.get_colour();

double a=r1.find_area();

r2.get_length();

r2.get_width();

String c2=r2.get_colour();

double b=r2.find_area();

if(a==b && c1==c2)

System.out.println("The rectangles are identical");

else

System.out.println("The rectangles are different");

}

}
