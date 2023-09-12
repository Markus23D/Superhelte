import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //lav DataBase
        Database liste = new Database();
        //Intro
        System.out.println("Velkommen til SUPERHERO UNIVERSET");
        System.out.println("\u2500".repeat(50));
        System.out.println(" ");
        //startmenu


        while (true) {
            System.out.println("Indtast 1 for at oprette en superhelt");
            System.out.println("Indtast 9 for at afslutte");
            int userChoice = Integer.valueOf(keyboard.nextLine());

            if (userChoice == 1) {
                System.out.println("Okay, lad os gøre det!");
                System.out.println("Hvad er heltens superhelte navn?");
                String superHeroName = keyboard.nextLine();

                System.out.println("Hvad er heltens rigtige navn?");
                String realName = keyboard.nextLine();


                System.out.println("Hvad er heltens superkræft");
                String superPower = keyboard.nextLine();

                System.out.println("Hvilket år er superhelten lavet");
                int yearCreated = Integer.valueOf(keyboard.nextLine());

                System.out.println("Er superhelten menneske? [Yes/no]");
                String isHuman = keyboard.nextLine();

                System.out.println("Hvad er superheltens styrke lvl");
                double strenght = Double.valueOf(keyboard.nextLine());


                liste.tilføjSuperHelte(superHeroName, realName, superPower, yearCreated, isHuman, strenght);

                System.out.println("Superhelt tilføjet til Database");
                System.out.println("\u2500". repeat(50));
                System.out.println(" ");


            } else if (userChoice == 9) {
                System.exit(0);
            } else {
                System.out.println("Ugyldigt valg. Prøv igen");
            }

        }
    }


}
