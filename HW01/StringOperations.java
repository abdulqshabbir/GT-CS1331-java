public class StringOperations {
    public static void main (String[] args) {
        String name = "Abdul";
        String newName = "A" + name.substring(1, name.length() - 1) + "Z";

        System.out.println(name);
        System.out.println(newName);

        String url = "www.abdulqshabbir.com";
        System.out.println(url);

        int firstPeriodIdx = url.indexOf(".");
        int secondPeriodIdx = url.indexOf(".", firstPeriodIdx + 1);
        String urlName = url.substring(firstPeriodIdx + 1, secondPeriodIdx) + "1331"; 
        System.out.println(urlName);
    }
}
