class Student {
    String name;
    int roll_no;
    long phone;

    void print(){
        System.out.println(name+" "+roll_no+" "+phone);
    }
}

class two {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.name = "John";
        obj.roll_no = 2;
        obj.phone = 123456789;
        obj1.name = "sam";
        obj1.roll_no = 1;
        obj1.phone = 98765432;

        obj.print();
        obj1.print();
    }
}
