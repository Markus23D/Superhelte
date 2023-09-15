import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Database liste = new Database();
    Scanner keyboard = new Scanner(System.in);

    public void start() {


        //Intro
        System.out.println("Velkommen til SUPERHERO UNIVERSET");
        System.out.println("\u2500".repeat(50));
        System.out.println(" ");
        //startmenu


        while (true) {
            System.out.println("Indtast 1 for at oprette en ny superhelt");
            System.out.println("Indtast 2 for at se alle superhelte");
            System.out.println("Indtast 3 for at søge på en superhelt");
            System.out.println("Indtast 4 for at redigere en superhelt");
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

                System.out.println(" ");


            } else if (userChoice == 9) {
                System.exit(0);

            } else if (userChoice == 3) {
                System.out.println("Søg efter en helt.");
                String brugerensSøgning = keyboard.nextLine();
                System.out.println(liste.findHeroName(brugerensSøgning));


            } else if (userChoice == 2) {
                liste.visSuperhelte();

            } else if (userChoice == 4) {
                redigerPerson();

            } else {
                System.out.println("Ugyldigt valg. Prøv igen");

            }
        }
    }

    public void redigerPerson() {
        //Her kan delvist navn indtastes
        System.out.println("Indtast søgekriterium for person");
        String brugerInput = keyboard.nextLine();

        ArrayList<Superhelt> søgeResultat = liste.findHeroName(brugerInput);

        Superhelt superheltDerSkalRedigeres = null;

        if (søgeResultat.size() == 0) {
            System.out.println("Der findes ikke nogen helte");

        } else if (søgeResultat.size() >= 1) {

            // Vælg en person i søgeresultat med flere personer
            System.out.println("Vælg person");
            int tæller = 1;
            for (Superhelt Superhelt : søgeResultat) {
                System.out.println(tæller++ + ". " +
                        Superhelt.getHeroName() + " " +
                        Superhelt.getRealName() + " " +
                        Superhelt.getSuperPower() + " " +
                        Superhelt.getYearCreated() + " " +
                        Superhelt.getIsHuman() + " " +
                        Superhelt.getStrenght()
                );
                int superheltValg = keyboard.nextInt();
                keyboard.nextLine();
                superheltDerSkalRedigeres = søgeResultat.get(superheltValg - 1);
            }
        } else {
            superheltDerSkalRedigeres = søgeResultat.get(0);
        }

        if (superheltDerSkalRedigeres != null) {
            System.out.println("Rediger personinformation. Tryk ENTER hvis information ikke skal redigeres.");
            String nyVærdi;
            System.out.println("Helte navn: " + superheltDerSkalRedigeres.getHeroName());
            nyVærdi = keyboard.nextLine();
            if (!nyVærdi.isEmpty()) {
                superheltDerSkalRedigeres.setHeroName(nyVærdi);
            }
            System.out.println("Rigtige navn: " + superheltDerSkalRedigeres.getRealName());
            nyVærdi = keyboard.nextLine();
            if (!nyVærdi.isEmpty()) {
                superheltDerSkalRedigeres.setRealName(nyVærdi);
            }
            System.out.println("Lavet år:: " + superheltDerSkalRedigeres.getYearCreated());
            nyVærdi = keyboard.nextLine();
            if (!nyVærdi.isEmpty()) {
                superheltDerSkalRedigeres.setYearCreated(Integer.parseInt(nyVærdi));
            }
            System.out.println("Superkraft: " + superheltDerSkalRedigeres.getSuperPower());
            nyVærdi = keyboard.nextLine();
            if (!nyVærdi.isEmpty()) {
                superheltDerSkalRedigeres.setSuperPower(nyVærdi);
            }
            System.out.println("IsHuman: " + superheltDerSkalRedigeres.getIsHuman());
            nyVærdi = keyboard.nextLine();
            if (!nyVærdi.isEmpty()) {
                superheltDerSkalRedigeres.setIsHuman(nyVærdi);
            }
            System.out.println("Strenght: " + superheltDerSkalRedigeres.getStrenght());
            nyVærdi = keyboard.nextLine();
            if (!nyVærdi.isEmpty()) {
                superheltDerSkalRedigeres.setStrenght(Double.parseDouble(nyVærdi));
            }

            System.out.println(superheltDerSkalRedigeres + " er opdateret.");

        }

    }
}