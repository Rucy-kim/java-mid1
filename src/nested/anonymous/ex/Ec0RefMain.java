package nested.anonymous.ex;

public class Ec0RefMain {

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }

    public static void hello(String msg) {
        System.out.println("프로그램 시작");  // 변하지 않는 부분
        System.out.println("Hello " + msg); // 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }
}