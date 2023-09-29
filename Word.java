import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Word {
    String word;
    int noOfLives=6;
    char[] charsOfWord;
    public Word() {
        this.word=word;
        word.getChars(0,word.length(),charsOfWord,0);
    }


    public void ReadFromFile() throws FileNotFoundException {
        File file= new File("words.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> wordList = new ArrayList<>();
        while (sc.hasNext()){
            wordList.add(sc.next());
        }
        Random random= new Random();
        word=wordList.get(random.nextInt(wordList.size()));
        //System.out.println(word);

    }

    public void printLines(){
        System.out.println(word.charAt(0));


        System.out.println( "\n");
        for (int i = 0; i < word.length(); i++) {   /// pri
            System.out.print("_");
        }





    }


    public void printLives(){
        if (noOfLives==6){
            for (int i = 0; i <7 ; i++) {
                System.out.println(" |     ");
            }
            System.out.println("/ \\");
        }


        else if (noOfLives==5){
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    O");
            for (int i = 0; i < 4; i++) {
                System.out.println(" |");
            }
            System.out.println("/ \\");
        }
        else if (noOfLives==4){
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    O");
            System.out.println(" |    |");
            System.out.println(" |    |");

            for (int i = 0; i < 2; i++) {
                System.out.println(" |");
            }
            System.out.println("/ \\");
        }
        else if (noOfLives==3){
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    O");
            System.out.println(" |    |\\");
            System.out.println(" |    |");

            for (int i = 0; i < 2; i++) {
                System.out.println(" |");
            }
            System.out.println("/ \\");
        }
        else if (noOfLives==2){
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    O");
            System.out.println(" |   /|\\");
            System.out.println(" |    |");

            for (int i = 0; i < 2; i++) {
                System.out.println(" |");
            }
            System.out.println("/ \\");
        }
        else if (noOfLives==1){
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    O");
            System.out.println(" |   /|\\");
            System.out.println(" |    |");
            System.out.println(" |   /");
            for (int i = 0; i < 1; i++) {
                System.out.println(" |");
            }
            System.out.println("/ \\");
        }
        else if (noOfLives==0){
            System.out.println(" ______");
            System.out.println(" |    |");
            System.out.println(" |    O");
            System.out.println(" |   /|\\");
            System.out.println(" |    |");
            System.out.println(" |   / \\");
            for (int i = 0; i < 1; i++) {
                System.out.println(" |");
            }
            System.out.println("/ \\");
        }


    }

}
