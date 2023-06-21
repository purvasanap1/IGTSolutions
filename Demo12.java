import java.util.Scanner;

class Emp{

    int id;

    String name;

    Scanner sc=new Scanner(System.in);

    Emp(){

        System.out.println("enter id: ");

        id=sc.nextInt();

        System.out.println("enter name: ");

        name=sc.next();

    }

}

class Clerk extends Emp{

    String desig="Clerk";

    void display() {

        System.out.println("id is: "+id);

        System.out.println("name is: "+name);

        System.out.println("desingnation is: "+desig);

    }

}

class Dev extends Emp{

    String desig="developer";

    void display() {

        System.out.println("id is: "+id);

        System.out.println("name is: "+name);

        System.out.println("designation is: "+desig);

    }

}

class Tester extends Emp{

    String desig="tester";

    void display() {

        System.out.println("id is: "+id);

        System.out.println("name is: "+name);

        System.out.println("designation is: "+desig);

    }

}

public class Demo12 {

 

    public static void main(String[] args) {


        System.out.println("=========Clerk==========");

        Clerk clerk=new Clerk();

        clerk.display();

        System.out.println("=========Developer==========");

        Dev dev=new Dev();

        dev.display();

        System.out.println("=========Tester==========");

        Tester tester=new Tester();

        tester.display();

        

 

    }

 

}