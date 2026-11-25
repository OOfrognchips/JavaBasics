import java.util.Scanner;

public class Rodalies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PREU BITLLET DE RODALIES ===");

        System.out.println("Zona d'origen:");
        byte originZone = input.nextByte();

        System.out.println("Zona de destí:");
        byte destinationZone = input.nextByte();

        if ((originZone > 6 | originZone < 1)
            | (destinationZone > 6 | destinationZone < 1))
        {
            System.out.println("Error: les zones han d'estar entre 1 i 6");
        } else if ((originZone > 6 | originZone < 1)
            & (destinationZone > 6 | destinationZone < 1))
        {
            System.out.println("Error: les zones han d'estar entre 1 i 6");
        } else if ((originZone <= 6 & originZone >= 1)
            & (destinationZone <= 6 & destinationZone >= 1))
        {

            System.out.printf(
                "Tipus de transport:%n1. Bitllet senzill%n2. Anada i tornada%n3. Bonotren de 10 viatges%n4. Abonament mensual%n");

            System.out.println("Escull una opció:");
            byte typeOfTransport = input.nextByte();

            byte numberOfZones =
                (byte)(Math.abs(destinationZone - originZone) + 1);

            if (typeOfTransport < 1 | typeOfTransport > 4) {
                System.out.println("Error: l'opció seleccionada no és vàlida");
            } else if (typeOfTransport >= 1 & typeOfTransport <= 4) {
                System.out.printf("Zones del trajecte: %d%n", numberOfZones);
            }

            input.close();

            if (numberOfZones == 1) {
                if (typeOfTransport == 1) {
                    System.out.println("Preu: 2.90 €");
                } else if (typeOfTransport == 2) {
                    System.out.println("Preu: 5.80 €");
                } else if (typeOfTransport == 3) {
                    System.out.println("Preu: 11.70 €");
                } else if (typeOfTransport == 4) {
                    System.out.println("Preu: 22.50 €");
                }
            } else if (numberOfZones == 2) {
                if (typeOfTransport == 1) {
                    System.out.println("Preu: 3.35 €");
                } else if (typeOfTransport == 2) {
                    System.out.println("Preu: 6.70 €");
                } else if (typeOfTransport == 3) {
                    System.out.println("Preu: 18.60 €");
                } else if (typeOfTransport == 4) {
                    System.out.println("Preu: 35.45 €");
                }

            } else if (numberOfZones == 3) {
                if (typeOfTransport == 1) {
                    System.out.println("Preu: 4.55 €");
                } else if (typeOfTransport == 2) {
                    System.out.println("Preu: 9.10 €");
                } else if (typeOfTransport == 3) {
                    System.out.println("Preu: 27.60 €");
                } else if (typeOfTransport == 4) {
                    System.out.println("Preu: 52.50 €");
                }

            } else if (numberOfZones == 4) {
                if (typeOfTransport == 1) {
                    System.out.println("Preu: 5.55 €");
                } else if (typeOfTransport == 2) {
                    System.out.println("Preu: 11.00 €");
                } else if (typeOfTransport == 3) {
                    System.out.println("Preu: 35.80 €");
                } else if (typeOfTransport == 4) {
                    System.out.println("Preu: 67.54 €");
                }

            } else if (numberOfZones == 5) {
                if (typeOfTransport == 1) {
                    System.out.println("Preu: 6.60 €");
                } else if (typeOfTransport == 2) {
                    System.out.println("Preu: 13.20 €");
                } else if (typeOfTransport == 3) {
                    System.out.println("Preu: 43.45 €");
                } else if (typeOfTransport == 4) {
                    System.out.println("Preu: 79.90 €");
                }

            } else if (numberOfZones == 6) {
                if (typeOfTransport == 1) {
                    System.out.println("Preu: 8.25 €");
                } else if (typeOfTransport == 2) {
                    System.out.println("Preu: 16.50 €");
                } else if (typeOfTransport == 3) {
                    System.out.println("Preu: 54.40 €");
                } else if (typeOfTransport == 4) {
                    System.out.println("Preu: 83.25 €");
                }

            }

        }

    }
}
