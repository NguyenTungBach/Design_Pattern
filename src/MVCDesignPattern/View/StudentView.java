package MVCDesignPattern.View;

import MVCDesignPattern.Controller.StudentController;

import java.util.Scanner;

public class StudentView implements IStudentView {
    private StudentController studentController;
    private Scanner scanner;

    public StudentView() {
        this.studentController = new StudentController();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void generateMenu() {
        System.out.println("Nhập Mã");
        String studentRollNo = scanner.nextLine();
        System.out.println("Nhập tên");
        String studentName = scanner.nextLine();

        studentController.create(studentRollNo,studentName);

    }
}
