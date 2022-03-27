package AbstractFactory.Factory;

import AbstractFactory.Button.IButton;
import AbstractFactory.Button.WindowsButton;

public class WindowsFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
