package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        // 모든 enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자일 경우 IllegalArgumentException 반환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);  // toString() 오버라이디 가능
    }
}
