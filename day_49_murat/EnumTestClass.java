package day_49_murat;

public class EnumTestClass {
    public static void main(String[] args) {
String testEnv=TestEnvironments.QA_ENV.toString();
runTest(TestEnvironments.QA_ENV);
navigateTo(TestEnvironments.QA_ENV.VALUE);
        System.out.println(TestEnvironments.USERNAME.VALUE);
        System.out.println(TestEnvironments.PASSWORD.VALUE);
    }

    private static void navigateTo(String url) {
        System.out.println(String.format("Test `%s` uzerinde kosuluyor",url));
    }

    private static void runTest(TestEnvironments testEnvironments) {
        System.out.println("Test ´" + testEnvironments + " ` uzerinde kosuluyor"); // ikisde ayni islemi yapiyor
        System.out.println(String.format("Test `%s` uzerinde kosuluyor",testEnvironments));
    }
}
