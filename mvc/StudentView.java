public class StudentView {
    public void displayResult(String rNo, String sName, int m1, int m2, int m3, String result, String grade){
        System.out.println("------------------------------------------------------");
        System.out.println("Name : " + sName);
        System.out.println("Roll : " + rNo);
        System.out.println("Marks1 : " + m1);
        System.out.println("Marks2 : " + m2);
        System.out.println("Marks3 : " + m3);
        System.out.println("Result : " + result);
        System.out.println("Grade : " + grade);
        System.out.println("------------------------------------------------------");
    }
}