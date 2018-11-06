import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessTheMovie {

    public static void main(String[] args) throws Exception {

        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        List<String> listofMovies = new ArrayList<String>();


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            listofMovies.add(line);

        }

        int randomMovie = (int) (Math.random() * listofMovies.size()) + 1;
        String movieName = listofMovies.get(randomMovie);


        String hiddenMovieName = movieName.replaceAll("[a-zA-Z]", "_");


        System.out.println("You are guessing: " + hiddenMovieName);
        System.out.println(movieName);


        Scanner in = new Scanner(System.in);

        StringBuilder guessingMovieName = new StringBuilder(hiddenMovieName);

        boolean guessed = false;


        while (!guessed) {
            System.out.print("Guess a letter: ");
            String guess = in.nextLine();
            if (movieName.contains(guess)) {

                for (int i = 0; i < hiddenMovieName.length(); i++) {
                    if (movieName.charAt(i) == guess.charAt(0)) {
                        guessingMovieName.setCharAt(i, guess.charAt(0));
                    }

                }
                System.out.println(guessingMovieName);
                if (guessingMovieName.toString().equals(movieName)) {
                    guessed = true;
                    System.out.println("You win!");
                }


            }
        }


        System.out.println();


    }
}
