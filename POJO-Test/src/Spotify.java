import java.util.ArrayList;
public class Spotify {
    static ArrayList<Song> playList = new ArrayList<Song>();
    public static void main(String[] args) throws Exception {
        playList.add(new Song("testName", "testFileLocation", "testArtist", "test", "test", "test"));
        playList.add(new Song("testNamelol", "testFileLocationlol", "testArtistlol", "testlol", "testlol", "testlol"));
        System.out.println(playList.get(0).getSongName());
    }

}
