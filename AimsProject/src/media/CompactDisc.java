package media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String artist) {
        super(title);
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
}
