package Facade;


import Facade.View.PersonFacade;

public class FacadeMain {
    public static void main(String[] args) {
        PersonFacade person = new PersonFacade();
        person.setInformation();
        person.display();
    }
}
