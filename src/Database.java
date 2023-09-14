import java.util.ArrayList;

public class Database {

    private ArrayList<Superhelt> superHelteListe = new ArrayList();

    int count;

    public Database() {
        this.superHelteListe= new Superhelt[5];

    }

    public void tilføjSuperHelte(String heroName, String realName, String superPower, int yearCreated, String isHuman, double strenght){
        superHelteListe.add (new Superhelt(heroName, realName, superPower, yearCreated, isHuman, strenght));

    }

    //Vis alle superhelte
    public void visSuperhelte(){
        for (Superhelt superhelte:superHelteListe) {
            System.out.println("\u2500".repeat(50));
            System.out.println(superhelte);
            
        }
    
    }





}
