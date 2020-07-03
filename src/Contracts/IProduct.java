package Contracts;

import ObjectModels.ProductModel;

import java.io.File;
import java.util.List;

/**
 * This Interface is responsible for the contractualization of the Class ProductController
 * Its purpose is the treatment and arraignment of the Data referring to the Object Product
 * If this were a more complete project, here we would be treating documents to extract proper information
 * Therefore, while this might seem a bit lackluster, I believe it holds logical significance.
 */
public interface IProduct {

    /**
     * @param file
     * @return
     */
    Boolean importSolution(File file);

    /**
     * @return
     */
    Boolean recordSolution();

    /**
     * @return
     */
    List<ProductModel> getProducts();

    /**
     * @param index
     * @return
     */
    ProductModel getProduct(int index);

    /**
     * @param index
     * @return
     */
    Boolean getValidation(int index);

}
