package day_049_hakan.enums;

public class EnumTest {

    public static void main(String[] args) {
        String userType = "student";
        String testEnv = "qa";

        loginToEnvWithGivenUser(User.getUserWithText(userType), TestEnv.getTestEnvWithText(testEnv));
    }

    public static void loginToEnvWithGivenUser(User user, TestEnv testEnv){
        System.out.println(String.format("Username : %s ",user.getUsername()));
        System.out.println(String.format("Username : %s ",user.getPassword()));
        System.out.println(String.format("Username : %s ",user.getAccessLevel()));
        System.out.println(String.format("NavigateTo : %s ",testEnv.getValue()));
    }

    public enum User {
        STUDENT("student@gmail.com", "123456st", 2),
        INSTRUCTOR("instructor@gmail.com", "123456in", 4),
        DIRECTOR("director@gmail.com", "123456dir", 5);


        final private String USERNAME;
        final private String PASSWORD;
        final private int ACCESS_LEVEL;

        User(String username, String password, int access_level) {
            this.USERNAME = username;
            this.PASSWORD = password;
            this.ACCESS_LEVEL = access_level;
        }

        public String getUsername() {
            return USERNAME;
        }

        public String getPassword() {
            return PASSWORD;
        }

        public int getAccessLevel() {
            return ACCESS_LEVEL;
        }

        public static User getUserWithText(String text){
            switch (text){
                case "student":
                    return STUDENT;
                case "instructor":
                    return INSTRUCTOR;
                case "director":
                    return DIRECTOR;
                default:
                    throw new IllegalArgumentException("Entered value is not valid for test users");
            }
        }
    }

    public enum TestEnv{
        QA_ENV("www.qa.com"), // Enum Constant
        STAGING_ENV("www.staging.com");

        private final String VALUE;

        TestEnv(String value){
            this.VALUE = value;
        }

        public String getValue(){
            return VALUE;
        }

        public static TestEnv getTestEnvWithText(String text){
            switch (text){
                case "qa":
                    return QA_ENV;
                case "staging":
                    return STAGING_ENV;
                default:
                    throw new IllegalArgumentException("Entered value is not valid for test environment");
            }
        }
    }
}
