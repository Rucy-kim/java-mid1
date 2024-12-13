package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요: ");
        String gradeName = input.nextLine();

        AuthGrade grade = AuthGrade.valueOf(gradeName.toUpperCase());
        printMenuList(grade);
    }

    private static void printMenuList(AuthGrade grade) {
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
        System.out.println("== 메뉴 목록 ==");
        System.out.println("- 메인 화면");

        if (grade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }

        if (grade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }
}
