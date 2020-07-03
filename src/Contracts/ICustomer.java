package Contracts;

import ObjectModels.CustomerModel;

import java.util.List;
import java.io.File;

/**
 * This Interface is responsible for the contractualization of the Class CustomerController
 * Its purpose is the treatment and arraignment of the Data referring to the Object Customer
 * If this were a more complete project, here we would be treating documents to extract proper information
 * Therefore, while this might seem a bit lackluster, I believe it holds logical significance.
 */
public interface ICustomer {

    /**
     * @param file
     * @return
     */
    Boolean importSolution(File file);

    /**
     * @return
     */
    List<CustomerModel> getCustomers();

    /**
     * @param index
     * @return
     */
    CustomerModel getCustomer(int index);

    /**
     * @param index
     * @return
     */
    Boolean getValidation(int index);

    /**
     * @return
     */
    Boolean recordSolution();

}
