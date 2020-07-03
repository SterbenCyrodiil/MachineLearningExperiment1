package Contracts;

import ObjectModels.CustomerModel;
import ObjectModels.ProductModel;

import java.util.List;

/**
 * This Interface is responsible for the contractualization of the Class DataFeeder
 * Its purpose is the random creation and initialization of a determined group of object Customer.
 * The intent is to create a diversified array of "problems", ergo Customers, in order to feed and test the MachineLearning Models to be developed
 */
public interface IDataFeeder {

    /**
     * This method creates random Customers to test the implementation of the model and records them
     * @param size size of the population
     *
     * @return A list containing several Customers
     */
    List<CustomerModel> initializeCustomers(int size);

    /**
     * This method picks from a dataset several products in order to test the implementation
     * @param size size of the population
     *
     * @return A list containing several randomly picked products
     */
    List<ProductModel> initializeProducts(int size);

    /**
     * This method creates a CSV dataset when called in order to test and train models;
     *  @param size size of the population
     *
     * @return Success of the operation
     */
    Boolean createCSVDataSets(int size);

    /**
     * Creates a Customer with several attributes
     *
     * @return The created Customer
     */
    CustomerModel createRandomCustomer();

}
