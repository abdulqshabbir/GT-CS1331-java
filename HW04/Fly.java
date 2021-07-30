public class Fly {
    private double mass;
    private double speed;

    public Fly() {
        this(5.0);
    }
    public Fly(double mass) {
        this(mass, 10.0);
    }
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }
    public double getMass() {
        return this.mass;
    }
    public double getSpeed() {
        return this.speed;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public String toString() {
        if (this.mass == 0.0) {
            return "I’m dead, but I used to be a fly with a speed of "+ this.speed + ".";
        } else {
            return "I’m a speedy fly with "+ this.speed +" speed and " + this.mass + " mass.";
        }
    }
    public void grow(int addedMass) {
        while (addedMass > 0) {
            if (this.mass < 20) {
                this.speed++;
                this.mass++;
                addedMass--;
            } else {
                this.speed = this.speed - 0.5;
                this.mass++;
                addedMass--;
            }
        }
    }
    public boolean isDead() {
        return this.mass == 0.0;
    }
    public static void main (String[] args) {
        Fly prince = new Fly(0, 5);
        System.out.println(prince.isDead());
    }
}
