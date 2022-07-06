package jukebox;


import java.util.ArrayList;
import java.util.List;

class SongV3 implements Comparable<SongV3> {
     private String title;
     private String artist;
     private int bpm;



     public int compareTo(SongV3 s) {
         return title.compareTo(s.getTitle());
     }

     SongV3(String title, String artist, int bpm) {
         this.title = title;
         this.artist = artist;
         this.bpm = bpm;

     }

     public String getTitle() {
         return title;
     }

     public String getArtist() {
         return artist;
     }

     public int getBpm() {
         return bpm;
     }

     public String toString() {
         return title;
     }



 }


class MockSongs1 {
    public static List<SongV3> getSongsV3() {
        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("sommersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("$10", "hitchhiker", 140));
        songs.add(new SongV3("havana", "cabello", 105));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("50 ways", "simon", 102));
        return songs;
    }

}
