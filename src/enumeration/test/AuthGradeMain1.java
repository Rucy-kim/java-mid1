package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            printAuthGrade(authGrade);
        }
    }

    private static void printAuthGrade(AuthGrade grade) {
        System.out.println("grade=" + grade + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription());
    }
}
