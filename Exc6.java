class Rectangle {
    double length;
    double width;
    double area;
    String color;

    public void set_length(double l) {
        length = l;
    }

    public void set_width(double w) {
        width = w;
    }

    public void find_area() {
        area = length * width;
    }

}


public class Exc6
{
    public static void main(String[] args)
    {
       Rectangle r1 = new Rectangle();
       r1.set_length(5);
         r1.set_width(10);
         r1.find_area();
         r1.color = "red";

         Rectangle r2 = new Rectangle();
         r2.set_length(5);
         r2.set_width(10);
            r2.find_area();
            r2.color = "red";

        if(r1.area == r2.area && r1.color.equals(r2.color)) {
            System.out.println("Matching Rectangles.");
        } else  {
            System.out.println("Non Matching Rectangles");
        } 
       }
}