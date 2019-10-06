class Rectangle{
	double l,b;
	Rectangle(double l , double b)
	{
		this.l = l;
		this.b = b;
	}

	double area()
	{
		return l*b;
	}

	double perimeter()
	{
		return 2*(l+b);
	}
}

class Square extends Rectangle{
	Square(double s){
		super(s,s);
	}
}

class six
{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5.0,4.0);
		Square s = new Square(5.0);
		System.out.println("Area of Rectangle = "+r.area());
		System.out.println("Perimeter of Rectangle = "+r.perimeter());
		System.out.println("Area of Square = "+s.area());
		System.out.println("Perimeter of Square = "+s.perimeter());
	}
}