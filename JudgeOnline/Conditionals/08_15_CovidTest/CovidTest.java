import java.util.Scanner;

public class CovidTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String probablyDisease =
            "Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.";
        String probablyNotDisease =
            "Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.";

        System.out.println("Tens febre? (sí/no):");
        String ifFever = input.next();

        if (ifFever.equalsIgnoreCase("si") | ifFever.equalsIgnoreCase("sí")) {

            System.out.println("També tens tos? (sí/no):");
            String ifCough = input.next();

            if (ifCough.equalsIgnoreCase("si")
                | ifCough.equalsIgnoreCase("sí"))
            {

                System.out.println("Et sents cansat o dèbil? (sí/no):");
                String ifTired = input.next();

                if (ifTired.equalsIgnoreCase("si")
                    | ifTired.equalsIgnoreCase("sí"))
                {
                    System.out.println(probablyDisease);
                } else if (ifTired.equalsIgnoreCase("no")) {

                    System.out
                        .println("Tens dificultat per respirar? (sí/no):");
                    String ifCannotBreathe = input.next();

                    if (ifCannotBreathe.equalsIgnoreCase("si")
                        | ifCannotBreathe.equalsIgnoreCase("sí"))
                    {
                        System.out.println(probablyDisease);
                    } else if (ifCannotBreathe.equalsIgnoreCase("no")) {
                        System.out.println(probablyNotDisease);
                    }
                }
            } else if (ifCough.equalsIgnoreCase("no")) {

                System.out.println("Tens mal de coll o mal de cap? (sí/no):");
                String ifHeadache = input.next();

                if (ifHeadache.equalsIgnoreCase("si")
                    | ifHeadache.equalsIgnoreCase("sí"))
                {
                    System.out.println(probablyDisease);
                } else if (ifHeadache.equalsIgnoreCase("no")) {
                    System.out.println(probablyNotDisease);
                }
            }
        } else if (ifFever.equalsIgnoreCase("no")) {

            System.out.println("Has perdut l'olfacte o el gust? (sí/no):");
            String ifNoTaste = input.next();

            if (ifNoTaste.equalsIgnoreCase("si")
                | ifNoTaste.equalsIgnoreCase("sí"))
            {
                System.out.println(probablyDisease);
            } else if (ifNoTaste.equalsIgnoreCase("no")) {

                System.out.println("Tens congestió nasal o mocs? (sí/no):");
                String ifNasalCongestion = input.next();

                if (ifNasalCongestion.equalsIgnoreCase("si")
                    | ifNasalCongestion.equalsIgnoreCase("sí"))
                {
                    System.out.println(probablyNotDisease);
                } else if (ifNasalCongestion.equalsIgnoreCase("no")) {
                    System.out.println(probablyNotDisease);
                }
            }
        }

        input.close();
    }
}
