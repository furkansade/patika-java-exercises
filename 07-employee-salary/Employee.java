public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0;

        if (salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    int bonus() {
        int bonus = 0;

        if (workHours > 40) {
            bonus = (workHours - 40) * 300;
        }
        return bonus;
    }

    double raiseSalary() {
        double raise = 0;

        if (hireYear <= 9) {
            raise = salary * 0.05;
        } else if (hireYear > 9 && hireYear < 20) {
            raise = salary * 0.1;
        } else if (hireYear >= 20) {
            raise = salary * 0.15;
        }
        return raise;
    }

    void printEmployeeInfo() {
        double totalsalary = this.salary + this.bonus() - this.tax();
        System.out.printf("name: %s\n", this.name);
        System.out.printf("salary: %.2f\n", this.salary);
        System.out.printf("weekly working hours: %d\n", this.workHours);
        System.out.printf("hire year: %d\n", this.hireYear);
        System.out.printf("bonus: %d\n", this.bonus());
        System.out.printf("tax: %.2f\n", this.tax());
        System.out.printf("total salary: %.2f\n", totalsalary);
    }
}
