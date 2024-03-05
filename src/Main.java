import br.com.nicolas.alurasound.models.Audio;
import br.com.nicolas.alurasound.models.Music;
import br.com.nicolas.alurasound.models.Podcast;

public class Main {
    public static void main(String[] args) throws Exception {
        Audio test = new Audio();
        test.setTitle("Whom the bells toll");
        test.setLenght(383);
        test.setPlaybacks(4);
        test.setLikes(3);

        test.play();
        test.like();

        Music music1 = new Music();
        music1.setTitle("Welcome to the Jungle");
        music1.setLenght(185);
        music1.setPlaybacks(14);
        music1.setLikes(57);
        music1.setArtist("Guns'n Roses");
        music1.setGenre("Rock");

        music1.play();
        music1.like();

        Podcast podcast = new Podcast();
        podcast.setTitle("Welcome to the Jungle");
        podcast.setLenght(4567);
        podcast.setPlaybacks(14);
        podcast.setLikes(57);
        podcast.setEpisode(4);
        podcast.setHost("FutureTech Brothers");
        podcast.setTopic("FutureTech: Exploring the latest advancements in AI and Robotics");

        podcast.play();
        podcast.like();
    }
}
