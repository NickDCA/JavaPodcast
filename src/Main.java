import br.com.nicolas.alurasound.models.Audio;

public class Main {
    public static void main(String[] args) throws Exception {
        Audio test = new Audio();
        test.setTitle("Whom the bells toll");
        test.setLenght(383);
        test.setPlaybacks(4);
        test.setLikes(3);

        test.play();
        test.like();
    }
}
