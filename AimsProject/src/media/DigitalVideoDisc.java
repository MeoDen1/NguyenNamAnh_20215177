package media;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(title);
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category) {
        super(title, category);
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director) {
        super(title, category, director);
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length) {
        super(title, category, director, length);
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        this.setId(++nbDigitalVideoDiscs);
    }

    public String toString() {
        return "DVD - [" + this.getTitle() + "] - [" 
                    + this.getCategory() + "] - [" 
                    + this.getDirector() + "] - [" 
                    + this.getLength() +"]: ["
                    + this.getCost() + "] $";
    }
}
