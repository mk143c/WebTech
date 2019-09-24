import java.util.Scanner;

class Employee{
    double sal,hours;
    void getInfo(double sal,double hours){
        this.sal = sal;
        this.hours = hours;
    }

    void AddSal(){
        if (sal < 500)
            sal = sal+10;
    }

    void AddWork(){
        if (hours > 6)
            sal = sal+5;
    }

    void printSalary(){
        System.out.println("The Final salary of the employe is: "+sal);
    }
}


class ten{

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary of Employee: ");
        double sal = sc.nextDouble();
        System.out.println("Enter number of hours of work per day: ");
        double hours = sc.nextDouble();

        Employee obj = new Employee();

        obj.getInfo(sal,hours);
        obj.AddSal();
        obj.AddWork();
        obj.printSalary();

    }
}

