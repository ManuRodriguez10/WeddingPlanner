package Wedding;

public class WeddingFactory {

    // Method to create a WeddingPackage based on the specified type
    public static WeddingPackage createWedding(String type, Venue venue, Catering catering, Decorations decorations, Photography photography) {
        // Create and return the specific wedding package
        switch (type) {
            case "Luxury":
                return new LuxuryWedding(venue, catering, decorations, photography);
            case "Traditional":
                return new TraditionalWedding(venue, catering, decorations, photography);
            case "Destination":
                return new DestinationWedding(venue, catering, decorations, photography);
            default:
                throw new IllegalArgumentException("Unknown wedding package: " + type);
        }
    }
}


