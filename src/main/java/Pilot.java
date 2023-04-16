public class Pilot extends Person {

    private String pilotLicence;

    private RankType rank;

    public Pilot(String name, RankType rankType, String pilotLicence) {
        super(name);
        this.rank = rankType;
        this.pilotLicence = pilotLicence;
    }

    public RankType getRank() {
        return rank;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }
    public String fly() {
        return "The plane has taken off!";
    }
}


