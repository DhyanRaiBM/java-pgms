public class StudentController{
    StudentModel model;
    StudentView view;
    
    public StudentController(StudentModel model,StudentView view){
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        view.displayResult(model.getRollno(), model.getName(), model.getM1(), model.getM2(), model.getM3(), model.getResult(), model.getGrade());
        
    }
}