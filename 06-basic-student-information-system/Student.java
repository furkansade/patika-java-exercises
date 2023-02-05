public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int c1Note, int c2Note, int c3Note) {
        if (c1Note >= 0 && c1Note <= 100) {
            this.c1.note = c1Note;
        }

        if (c2Note >= 0 && c2Note <= 100) {
            this.c2.note = c2Note;
        }

        if (c3Note >= 0 && c3Note <= 100) {
            this.c3.note = c3Note;
        }

    }

    void isPass() {
        System.out.println("=================");
        double sumNotes = (this.c1.note + this.c2.note + this.c3.note);
        double numberOfCourse = 3.0;
        double avarage = (sumNotes / numberOfCourse);

        this.avarage = avarage;

        if (this.avarage >= 60) {
            System.out.println("successful!");
            this.isPass = true;
        } else {
            System.out.println("unsuccessful");
            this.isPass = false;
        }

        printNote();
    }

    void printNote() {
        System.out.printf("avarage: %.2f\n", this.avarage);
        System.out.printf("%s -> %d\n", this.c1.name, c1.note);
        System.out.printf("%s -> %d\n", this.c2.name, c2.note);
        System.out.printf("%s -> %d\n", this.c3.name, c3.note);
    }

}
