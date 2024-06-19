public class StudentModel{
    private String rollno,name;
    private int m1,m2,m3;

    public StudentModel(String rollno, String name, int m1, int m2, int m3)
    {
        this.rollno = rollno;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String getRollno() {
        return rollno;
    }
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getM1() {
        return m1;
    
    }
    public void setM1(int m1) {
        this.m1 = m1;
    
    }
    public int getM2() {
        return m2;
    
    }
    public void setM2(int m2) {
        this.m2 = m2;
    
    }
    public int getM3() {
        return m3;
    
    }
    public void setM3(int m3) {
        this.m3 = m3;
    
    }
    
    public String getResult(){
        String result="";
        if(this.m1<35||this.m2<35||this.m3<35){
            result="fail";
        }else{
            double per=(m1+m2+m3)/3;
            if(per>=75){
                result="Distinction";
            }else if(per>=60){
                result="First class";
            } else if(per>=50){
                result="Second";
            } else if(per>=35){
                result="third";
            }else{
                result="Fail";
            }
    
        }
        return result;
    
    }

    public String getGrade(){
        double per=(m1+m2+m3)/3;
        String grade="";
        if(per>=90){
            grade="A";
        }else if(per>=80){
            grade="B";
        } else if(per>=70){
            grade="C";
        } else if(per>=60){
            grade="D";
        }else{
            grade="E";
        }
        return grade;
        
    }

}