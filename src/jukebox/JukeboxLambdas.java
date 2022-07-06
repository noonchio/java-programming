package jukebox;

import java.util.List;

public class JukeboxLambdas {
    public static void main(String[] args) {
        new JukeboxLambdas().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs1.getSongsV3();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);
    }
}
