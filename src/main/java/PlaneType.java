public enum PlaneType {
    BOEING747(10, 1000);

    private final int capacity;
    private final int totalWeight;

    PlaneType (int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }


//    has capacity of 10 passengers, and weights 10,000 kg
}
