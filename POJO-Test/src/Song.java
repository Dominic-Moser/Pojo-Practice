public class Song {
    private String songName;
    private String songFileLocation;
    private String songArtist;
    private String songTheme1;
    private String songTheme2;
    private String songTheme3;

public Song(String a, String b, String c, String d, String e, String f)
{
    songName = a;
    songFileLocation = b;
    songArtist = c;
    songTheme1 = d;
    songTheme2 = e;
    songTheme3 = f;
}

public String getSongName()
{
    return songName;
}
public String getSongFileLocation()
{
    return songFileLocation;
}
public String getSongArtist()
{
    return songArtist;
}
public String getSongTheme1()
{
    return songTheme1;
}
public String getSongTheme2()
{
    return songTheme2;
}
public String getSongTheme3()
{
    return songTheme3;
}
public void setSongName(String a)
{
    songName = a;
}
public void setFileLocation(String b)
{
    songFileLocation = b;
}
public void setSongArtist(String c)
{
    songArtist = c;
}
public void setSongArtist(String d)
{
    songName = d;
}
public void setFileLocation(String b)
{
    songFileLocation = b;
}
public void setSongArtist(String c)
{
    songArtist = c;
}
public static void babyCry()
{
    System.out.println("WAAAAAAAAAAAAAAAA");
}

}

