import java.awt.Desktop;  
import java.io.*;  
import java.util.ArrayList;
public class Spotify {
    static ArrayList<Song> playList = new ArrayList<Song>();
    public static void main(String[] args) throws Exception {
        playList.add(new Song("testName", "testFileLocation", "testArtist", "test", "test", "test"));
        playList.add(new Song("testNamelol", "testFileLocationlol", "testArtistlol", "testlol", "testlol", "testlol"));
        System.out.println(playList.get(0).getSongName());
    
        File file = new File("C:/Users/Dominic/Desktop/New folder (2)/Eminem - Without Me (Official Music Video) (320 kbps).mp3");   
        if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
        {  
        System.out.println("not supported");  
        return;  
        }  

        Desktop desktop = Desktop.getDesktop();  
        if(file.exists())         //checks file exists or not  
        desktop.open(file);              //opens the specified file  
        }  
    }


