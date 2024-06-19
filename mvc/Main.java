import java.util.*;

public class Main{
    public static void main (String[] args){
        String rNo,sName;
        int m1,m2,m3;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter roll number :");
        rNo=sc.nextLine();

        System.out.print("Enter NAME :");
        sName=sc.nextLine();

        System.out.print("Marks in three subject :");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        StudentModel model=new StudentModel(rNo, sName, m1, m2, m3);
        StudentView view=new StudentView();

        StudentController controller=new StudentController(model,view);
        controller.updateView();
    }
}