package MVCDesignPattern.Controller;

import MVCDesignPattern.Model.Student;

public class StudentController implements IStudentController {
    private Student model;

    public StudentController() {
        model= new Student();
    }

    @Override
    public void create(String studentRollNo, String studentName) {
        model.setRollNo(studentRollNo);
        model.setName(studentName);

        System.out.println("Student: ");
        System.out.println("Roll No: " + model.getRollNo());
        System.out.println("Name: " + model.getName());
    }

}
