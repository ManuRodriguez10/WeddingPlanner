package Wedding;

public class WeddingPlanner {
    private static WeddingPlanner instance;

    // Method to get the single instance of WeddingPlanner
    public static WeddingPlanner getInstance() {
        if (instance == null) {
            instance = new WeddingPlanner(); // Create a new instance if it doesn't exist
        }
        // Return the existing or newly created instance
        return instance;
    }

}
