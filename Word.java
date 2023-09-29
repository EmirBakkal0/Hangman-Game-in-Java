import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Word {
    private String word;
    private int noOfLives=6;
    public Word() throws FileNotFoundException {
        ReadFromFile();
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
        sc.close();

    }

    public void printLines(){
        //System.out.println(word);
        boolean firstTime=true;
        boolean won=false;
        System.out.println();

        ArrayList<Character> lines= new ArrayList<>();
        ArrayList<Character> enteredLetters= new ArrayList<>();
        for (int i = 0; i <word.length() ; i++) {
            lines.add('_');
        }

        while (noOfLives!=0 && !won ) {


            printLives();
            if (firstTime) {   /// just to print to first empty lines __
                for (int i = 0; i < word.length(); i++) {
                    System.out.print(lines.get(i));
                }
                firstTime=false;
            }

            char input = getValueFromPlayer();
            enteredLetters.add(input);
            boolean gotRight = false;

            for (int i = 0; i < word.length(); i++) {
                if (input == word.charAt(i)) {
                    lines.set(i,word.charAt(i));
                    gotRight =true;
                }
            }
            won=true;

            for (int i = 0; i <word.length() ; i++) {
                System.out.print(lines.get(i));
                if(lines.get(i)=='_'){
                    won=false;
                }

            }
            System.out.println();
            System.out.println("Letters you've entered so far:");
            for (Character enteredLetter : enteredLetters) {
                System.out.print(enteredLetter + " ");
            }
            System.out.println();
            if (gotRight == false)
                noOfLives--;

        }
        if (noOfLives>0){
            System.out.println("\nYou got the word right! Congrats!!" );
        }
        else {
            printLives();
            System.out.println("\nSorry you've lost. The right word was '"+ word +"'");
        }

    }

    public char getValueFromPlayer(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("\nPick a letter: ");
        String a =scanner.next();

        return a.charAt(0);

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

    public void cls(){  //to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
