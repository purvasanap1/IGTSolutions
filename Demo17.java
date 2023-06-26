import java.util.Scanner;

 

abstract class Employee {
    String name;
    int id;
    int age;
    String desg;
    float salary;

 

    Employee(String desg, float salary) {
        Scanner sc = new Scanner(System.in);

 

        System.out.print("Enter your name: ");
        name = sc.next();

 

        System.out.print("Enter your id: ");
        id = sc.nextInt();

 

        System.out.print("Enter your age: ");
        age = sc.nextInt();

 

        this.desg = desg;
        this.salary = salary;
    }

    abstract void raiseSalary();
    abstract void bonus();

 

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + desg);
        System.out.println("Salary: " + salary);
        System.out.println("");
    }
}

 

class Manager extends Employee {
    Manager() {
        super("Manager", 900000);
        System.out.println("----------Manager----------");
    }

    void raiseSalary() {
        System.out.println("Salary after appraisals: " + (salary + 30000));
    }

 

    void bonus() {
        System.out.println("Bonus: " + "30000");
    }
}

 

class Developer extends Employee {
    Developer() {
        super("Developer", 45000);
        System.out.println("----------Developer----------");
    }

    void raiseSalary() {
        System.out.println("Salary after appraisals: " + (salary + 20000));
    }

 

    void bonus() {
        System.out.println("Bonus: " + "30000");
    }
}

 

class Tester extends Employee {
    Tester() {
        super("Tester", 45000);
        System.out.println("----------Tester----------");
    }

    void raiseSalary() {
        System.out.println("Salary after appraisals: " + (salary + 20000));
    }

 

    void bonus() {
        System.out.println("Bonus: " + "30000");
    }
}

 

class Clerk extends Employee {
    Clerk() {
        super("Clerk", 350000);
        System.out.println("----------Clerk----------");
    }

    void raiseSalary() {
        System.out.println("Salary after appraisals: " + (salary + 10000));
    }

 

    void bonus() {
        System.out.println("Bonus: " + "30000");
    }
}

 

class Demo17 {
    public static void main(String[] args) {

 

        Scanner sc = new Scanner(System.in);
        int num = 0;

 

        do {

 

            System.out.println("1. Manager");
            System.out.println("2. Developer");
            System.out.println("3. Tester");
            System.out.println("4. Clerk");
            System.out.println("");

 

            System.out.print("What's your Designation? Enter number: ");
            num = sc.nextInt();

 

            if (num == 1) {
                Manager manager = new Manager();
                manager.display();
                manager.raiseSalary();
                manager.bonus();
            } else if (num == 2) {
                Developer developer = new Developer();
                developer.display();
                developer.raiseSalary();
                developer.bonus();
            } else if (num == 3) {
                Tester tester = new Tester();
                tester.display();
                tester.raiseSalary();
                tester.bonus();
            } else if (num == 4) {
                Clerk clerk = new Clerk();
                clerk.display();
                clerk.raiseSalary();
                clerk.bonus();
            } else if (num >= 5) {
                System.out.println("Thank you");
                System.exit(0);
            }

 

        } while (num <= 4);
    }
}