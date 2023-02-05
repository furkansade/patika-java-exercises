public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.printf("Teacher name: %s\n", this.name);
        System.out.printf("Teacher phone number: %s\n", this.mpno);
        System.out.printf("Teacher branch: %s\n", this.branch);
    }

}
