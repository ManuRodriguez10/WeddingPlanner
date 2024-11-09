package Wedding;

public class Main {
    public static void main(String[] args) {

        //TEST CASE #1: LUXURY WEDDING

        //Get the singleton instance of WeddingPlanner
        WeddingPlanner planner1 = WeddingPlanner.getInstance();

        //Customize the wedding
        Venue venue = new Venue("Grand Palace");
        Catering catering = new Catering("Gourmet Buffet");
        Decorations decorations = new Decorations("Elegant Flowers");
        Photography photography = new Photography("Professional Photography");

        //Build a wedding package using the builder and factory pattern
        WeddingPackage wedding1 = new WeddingPackageBuilder()
                .setVenue(venue)
                .setCatering(catering)
                .setDecorations(decorations)
                .setPhotography(photography)
                .setWeddingType("Luxury")
                .build();

        //Display the wedding
        wedding1.displayWedding();

        //TEST CASE #2: TRADITIONAL WEDDING

        WeddingPlanner planner2 = WeddingPlanner.getInstance();
        Venue venue2 = new Venue("Country Club");
        Catering catering2 = new Catering("Classic Buffet");
        Decorations decorations2 = new Decorations("Traditional Flowers");
        Photography photography2 = new Photography("Local Photography");

        //Build a wedding package using the builder and factory pattern
        WeddingPackage wedding2 = new WeddingPackageBuilder()
                .setVenue(venue2)
                .setCatering(catering2)
                .setDecorations(decorations2)
                .setPhotography(photography2)
                .setWeddingType("Traditional")
                .build();

        //Display the wedding
        wedding2.displayWedding();
    }

}






