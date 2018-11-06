import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessTheMovie {

    public static void main(String[] args) throws Exception{

            File file = new File("movies.txt");
            Scanner scanner = new Scanner(file);
        List<String> listofMovies = new ArrayList<String>();


        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            listofMovies.add(line);

        }

        int randomMovie = (int) (Math.random() * listofMovies.size()) + 1;
        String movieName = listofMovies.get(randomMovie);


        String hiddenMovieName = movieName.replaceAll("[a-zA-Z]", "_");



        System.out.println("You are guessing: " + hiddenMovieName);
        System.out.println(movieName);

        System.out.print("Guess a letter: ");
        Scanner in = new Scanner(System.in);
        String guess = in.next();

        StringBuilder guessingMovieName = new StringBuilder(hiddenMovieName);



        if (movieName.contains(guess)) {

          for (int i = 0; i < hiddenMovieName.length(); i++) {
             if(movieName.charAt(i) == guess.charAt(0)) {
                 guessingMovieName.append(guess);
             }


          }

        }




        System.out.println();














    }
}
