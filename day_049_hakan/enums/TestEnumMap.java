package day_049_hakan.enums;

import java.util.HashMap;
import java.util.Map;

public class TestEnumMap {

    public enum User {
        USER_CREDENTIALS(new HashMap<>(){{
            put("student","studentObject");
            put("instructor","instructorObject");
        }});

        final private Map<String,Object> USERS;

        User(Map<String,Object> users) {
            this.USERS = users;
        }

    }

}
