import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Velkommen til SUPERHERO UNIVERSET");

        Scanner keyboard = new Scanner(System.in);
        //lav DataBase
        Database liste = new Database();


        System.out.println("Hvad er heltens superhelte navn?");
        String superHeroName = keyboard.nextLine();

        System.out.println("Hvad er heltens rigtige navn?");
        String realName = keyboard.nextLine();


        System.out.println("Hvad er heltens superkræft");
        String superPower = keyboard.nextLine();

        System.out.println("Hvilket år er superhelten lavet");
        int yearCreated = Integer.valueOf(keyboard.nextLine());

        System.out.println("Er superhelten menneske?");
        String isHuman = keyboard.nextLine();

        System.out.println("Hvad er superheltens styrke");
        double strenght = keyboard.nextDouble();


        liste.tilføjSuperHelte(superHeroName, realName, superPower, yearCreated , isHuman, strenght );


        System.out.println();



    }
}
