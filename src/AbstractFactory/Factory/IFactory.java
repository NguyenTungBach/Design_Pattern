package AbstractFactory.Factory;

import AbstractFactory.Button.IButton;

public interface IFactory {
    //Quản lý những tính năng cần có
    IButton createButton();
}
