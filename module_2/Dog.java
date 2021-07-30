public class Dog {
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

    public static void main (String[] args) {
        Dog dog1 = new Dog("Princey", 7.3);
        Dog dog2 = new Dog("Princey", 7.3);

        System.out.println("Are dog1 and dog2 equal?");
        System.out.println(dog1.equals(dog2));
    }
}
