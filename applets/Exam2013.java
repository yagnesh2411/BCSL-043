// Java program to show the class declaration 
// and how to create an instance of this class
//Write a Java program to create student class. Define proper constructor to initialize student class object. 
//Define methods to get details of any student (the details may include student name, address, program of study, age). 
//You need to take care of exceptions handling in this program.
//Class Declaration 
class Student {
    String name;
    int age;

    Player(String n, int a) {
        name = n;
        age = a;
    }

    void Display_Info() {
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age);
    }
  
}

public class Student
{
    // Instance Variables
    String name;
    String course;
    int age;
 
    // Constructor Declaration of Class
    public Student(String name, String course,int age)
    {
        this.name = name;
        this.course = course;
        this.age = age;
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
 

    public static void main(String[] args)
    {
        // creating object using new operator
        Student s1 = new Student("Ravi","CSE",23);
      
        System.out.println(s1.getName());
    }
}