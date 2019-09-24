import java.util.Scanner;
class Applicant{
    private long ANO;
    private String name;
    private float agg;
    private char grade;

    void Enter(long ANO, String name, float agg){
        this.ANO = ANO;
        this.name = name;
        this.agg = agg;

        GradeMe();
    }
    private void GradeMe(){
        if (agg >= 80)
            grade = 'A';
        else if(agg <80 && agg >=65)
            grade='B';
        else if(agg < 60 && agg >= 50)
            grade='C';
        else
            grade='D';
    }

    public int Result(){
        System.out.println(name+" Admission number "+ ANO + " with aggregate marks of "+agg+" got grade "+grade);
        return 0;
    }

}

class twelve{

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Admission number: ");
        long ano = sc.nextLong();
        System.out.println("Enter name of the Student: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter aggregate marks: ");
        float agg = sc.nextFloat();

        Applicant obj = new Applicant();
        obj.Enter(ano,name,agg);
        obj.Result();
    }
}

