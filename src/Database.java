import java.util.ArrayList;

public class Database {

    private ArrayList<Superhelt> superHelteListe = new ArrayList();

    int count;

    public Database() {
        this.superHelteListe= new Superhelt[5];

    }

    public void tilføjSuperHelte(String heroName, String realName, String superPower, int yearCreated, String isHuman, double strenght){
        superHelteListe[count ++] = new Superhelt(heroName, realName, superPower, yearCreated, isHuman, strenght);

    }




}
