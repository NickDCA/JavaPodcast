package br.com.nicolas.alurasound.models;

public class Audio {
    private String title;
    private int lenght; // default: seconds
    private int playbacks;
    private int likes;
    private double rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getPlaybacks() {
        return playbacks;
    }

    public void setPlaybacks(int playbacks) {
        this.playbacks = playbacks;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void like() {
        likes++;
        System.out.println(title + " n. of likes: " + likes + "❤");
    }

    public void play() {
        playbacks++;
        if (lenght < 3600) {
            System.out.println("Playing: " + title + "\n" + "00:00 --- " + formatLenght());
        } else {
            System.out.println("Playing: " + title + "\n" + "00:00:00 --- " + formatLenght());
        }

    }

    private String formatLenght() {
        String formattedLenght;
        if (lenght < 3600) {
            formattedLenght = String.format("%02d:%02d", lenght / 60, lenght % 60);
        } else {
            formattedLenght = String.format("%02d:%02d:%02d", lenght / 3600, (lenght % 3600) / 60, lenght % 60);
        }

        return formattedLenght;
    }

}
