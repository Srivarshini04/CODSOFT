import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of subjects=");
        float sum=0;
        char grade;
        int sub=sc.nextInt();
        float marks[]=new float[sub];
        System.out.println("Enter marks in each subject out of 100");
        for(int i=0;i<sub;i++)
        {
            System.out.print("Enter marks in subject "+ (i+1)+"=");
            marks[i]=sc.nextFloat();
        }
        for(int i=0;i<sub;i++)
        {
            sum+=marks[i];
        }
        float percent=sum/sub;

        if(percent>=90)
        {
            grade='A';
        }
        else if(percent>=80&&percent<=89)
        {
            grade='B';
        }
        else if(percent>=70&&percent<=79)
        {
            grade='C';
        }
        else if(percent>=60&&percent<=69)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }
        
        System.out.println("The Total marks of student="+sum);
        System.out.println("The percentage of student="+percent+"%");
        System.out.println("The grade of the student="+grade);
        sc.close();

    }
    
}
