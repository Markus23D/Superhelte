import java.util.ArrayList;

public class Database {


    private ArrayList<Superhelt> superHelteListe = new ArrayList<>();

    int count;

    public ArrayList<Superhelt> getSuperHelteListe() {
        return superHelteListe;
    }

    public void tilføjSuperHelte(String heroName, String realName, String superPower, int yearCreated, String isHuman, double strenght) {
        superHelteListe.add(new Superhelt(heroName, realName, superPower, yearCreated, isHuman, strenght));

    }

    //Vis alle superhelte
    public void visSuperhelte() {
        for (Superhelt superhelte : superHelteListe) {
            System.out.println("\u2500".repeat(50));
            System.out.println(superhelte);

        }
    }

    //søgefunktion
    public ArrayList<Superhelt> findHeroName(String heroName) {
        ArrayList<Superhelt> heroNames = new ArrayList<>();
        boolean heroFound = false;
        for (Superhelt superhelt : superHelteListe) {
            if (superhelt.getHeroName().toLowerCase().contains(heroName.toLowerCase())) {
                heroNames.add(superhelt);
                heroFound = true;
            }
        }
        if (!heroFound) {
            System.out.println("Der findes ingen helte i listen med navn: " + "\"" + heroName + "\"");
        }


        return heroNames;
    }
        //Redigering
        public void sletSuperhelt (Superhelt superhelt){
            if (superHelteListe.contains(superhelt)) {
                superHelteListe.remove(superhelt);

            } else {
                System.out.println(superhelt.getHeroName() + " blev ikke fundet i databasen.");
            }
        }


    }






