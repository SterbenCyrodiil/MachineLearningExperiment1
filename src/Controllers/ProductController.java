package Controllers;

import Contracts.IProduct;
import ObjectModels.ProductModel;

import java.io.File;
import java.util.List;

public class ProductController implements IProduct {

    List<ProductModel> products;

    public ProductController(){
        DataFeeder dataFeeder = new DataFeeder();
    }

    public ProductController(File file){
        importSolution(file);
    }

    @Override
    public Boolean importSolution(File file) {
        return null;
    }

    @Override
    public Boolean recordSolution() {
        return null;
    }

    @Override
    public List<ProductModel> getProducts() {
        return null;
    }

    @Override
    public ProductModel getProduct(int index) {
        return null;
    }

    @Override
    public Boolean getValidation(int index) {
        return null;
    }
}
