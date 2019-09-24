class PrintNumber{
	void printn(int a){
		System.out.println("Integer");
	}
	void printn(float a){
		System.out.println("Float");
	}
	void printn(double a){
		System.out.println("Double");
	}
	void printn(long a){
		System.out.println("Long");
	}
}

class eighteen
{
	public static void main(String[] args) {
		PrintNumber p1 = new PrintNumber();
		p1.println(5);
		p1.println(5.5);
		p1.println(5.05050505);
		p1.println(989795269900);
	}
}
