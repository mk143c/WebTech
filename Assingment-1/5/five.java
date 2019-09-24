class rectangle{
    int l,b;

    rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int area(){
        return l*b;
    }
}

class five {
    public static void main(String[] args){
        rectangle obj = new rectangle(4,5);
        rectangle obj1 = new rectangle(5,8);

        System.out.println("The area of rectangle 1 is: "+obj.area());
        System.out.println("The area of rectangle 2 is: "+obj1.area());
    }
}
