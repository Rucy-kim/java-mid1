package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";

        System.out.println("https로 시작하는가? " + url.startsWith("https"));
    }
}
