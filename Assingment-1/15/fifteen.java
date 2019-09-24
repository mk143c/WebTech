class AddAmount{
	double amt = 50;

	AddAmount(){
		System.out.println("Piggie Bank Balance = "+amt);
	}
	AddAmount(double a){
		amt +=a;
		System.out.println("Piggie Bank Balance = "+amt);
	}
}

class fifteen
{
	public static void main(String[] args) {
		AddAmount a = new AddAmount();
		AddAmount b = new AddAmount(60);
		AddAmount c = new AddAmount();
	}
}
