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
        String shownMovieName = listofMovies.get(randomMovie);


        String hiddenMovieName = shownMovieName.replaceAll("[a-zA-Z]", "_ ");


     //   for (int i = 0; i < listofMovies.get(randomMovie).length(); i++) {
            // Character eachCharOfMovie = listofMovies.get(randomMovie).charAt(i);

   //     }
        System.out.println("You are guessing: " + hiddenMovieName);
        System.out.println(shownMovieName);

        System.out.print("Guess a letter: ");
        Scanner in = new Scanner(System.in);
        String guess = in.nextLine();


        if (shownMovieName.contains(guess)) { //TODO: write logic to replace _ with actual letter
            System.out.println();
        }

        System.out.println();














    }
}
