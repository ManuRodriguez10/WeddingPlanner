package Wedding;

public class LuxuryWedding extends WeddingPackage{

    public LuxuryWedding(Venue venue, Catering catering, Decorations decorations, Photography photography) {
        super(venue, catering, decorations, photography);
    }

    @Override
    public void displayWedding() {
        System.out.println("\nPlanning luxury wedding... ");
        System.out.println("Wedding package type: Luxury wedding");
        System.out.println("Venue: " + getVenue().getVenueOption()); // Accessing the venue's option
        System.out.println("Catering: " + getCatering().getCateringOption()); // Accessing catering's option
        System.out.println("Decorations: " + getDecorations().getDecorationOption()); // Accessing decorations' option
        System.out.println("Photography: " + getPhotography().getPhotographyOption()); // Assuming there's a getter for photography
    }



    }

