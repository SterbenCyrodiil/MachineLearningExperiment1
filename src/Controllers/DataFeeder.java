package Controllers;

import Contracts.IDataFeeder;
import ObjectModels.CustomerModel;
import ObjectModels.ProductModel;

import java.util.List;

public class DataFeeder implements IDataFeeder {
    @Override
    public List<CustomerModel> initializeCustomers(int size) {
        return null;
    }

    @Override
    public List<ProductModel> initializeProducts(int size) {
        return null;
    }

    @Override
    public Boolean createCSVDataSets(int size) {
        return null;
    }

    @Override
    public CustomerModel createRandomCustomer() {
        return null;
    }
}
