package Wedding;

public class WeddingPackageBuilder {
    private Venue venue;
    private Catering catering;
    private Decorations decorations;
    private Photography photography;
    private String weddingType;

    // Setters for each  property
    public WeddingPackageBuilder setVenue(Venue venue) {
        this.venue = venue;
        return this;
    }

    public WeddingPackageBuilder setCatering(Catering catering) {
        this.catering = catering;
        return this;
    }

    public WeddingPackageBuilder setDecorations(Decorations decorations) {
        this.decorations = decorations;
        return this;
    }

    public WeddingPackageBuilder setPhotography(Photography photography) {
        this.photography = photography;
        return this;
    }

    public WeddingPackageBuilder setWeddingType(String weddingType) {
        this.weddingType = weddingType;
        return this;
    }

    // Method to build and return a WeddingPackage
    public WeddingPackage build() {
        if (venue == null || catering == null || decorations == null || photography == null || weddingType == null) {
            throw new IllegalStateException("All wedding components and type must be set");
        }
        // Use the factory to create the wedding package
        return WeddingFactory.createWedding(weddingType, venue, catering, decorations, photography);
    }
}

