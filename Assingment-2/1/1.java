class one
{
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent c1 = new Child();
		p.Print();
		c.Printchild();
		c1.Print();
	}
}

class Parent
{
	void Print(){
		System.out.println("This is parent class");
	}
}

class Child extends Parent
{
	void Printchild(){
		System.out.println("This is child class");
	}
}