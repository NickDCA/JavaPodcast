package br.com.nicolas.alurasound.models;

public class Music extends Audio {
    private String genre;
    private String artist;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Genre: " + genre + "\nArtist: " + artist);
    }

}
