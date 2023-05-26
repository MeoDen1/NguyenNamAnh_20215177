package media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {
        
    }

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category) {
        super(title, category);
    }

    public Disc(String title, String category, String director) {
        super(title, category);
        this.director = director;
    }

    public Disc(String title, String category, String director, int length) {
        super(title, category);
        this.director = director;
        this.length = length;
    }

    public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public String getDirector() {
        return this.director;
    }
}
