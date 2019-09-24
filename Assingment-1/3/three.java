class triangle{
    int a,b,c;
    triangle(){
        a = 3;
        b = 4;
        c = 5;
    }

    int perimeter(){
        return a+b+c;
    }
}

class three {
    public static void main(String[] args){
        triangle obj = new triangle();
        System.out.println("The perimeter of the triangle is: " + obj.perimeter());
    }
}
