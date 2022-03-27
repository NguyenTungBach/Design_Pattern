package AbstractFactory.Button;

public class MacOSButton implements IButton{
    @Override
    public void paint() {
        System.out.println("MacOSButton Create Button Paint");
    }

    @Override
    public void calculator() {
        System.out.println("MacOSButton Create Button Calculator");
    }
}
