import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Sade", "555555555", "MTH");
        Teacher teacher2 = new Teacher("Jenny", "4867895674", "CHM");
        Teacher teacher3 = new Teacher("Jenny", "4867895674", "PHY");

        // teacher1.print();

        Course math = new Course( "Math", "MTH101", "MTH");
        math.addTeacher(teacher1);

        Course chemical = new Course("Chemical", "CHM301", "CHM");
        chemical.addTeacher(teacher2);

        Course physical = new Course("Physical", "CHM301", "PHY");
        physical.addTeacher(teacher3);

        Student student1 = new Student("Johnny Travolta", "176", "11", math, chemical, physical);
        student1.addBulkExamNote(60,120,90);
        student1.isPass();


    }
}


