public class PrimitiveOperations {
    public static void main(String[] args) {
        int favoriteNum = 7;
        double pi = 3.14;

        System.out.println(favoriteNum);
        System.out.println(pi);

        double product = favoriteNum * pi;
        System.out.println(product);

        double favoriteNumAsDouble = (double) favoriteNum;
        System.out.println(favoriteNumAsDouble);

        int piAsInt = (int) pi;
        System.out.println(piAsInt);

        char favoriteChar = 'A';
        System.out.println(favoriteChar);
        
        System.out.println((char) ((int) favoriteChar + 32));
    }
}
