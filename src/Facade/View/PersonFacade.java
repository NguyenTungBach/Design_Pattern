package Facade.View;

import Facade.Entity.Address;
import Facade.Entity.Name;

import java.util.Scanner;

public class PersonFacade {
    private Name name;
    private Address address;
    private Scanner scanner;

    public PersonFacade() {
        this.name = new Name();
        this.address = new Address();
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        this.name.display();
        this.address.display();
        System.out.println("-------------------------------------------");
    }

    public void setInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap duong: ");
        String street = scanner.nextLine();
        System.out.print("nhap thanh pho: ");
        String city = scanner.nextLine();
        System.out.print("nhap quoc gia: ");
        String country = scanner.nextLine();
        System.out.print("nhap ho: ");
        String firstName = scanner.nextLine();
        System.out.print("nhap ten: ");
        String lastName = scanner.nextLine();
        this.address = new Address(city, street, country);
        this.name = new Name(firstName, lastName);

    }
}
