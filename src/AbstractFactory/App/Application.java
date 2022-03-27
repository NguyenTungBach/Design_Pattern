package AbstractFactory.App;

import AbstractFactory.Button.IButton;
import AbstractFactory.Factory.IFactory;

public class Application {
    // nơi ứng dụng tạo tính năng
    private final IButton button;

    // các tính cho ứng dụng
    public Application(IFactory factory) {
        button = factory.createButton();
    }

    // tạo tính năng
    public void createGUI(){
        button.paint();
        button.calculator();
    }
}
