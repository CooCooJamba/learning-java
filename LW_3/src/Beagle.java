class Beagle extends Dog {
    private boolean health;
    public Beagle(String breed, String color, String name, int weight, boolean health) {
        super(breed, color, name, weight);
        this.health = health;
    }
    @Override
    public String toString() {
        return getBreed() + ", " + getColor() + ", " + getName() + ", " + getWeight() + ", " + isHealth();
    }
    public boolean isHealth() {
        return health;
    }
    public void setHealth(boolean health) {
        this.health = health;
    }
}
