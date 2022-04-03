package Refactor;

import Refactor.ModeFacade.ModelFacade;
import Refactor.ModelObserver.DesktopFrontend;
import Refactor.ModelObserver.ModelIObserver;
import Refactor.ModelObserver.WebFrontend;

import java.util.Scanner;

public class MainRefactor {
    private static ModelIObserver modelIObserver;

    public static void main(String[] args) {
        ModelFacade modelFacade = new ModelFacade();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Facade Manager");
            System.out.println("==========================");
            System.out.println("1. DesktopFrontend");
            System.out.println("2. WebFrontend");
            System.out.println("0. Exit");
            System.out.println("==========================");
            System.out.println("Please enter your choice (0-2)");
            int choiceObserver = scanner.nextInt();
            switch (choiceObserver){
                case 1:
                    while (true) {
                        System.out.println("==========================");
                        System.out.println("1. Add Staff");
                        System.out.println("2. Add Customer");
                        System.out.println("3. Add Vehicle");
                        System.out.println("0. Back");
                        System.out.println("==========================");
                        System.out.println("Please enter your choice (0-3)");

                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice){
                            case 1:
                                ModelFacade.action = Action.AddStaff;
                                modelIObserver = new DesktopFrontend("Nhan vien A");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new DesktopFrontend("Nhan vien B");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                            case 2:
                                ModelFacade.action = Action.AddCustomer;
                                modelIObserver = new DesktopFrontend("Khach A");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new DesktopFrontend("Khach B");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                            case 3:
                                ModelFacade.action = Action.AddVehicle;
                                modelIObserver = new DesktopFrontend("Xe A");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new DesktopFrontend("Xe B");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                        }
                        if (choice == 0){
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("==========================");
                        System.out.println("1. Add Staff");
                        System.out.println("2. Add Customer");
                        System.out.println("3. Add Vehicle");
                        System.out.println("0. Back");
                        System.out.println("==========================");
                        System.out.println("Please enter your choice (0-3)");

                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice){
                            case 1:
                                ModelFacade.action = Action.AddStaff;
                                modelIObserver = new WebFrontend("Nhan vien A");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new WebFrontend("Nhan vien B");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                            case 2:
                                ModelFacade.action = Action.AddCustomer;
                                modelIObserver = new WebFrontend("Khach A");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new WebFrontend("Khach B");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                            case 3:
                                ModelFacade.action = Action.AddVehicle;
                                modelIObserver = new WebFrontend("Xe A");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new WebFrontend("Xe B");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                        }
                        if (choice == 0){
                            break;
                        }
                    }
                    break;
            }
            if (choiceObserver == 0){
                System.out.println("Program Refactor Finnish\n");
                break;
            }
        }
    }
}
