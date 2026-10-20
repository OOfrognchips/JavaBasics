import java.util.Scanner;

public class MovieRecommender {

    public static void main(String[] args) {

        System.out.println("Welcome to the Movie Recommender!");

        Scanner input = new Scanner(System.in);

        System.out.println("Do you like action movies? (yes/no):");
        String likeActionMovies = input.nextLine();

        if (likeActionMovies.equalsIgnoreCase("yes")) {
            System.out.println(
                "Do you prefer superhero or spy movies? (superhero/spy/other):");
            String typeOfMovie = input.nextLine();
            if (typeOfMovie.equalsIgnoreCase("superhero")) {
                System.out.println("You should watch 'Avengers: Endgame'.");
            } else if (typeOfMovie.equalsIgnoreCase("spy")) {
                System.out
                    .println("You should watch 'Mission: Impossible Fallout'.");
            } else if (typeOfMovie.equalsIgnoreCase("other")) {
                System.out.println("You should watch 'Mad Max: Fury Road'.");
            }
        } else if (likeActionMovies.equalsIgnoreCase("no")) {
            System.out.println("Do you like comedies? (yes/no):");
            String likeComedies = input.nextLine();
            if (likeComedies.equalsIgnoreCase("yes")) {
                System.out.println(
                    "Do you prefer smart humor or silly humor? (smart/silly/other):");
                String typeOfHumor = input.nextLine();
                if (typeOfHumor.equalsIgnoreCase("smart")) {
                    System.out.println(
                        "You should watch 'The Grand Budapest Hotel'.");
                } else if (typeOfHumor.equalsIgnoreCase("silly")) {
                    System.out.println("You should watch 'The Hangover'.");
                } else if (typeOfHumor.equalsIgnoreCase("other")) {
                    System.out.println("You should watch 'The Mask'.");
                }
            } else if (likeComedies.equalsIgnoreCase("no")) {
                System.out.println("Do you like independent films? (yes/no):");
                String likeIndependent = input.nextLine();
                if (likeIndependent.equalsIgnoreCase("yes")) {
                    System.out.println(
                        "Do you prefer drama or experimental style? (drama/experimental/other):");
                    String typeOfStyle = input.nextLine();

                    if (typeOfStyle.equalsIgnoreCase("drama")) {
                        System.out.println("You should watch 'Lady Bird'.");
                    } else if (typeOfStyle.equalsIgnoreCase("experimental")) {
                        System.out.println(
                            "You should watch 'Everything Is Illuminated'.");
                    } else if (typeOfStyle.equalsIgnoreCase("other")) {
                        System.out.println("You should watch 'Moonlight'.");
                    }
                } else if (likeIndependent.equalsIgnoreCase("no")) {
                    System.out.println("You should watch 'Home Alone'.");
                }
            }
        }

        System.out.println("Thanks for using the Movie Recommender!");
    }
}
