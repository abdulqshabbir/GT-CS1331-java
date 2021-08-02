public class Dog implements Comparable<Dog>{
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) o;
        if (dog.name.equals(this.name) && dog.weight == this.weight) {
            return true;
        }
        return false;
    }

    public int compareTo(Dog otherDog) {
        if (this.weight > otherDog.weight) {
            return 1;
        } else if (this.weight < otherDog.weight) {
            return -1;  
        } else {
            return 0;
        }
    }
    public String toString() {
        return String.format("Dog's weight: %.1f", this.weight);

    }
}
