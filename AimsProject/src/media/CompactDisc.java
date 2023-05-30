package media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super(title, category, null, 0, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if(tracks.contains(track)) {
            System.out.println("Track is already in CD");
            return;
        }

        tracks.add(track);
    }

    public void removeTrack(Track track) {
        if(!tracks.contains(track)) {
            System.out.println("Track is not in CD");
            return;
        }

        tracks.remove(track);
    }

    public String getArtist() {
        return this.artist;
    }

    public int getLength() {
        int totalLength = 0;
        for(Track t : tracks) {
            totalLength += t.getLength();
        }

        return totalLength;
    }

    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        for (Track track : tracks) {
            track.play();
        }
    }
    
    public String toString() {
        return "DVD - [" + this.getTitle() + "] - [" 
                    + this.getCategory() + "] - [" 
                    + this.getDirector() + "] - [" 
                    + this.getLength() +"]: ["
                    + this.getCost() + "] $";
    }
}
