package media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }

    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    
    public boolean equals(Object c) {
        if(c == this) return true;
        if(!(c instanceof Track track)) return false;
        return track.getTitle() == this.getTitle() && track.getLength() == this.getLength();
    }
}
