package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter(); // 정적 중첩 클래스는 외부 클래스와 아무 관계가 없기 때문에 없어도 아무 문제가 없음
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
