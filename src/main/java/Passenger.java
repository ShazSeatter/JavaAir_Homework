
public class Passenger extends Person{
    public int numOfBags;
    public Passenger(String name, int numOfBags) {
        super(name);
        this.numOfBags = numOfBags;
    }

    public int getNumOfBags() {
        return numOfBags;
    }
}
