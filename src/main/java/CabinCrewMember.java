public class CabinCrewMember extends Person {

    private RankType rank;
    public CabinCrewMember(String name, RankType rankType) {
        super(name);
        this.rank = rankType;
    }


    public RankType getRank() {
        return rank;
    }

    public String messageToPassengers() {
        return "Ladies and gentlemen, the Captain has turned on the Fasten SeAT Belt sign!";
    }
}
