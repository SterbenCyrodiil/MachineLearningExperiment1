package ObjectModels;

import java.util.List;

//Objective is to be anonymous, so that only important data like time-frames, economical conditions, and average expenditures count.
//Ideal is to create several "sales" regarding each customer, then compress them into this model, instead of simple random creation or using external data
//Large parts of the data here is believe to be able to be deducted from other models using data known, however, they won't be here present, since they flee the scope of the problem. Maybe in a later date!
public class CustomerModel {

    private int age;
    private int social_class;
    private String socialMovement; //POP;HIPSTER;GEEK; Stuff like that
    private boolean employed;
    private boolean discount_buyer;
    private double avg_amount; //average expenditure when shopping
    private List<String> typical_categories; // list of most bought item categories
    private List<Integer> typical_pricerange; //for each category, the typical price range of the products bought;

    public CustomerModel(int age, int social_class, String socialMovement, boolean employed, boolean discount_buyer,
                         double avg_amount, List<String> typical_categories, List<Integer> typical_pricerange){
        this.age = age;
        this.social_class = social_class;
        this.socialMovement = socialMovement;
        this.employed = employed;
        this.discount_buyer = discount_buyer;
        this.avg_amount = avg_amount;
        this.typical_categories = typical_categories;
        this.typical_pricerange = typical_pricerange;
    }

    public int getAge() {
        return this.age;
    }

    public int getSocial_class() {
        return this.social_class;
    }

    public boolean isEmployed() {
        return this.employed;
    }

    public boolean isDiscount_buyer() {
        return this.discount_buyer;
    }

    public double getAvg_amount() {
        return this.avg_amount;
    }

    public List<String> getTypical_categories() {
        return this.typical_categories;
    }

    public List<Integer> getTypical_pricerange() {
        return this.typical_pricerange;
    }

    public String getSocialMovement() {
        return socialMovement;
    }
}
