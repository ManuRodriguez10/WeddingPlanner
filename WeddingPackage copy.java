package Wedding;

public abstract class WeddingPackage {
    private Venue venue;
    private Catering catering;
    private Decorations decorations;
    private Photography photography;


    //Wedding constructor
    public WeddingPackage(Venue venue, Catering catering, Decorations decorations, Photography photography) {
        this.venue = venue;
        this.catering = catering;
        this.decorations = decorations;
        this.photography = photography;
    }

    //Getters for attributes
    public Venue getVenue() {
        return venue;
    }

    public Catering getCatering() {
        return catering;
    }

    public Decorations getDecorations() {
        return decorations;
    }

    public Photography getPhotography() {
        return photography;
    }

    //Method to display wedding details
    public abstract void displayWedding();

}
