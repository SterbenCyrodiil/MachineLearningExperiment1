package Contracts;

/**
 * This Interface is responsible for the contractualization of the Class Predicot
 * Its purpose is the Instantiation and running of the MachineLearning model, with its export as JSON Data
 */
public interface IPredictor {

    /**
     * This method will run over the several Customers and products and find the best matches
     */
    void makePredictions();

    /**
     * This method will record, in JSON format, the created data
     *
     * @return Success or not of the operation
     */
    boolean exportPredictions();

}
