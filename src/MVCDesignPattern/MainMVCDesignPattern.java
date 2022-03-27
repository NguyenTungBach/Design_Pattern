package MVCDesignPattern;

import MVCDesignPattern.View.StudentView;

public class MainMVCDesignPattern {
    public static void main(String[] args) {
        StudentView studentView =new StudentView();
        studentView.generateMenu();
    }
}
