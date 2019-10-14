

interface IntOperations{
	public void checkInteger(); //which tells the detail about an integer like positive or negative.
}

class Mynumber implements IntOperations{
	int n;
	Mynumber(){
		n=0;
	}
	Mynumber(int n)
	{
		this.n = n;
	}
	public void checkInteger()
	{
		if(n>0)
		{
			System.out.println("Positive");
		}
		if(n<0)
		{
			System.out.println("Negative");
		}
		if(n%2==0){
			System.out.println("Even");
		}
		if(n%2!=0){
			System.out.println("Odd");
		}
	}
}

class Nineteen 
{
	public static void main(String[] args) {
		Mynumber m = new Mynumber(Integer.valueOf(args[0]));
		m.checkInteger();
	}
}