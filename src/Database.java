

public class Database {

    private Superhelt[] superHelteListe;
    int count = 0;

    public Database() {
        this.superHelteListe= new Superhelt[5];
    }
    public void tilføjSuperHelte(String heroName, String realName, String superPower, int yearCreated, String isHuman, double strenght){
        superHelteListe[count ++] = new Superhelt(heroName, realName, superPower, yearCreated, isHuman, strenght);

    }




}
