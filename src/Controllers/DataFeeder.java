package Controllers;

import Contracts.IDataFeeder;
import ObjectModels.CustomerModel;
import ObjectModels.ProductCategories;
import ObjectModels.ProductModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataFeeder implements IDataFeeder {
    @Override
    public List<CustomerModel> initializeCustomers(int size) {
    //All data here will be normalized as possible (always testing)
        List<CustomerModel> models = new ArrayList<>();

        for(int ix = 0; ix<size; ix++){
            double age = Double.parseDouble(String.valueOf((new Random().nextInt(82)+18)))/99; //Let's assume maximum age will be 99, and minimum 18
            double socialClass = Double.parseDouble(String.valueOf((new Random().nextInt(7)+1)))/7;
            int employed = new Random().nextInt(1);
            boolean estatus = false;
            if(employed==0){
                estatus = true;
            }
            int subcultureSe = new Random().nextInt(7);
            String subCulture= "";
            switch (subcultureSe){
                case 0: subCulture = String.valueOf(socialMovement.POP);
                    break;
                case 1: subCulture = String.valueOf(socialMovement.PUNK);
                    break;
                case 2: subCulture = String.valueOf(socialMovement.GAMER);
                    break;
                case 3: subCulture = String.valueOf(socialMovement.GEEK);
                    break;
                case 4: subCulture = String.valueOf(socialMovement.HIPSTER);
                    break;
                case 5: subCulture = String.valueOf(socialMovement.GOPNIK);
                    break;
                case 6: subCulture = String.valueOf(socialMovement.GOTH);
                    break;
                case 7: subCulture = String.valueOf(socialMovement.METAL);
            }
            int discount = new Random().nextInt(1);
            boolean discountBuyer = false;
            if(discount==0)
                discountBuyer = true;

            Random r = new Random();
            double averagePurchase = 5 + (250 - 5) * r.nextDouble();
            List<String> categories = new ArrayList<>();
            List<Double> categoriesspent = new ArrayList<>();
            for(int jx = 0; jx<4; jx++){
                int categ = new Random().nextInt(10);
                String chosen = "";
                switch (categ){
                    case 0 : chosen = String.valueOf(ProductCategories.BAZAR);
                        break;
                    case 1 : chosen = String.valueOf(ProductCategories.CONGELADOS);
                        break;
                    case 2 : chosen = String.valueOf(ProductCategories.CRIANÇA);
                        break;
                    case 3 : chosen = String.valueOf(ProductCategories.DOCES);
                        break;
                    case 4 : chosen = String.valueOf(ProductCategories.FRESCOS);
                        break;
                    case 5 : chosen = String.valueOf(ProductCategories.EMBALADOS);
                        break;
                    case 6 : chosen = String.valueOf(ProductCategories.PREFEITOS);
                        break;
                    case 8 : chosen = String.valueOf(ProductCategories.AUTOMOVEL);
                        break;
                    case 7 : chosen = String.valueOf(ProductCategories.HIGIENE);
                        break;
                    case 9 : chosen = String.valueOf(ProductCategories.LIMPEZA);
                        break;
                    case 10 : chosen = String.valueOf(ProductCategories.PAPELARIA);
                        break;
                }
                categories.add(chosen);
                double avg = 5 + (60 - 5) * r.nextDouble();
                categoriesspent.add(avg);

            }

            CustomerModel model = new CustomerModel(age, socialClass, subCulture, estatus, discountBuyer, averagePurchase, categories, categoriesspent);
            models.add(model);
        }

        return models;
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

    public enum socialMovement {
        POP, PUNK, GAMER, GEEK, HIPSTER, GOPNIK, GOTH, METAL;
    }


}
