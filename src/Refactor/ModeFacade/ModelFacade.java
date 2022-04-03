package Refactor.ModeFacade;

import Refactor.Action;
import Refactor.Entity.Customer;
import Refactor.Entity.Staff;
import Refactor.Entity.Vehicle;
import Refactor.ModelObserver.ModelIObserver;

import java.util.ArrayList;

public class ModelFacade implements ModelIFacade{
    public static Action action;
//    private static Staff staff = new Staff();
//    private static Vehicle vehicle = new Vehicle();
//    private static Customer customer = new Customer();
//    private ArrayList<Staff> listStaff;
//    private ArrayList<Customer> listCustomer;
//    private ArrayList<Vehicle> listVehicle;
    private ArrayList<ModelIObserver> listObserver;
    private int mainState;
    @Override
    public void addSubscriber(ModelIObserver modelIObserver) {
        if (listObserver ==null){
            listObserver = new ArrayList<>();
        }
        if (action == Action.AddStaff){
            listObserver.add(modelIObserver);
        }

        if (action == Action.AddCustomer){
            listObserver.add(modelIObserver);
        }

        if (action == Action.AddVehicle){
            listObserver.add(modelIObserver);
        }
    }

    @Override
    public void removeSubscriber(ModelIObserver modelIObserver) {

    }

    public void mainBusinessLogic() {
        mainState ++;
        sendNotify(action);
    }

    @Override
    public void sendNotify(Action action) {
        System.out.println("Check: "+ action);
        switch (action){
            case AddStaff:
                for (ModelIObserver observer: listObserver) {
                    observer.managerStaff(" ,Add staff OK, thực thi lần thứ "+ this.mainState );
                }
                listObserver = null;
                break;
            case AddCustomer:
                for (ModelIObserver observer: listObserver) {
                    observer.managerCustomer(" ,Add customer OK, thực thi lần thứ "+ this.mainState);
                }
                listObserver = null;
                break;
            case AddVehicle:
                for (ModelIObserver observer: listObserver) {
                    observer.managerVehicle(" ,Add vehicle OK, thực thi lần thứ "+ this.mainState);
                }
                listObserver = null;
                break;
        }
    }
}
