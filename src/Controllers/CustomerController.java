package Controllers;

import Contracts.ICustomer;
import ObjectModels.CustomerModel;

import java.io.File;
import java.util.List;

public class CustomerController implements ICustomer {

    List<CustomerModel> customers;

    //generic constructor
    public CustomerController(){
        DataFeeder dataFeeder = new DataFeeder();
    }

    public CustomerController(File file){
        importSolution(file);
    }

    @Override
    public Boolean recordSolution() {
        return null;
    }

    @Override
    public Boolean importSolution(File file) {
        return null;
    }

    @Override
    public List<CustomerModel> getCustomers() {
        return null;
    }

    @Override
    public CustomerModel getCustomer(int index) {
        return null;
    }

    @Override
    public Boolean getValidation(int index) {
        return null;
    }
}
