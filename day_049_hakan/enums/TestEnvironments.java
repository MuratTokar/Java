package day_049_hakan.enums;

public enum TestEnvironments {
    QA_ENV("www.qa.com"), // Enum Constant
    STAGING_ENV("www.staging.com"),
    USERNAME("java@guidersoft.com"),
    PASSWORD("123456qw");


    private final String VALUE;

    TestEnvironments(String value){
        this.VALUE = value;
    }

    public String getValue(){
        return this.VALUE;
    }

    public static String getValues(){
        String values = "";
        for(TestEnvironments testEnvironments : TestEnvironments.values()){
            values += testEnvironments.VALUE + " ";
        }
        return values;
    }

    public static TestEnvironments getTestEnvironmentWithText(String text){
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
