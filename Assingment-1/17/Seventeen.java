class Student{
	int regno,total;
	int marks[] = new int[3];
	String name;
	Student(int r,String n,int m[])
	{
		regno = r;
		name = n;
		marks = m;
		total = 0;
	}

	void totalmarks(){
		for(int i=0;i<3;i++){
			total += marks[i];
		}
	}

	void display(){
		System.out.print(regno+"\t"+name+"\t\t"+total);
	}
}

class Seventeen{
	public static void main(String[] args) {
		Student s1 = new Student(1,"xyz",{20,25,40});
		Student s2 = new Student(2,"abc",{30,25,40});
		Student s3 = new Student(3,"qwe",{20,35,40});
		Student s4 = new Student(4,"abz",{20,25,10});
		Student s5 = new Student(5,"zxv",{20,25,30});
		s1.totalmarks();
		s1.display();
		s2.totalmarks();
		s2.display();
		s3.totalmarks();
		s3.display();
		s4.totalmarks();
		s4.display();
		s5.totalmarks();
		s5.display();
	}
}
