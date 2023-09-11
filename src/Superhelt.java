public class Superhelt {
    private String heroName;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private double strenght;

    //Konstruktør
    public Superhelt (String heroName, String realName,String superPower, int yearCreated, String isHuman, double strenght){
        this.heroName = heroName;
        this.realName=realName;
        this.superPower=superPower;
        this.yearCreated=yearCreated;
        this.isHuman=isHuman;
        this.strenght=strenght;
    }

    //get metode
    public String getHeroName(){
        return heroName;
    }

    public String getRealName(){
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getYearCreated(){
        return yearCreated;
    }

    public String getIsHuman() {
        return isHuman;
    }

    //set metode



}
