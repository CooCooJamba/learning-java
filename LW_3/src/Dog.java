public abstract class Dog {
    private String breed;
    private String color;
    private String name;
    private int weight;

    public Dog(String breed, String color, String name, int weight) {
        this.breed = breed;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    public String getBreed() {
        return breed;
    };
    public String getColor() {
        return color;
    };
    public String getName() {
        return name;
    };
    public int getWeight() {
        return weight;
    };
    public void setBreed(String breed) {
        this.breed = breed;
    };
    public void setColor(String color) {
        this.color = color;
    };
    public void setName(String name) {
        this.name = name;
    };
    public void setWeight(int weight) {
        this.weight = weight;
    };
}
