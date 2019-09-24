class Student{
	String name;
	int age;
	String address;

	Student(){
		name = "Unknown";
		age = 0;
		address = "not available";
	}

	void setInfo(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	void setInfo(String name,int age,String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
}

import java.util.Scanner;
class twentyone{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []name = new String[10];
		int age[] = new int[10];
		String address[] = new String[10];
		System.out.println("Enter detatils of 10 Student");
		int i;
		for(i=0;i<10;i++){
			System.out.println("Enter Name of "+i+"Student");
			name[i] = sc.nextLine();
			System.out.println("Enter Age of "+i+"Student");
			age[i] = sc.nextInt();
			System.out.println("Enter Address of "+i+"Student");
			address[i] = sc.nextLine();
		}
		System.out.println("Name\t\tAge\tAddress");
		for(i=0;i<10;i++){
			Student stu = new Student();
			stu.setInfo(name[i],age[i],address[i]);
			System.out.println(stu.name+"\t\t"+stu.age+"\t"+stu.address);
		}
	}
}
