package hust.soict.globalict.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
        super(0, director); // Gọi constructor Disc(int length, String director)
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }

    public String getArtist() { return artist; }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public int getLength() {
        int total = 0;
        for (Track track : tracks) total += track.getLength();
        return total;
    }

    public void play() {
        System.out.println("Playing CD: " + this.getTitle() + " by " + this.artist);
        System.out.println("CD Total length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
}
