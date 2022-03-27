package Facade.Entity;

public class Name {
    String firstName;
    String lastName;

    public Name() {
    }

    public void display() {
        System.out.println("Name: " + this.firstName + " " + " " + this.lastName);
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
