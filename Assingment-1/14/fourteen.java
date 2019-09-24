class Recatangle{
	int len,bre;
	Recatangle(){
		len=0;
		bre=0;
	}
	Recatangle(int l,int b){
		len = l;
		bre = b;
	}
	Recatangle(int s){
		len = s;
		bre = s;
	}
	int area(){
		return l*b;
	}
}

class fourteen{
	public static void main(String []args)
	{
		Recatangle r1 = new Recatangle();
		Recatangle r2 = new Recatangle(5,6);
		Recatangle r3 = new Recatangle(5);
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(r3.area());
	}
}
