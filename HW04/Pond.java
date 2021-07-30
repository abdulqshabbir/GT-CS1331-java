public class Pond {
    public static void main (String[] args) {
        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog("Pepe", 10, 15.0);
        Frog peepaw = new Frog("Peepaw", 4.6, 5.0);
        Frog abdul = new Frog("Abdul", 29.0, 15.0);

        Fly fly1 = new Fly(1.0, 3.0);
        Fly fly2 = new Fly(6.0);
        Fly fly3 = new Fly(5.0);

        Frog.setSpecies("1331 Frogs");
        System.out.println(peepo);
        peepo.eat(fly2);
        System.out.println(fly2);
        peepo.grow(8);
        peepo.eat(fly2);
        System.out.println(fly2);
        System.out.println(peepo);
        System.out.println(abdul);
        peepaw.grow(4);
        System.out.println(peepaw);
        System.out.println(pepe);

    }
}
