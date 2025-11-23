import java.util.Random;  
import java.util.Vector;  
  
abstract class Student {  
    private String name;  
    private int roll;  
    private String dept;  
  
    Student(String name, int roll, String dept) {  
        this.name = name;  
        this.roll = roll;  
        this.dept = dept;  
    }  
  
    abstract String school();  
  
    void printInfo() {  
        System.out.print(  
                "Name: " + this.name +  
                        " Roll: " + this.roll +  
                        " Dept.: " + dept +  
                        " School : " + school() +  
                        "\n"  
  
        );  
    }  
  
}  
  
class engineeringSchool extends Student {  
    engineeringSchool(String name, int roll, String dept) {  
        super(name, roll, dept);  
    }  
  
    @Override  
    String school() {  
        return (" School of Engineering");  
    }  
}  
  
class humanitiesSchool extends Student {  
    humanitiesSchool(String name, int roll, String dept) {  
        super(name, roll, dept);  
    }  
  
    @Override  
    String school() {  
        return (" School of Humanities");  
    }  
}  
  
  
public class Main {  
    public static void main(String[] args) {  
        engineeringSchool es = new engineeringSchool("Rahi", 122, "ICT");  
        Student hs = new humanitiesSchool("Sad", 131, "BBA");  
        es.printInfo();  
        hs.printInfo();  
    }  
}
