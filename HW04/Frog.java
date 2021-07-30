public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";

    public Frog(String name) {
        this(name, 5, 5.0);
    }
    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int) ageInYears * 12, tongueSpeed);
    }
    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.isFroglet = this.age > 1 && this.age < 7;
    }
    public void grow(int months) {
        while (months > 0) {
            if (this.age  < 12) {
                this.age++;
                this.tongueSpeed++;
                months--;
            } else if (this.age >= 30) {
                this.age++;
                if (this.tongueSpeed >= 6.0) {
                    this.tongueSpeed--;
                }
                months--;
            } else {
                this.age++;
                months--;
            }
        }
        this.isFroglet = this.age > 1 && this.age < 7; 
    }
    public void grow() {
        if (this.age < 12) {
            this.age++;
            this.tongueSpeed++;
        } else if (this.age >= 30) {
            this.age++;
            if (this.tongueSpeed >=6.0) {
                this.tongueSpeed--;
            }
        } else {
            this.age++;
        }
    }
    public String toString() {
        if (this.isFroglet) {
            return String.format("My name is %s and I’m a rare froglet! I’m %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
        } else {
            return String.format("My name is %s and I’m a rare frog. I’m %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
        }
    }
    public static String getSpecies() {
        return Frog.species;
    }
    public static void setSpecies(String species) {
        Frog.species = species;
    }
    public void eat(Fly fly) {
        if (fly.isDead()){
            return;
        }
        if (this.tongueSpeed > fly.getSpeed()) {
            if (fly.getMass() >= 0.5 * this.age) {
                // fly is caught
                this.grow();
                fly.setMass(0);
            } 
        } else {
            fly.grow(1);
        }
    }
}
