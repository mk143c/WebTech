import java.util.Scanner;
class Average{
    double a,b,c;
    Average(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double avg(){
        return (a+b+c)/3;
    }
}

class eight{

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        double b = sc.nextDouble();
        System.out.println("Enter 3rd number: ");
        double c = sc.nextDouble();

        Average obj = new Average(a,b,c);
        System.out.println("Average of three number is: "+obj.avg());

    }
}

