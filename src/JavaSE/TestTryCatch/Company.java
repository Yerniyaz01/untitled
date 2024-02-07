package JavaSE.TestTryCatch;

public class Company {
    private String name;
    private Worker director;

    public Company() {
    }

    public Company(String name, Worker director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getDirector() {
        return director;
    }

    public void setDirector(Worker director) {
        this.director = director;
    }

    public String getData() {
        try {
            return "Company name: " + name + ". Information about director -> "
                    + director.getName() + " " + director.getSurname() + ".";
        }catch (Exception e) {
            return "Data not found";
        }
    }
}
