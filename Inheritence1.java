//7.Write a program where a class `Person` is extended by classes `Teacher` and `Student`. 
//Add methods specific to each subclass and show how inheritance allows you to reuse the 
//common attributes from the `Person` class.

class Person{
    private String name; 
    private String profession;
    private int age;
    Person(String name,String profession,int age){
        this.name=name;
        this.profession=profession;
        this.age=age;
    }
    public void printDetails(){
        System.out.println("Name: "+name+"\nProfession: "+profession+"\nAge: "+age);
    }
}
class Teacher extends Person{
    Teacher(){
        super("mithun", "Teacher", 45);
    }
    
}
class Student extends Person{
    Student(){
        super("lokesh", "Student", 21);
    }
}
public class Inheritence1 {
    public static void main(String[] args) {
        Person t = new Teacher();
        t.printDetails();
        Person s = new Student();
        s.printDetails();
    }
}