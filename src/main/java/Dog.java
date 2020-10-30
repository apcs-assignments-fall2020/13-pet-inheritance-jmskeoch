public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog() {
        super("Max", 1);
        this.breed = "Labrador Retriever";
    }

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Woof!");
    }

    // toString method
    @Override
    public String toString() {
        String x = this.getName() + " , " + this.getAge() + " , " + this.breed;
        return x;
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = (breed.trim().length() != 0) ? breed : this.breed;
    }
}