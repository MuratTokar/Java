package day_049_hakan.enums;



    public enum USER {
        STUDENT("student@gmail.com", "123456st", 2),
        INSTRUCTOR("instructor@gmail.com", "123456in", 4),
        DIRECTOR("director@gmail.com", "123456dir", 5);

        final private String USERNAME;
        final private String PASSWORD;
        final private int ACCESS_LEVEL;

        USER(String username, String password, int access_level) {
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
    }



