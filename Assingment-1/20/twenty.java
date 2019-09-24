class RectandSqr
{
	void printArea(int l, int b)
	{
		System.out.println("Area of Perimeter = "+l*b);
	}
	void printArea(int s)
	{
		System.out.println("Area of Square = "+s*s);
	}
}

class twenty
{
	public static void main(String[] args) {
		RectandSqr r = new RectandSqr();
		r.printArea(5,6);
		r.printArea(5);
	}
}
