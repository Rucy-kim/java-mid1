package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없음
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); // 컴파일 오류 발생
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);  // 사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}
