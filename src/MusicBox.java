
public class MusicBox {

    // Variables
    private String songID;
    private char isSongPremium;
    public String songTitle;
    private String songArtists;
    private String songAlbum;
    public String songGenre;
    private String songProducer;
    public String songMusicLabel;
    public int noAds;

    //Constructor
    public MusicBox(String songID, char premiumSong, String title, String artists, String Album, String genre, String producer, String label) {
        this.songID = songID;
        this.isSongPremium = premiumSong;
        this.songArtists = artists;
        
        // -- TODO
        /* Initialise  the rest of the variables in this Constructor block*/

        this.songTitle = title;
        this.songAlbum = Album;
        this.songGenre = genre;
        this.songProducer = producer;
        this.songMusicLabel = label;
    }
    
    
    //Methods
    public String getSongID() {
        return songID;
    }

    public String getSongArtists() {
        return songArtists;
    }

    public char getPremiumSong() {
        return isSongPremium;
    }


    // -- TODO
        /* Create the rest of "getters" for the remaining variables */
    
    public String getsongTitle() {
        return songTitle;
    }

    public String getsongAlbum() {
        return songAlbum;
    }

    public String getsongGenre() {
        return songGenre;
    }

    public String getsongProducer() {
        return songProducer;
    }

    public String getsongMusicLabel() {
        return songMusicLabel;
    }

    public int getnoAds() {
        return noAds;
    }
}

