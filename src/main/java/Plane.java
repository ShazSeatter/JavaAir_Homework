public class Plane {

    PlaneType type;

    public Plane(PlaneType type) {
        this.type = type;
    }

    public int getPlaneCapacity() {
        return type.getCapacity();
    }

    public int getTotalWeight() {
        return type.getTotalWeight();
    }
}
