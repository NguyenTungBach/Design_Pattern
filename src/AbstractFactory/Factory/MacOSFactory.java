package AbstractFactory.Factory;

import AbstractFactory.Button.IButton;
import AbstractFactory.Button.MacOSButton;

public class MacOSFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }
}
