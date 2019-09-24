import java.util.Scanner;
class Box{
    double w,h,d;

    Box(double w,double d,double h) {
        this.w = w;
        this.d = d;
        this.h = h;
    }

    double volume(){
        return h*w*d;
    }
}

class nine{

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double w = sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        double h = sc.nextDouble();
        System.out.println("Enter 3rd number: ");
        double d = sc.nextDouble();

        Box obj = new Box(w,d,h);
        System.out.println("Average of three number is: "+obj.volume());

    }
}

