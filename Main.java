import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Word word=new Word();
        word.ReadFromFile();
        System.out.println(word.word);
        word.printLives();
        word.printLines();
        word.noOfLives=5;
        word.printLives();
        word.printLines();
    }


}
