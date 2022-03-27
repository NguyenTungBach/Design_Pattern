package AbstractFactory;

import AbstractFactory.App.Application;
import AbstractFactory.Factory.IFactory;
import AbstractFactory.Factory.MacOSFactory;
import AbstractFactory.Factory.WindowsFactory;

public class MainAbstractFactory {
    // Tạo ra giao diện ứng dụng GUI cho ứng dụng cho các hệ điều hành
    public static void main(String[] args) {
        Application app;
        IFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(); // lấy ra hệ điều hành
        if (osName.contains("windows")){
            factory = new WindowsFactory(); // Các tính năng cần có
            app = new Application(factory); // Ứng dụng sẽ cần những tính năng này
        }
        else {
            factory = new MacOSFactory();
            app = new Application(factory);
        }
        System.out.println("Hệ điều hành ở đây là: "+osName);
        System.out.println("Tiến hành tạo giao diện ứng dụng cho: "+osName);
        app.createGUI();
    }
}
