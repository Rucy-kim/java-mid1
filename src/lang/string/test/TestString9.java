package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] strArray = email.split("@");
        System.out.println("ID: " + strArray[0]);
        System.out.println("Domain: " + strArray[1]);
    }
}
