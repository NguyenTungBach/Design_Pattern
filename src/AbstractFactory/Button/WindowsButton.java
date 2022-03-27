package AbstractFactory.Button;

public class WindowsButton implements IButton{
    @Override
    public void paint() {
        System.out.println("WindowsButton Create Button Paint");
    }

    @Override
    public void calculator() {
        System.out.println("WindowsButton Create Button Calculator");
    }
}
