package JavaSE.TestNasledie;

public class Footballer extends Sportsman{
    private String position;
    private String club;

    public Footballer() {
    }

    public Footballer(String position, String club) {
        this.position = position;
        this.club = club;
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String play() {
        return "Footballer " + getFullName() + " from " + getCountry()
                + ", " + getAge() + " years old, " + position + " is playing for " + club + ".";
    }
}
