import java.util.Scanner;

class Area{
    double l,b;
    Area (double l, double b){
        this.l = l;
        this.b = b;
    }

    double returnArea(){
        return l*b;
    }
}

class seven{

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Reactangle: ");
        double len = sc.nextDouble();
        System.out.println("Enter the breadth of the Reactangle: ");
        double bre = sc.nextDouble();

        Area obj = new Area(len,bre);
        System.out.println("Area of the Reactangle: "+obj.returnArea());

    }
}
