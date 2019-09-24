class triangle{
    double a,b,c;
    triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double area(){
        return 0.5*a*b;
    }
    double perimeter(){
        return a+b+c;
    }
}

class four {
    public static void main(String[] args){
        triangle obj = new triangle(3,4,5);
        System.out.println("The area of the triangle is: " + obj.area());
        System.out.println("The perimeter of the triangle is: " + obj.perimeter());
    }
}
