package disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public int id;

    private static int nbDigitalVideoDiscs = 0;


    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs += 1;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category) {
        this.title = title;
        this.category = category;
        nbDigitalVideoDiscs += 1;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director) {
        this.title = title;
        this.category = category;
        this.director = director;
        nbDigitalVideoDiscs += 1;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs += 1;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        id = nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String _title) {
        this.title = _title;
    }

    public String toString() {
        return "DVD - [" + this.title + "] - [" 
                    + this.category + "] - [" 
                    + this.director + "] - [" 
                    + this.length +"]: ["
                    + this.cost + "] $";
    }
}
