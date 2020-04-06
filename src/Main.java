public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        DEV1 developer1 = new DEV1();
        DEV2 developer2 = new DEV2();
        System.out.println(developer1.author);
        System.out.println(developer2.author);
    }
}
