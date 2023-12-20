package day_50_murat;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String id;
    private String classRoom;
    static Map<String, Student> studentlist = new HashMap<>();


    Student(String name, String id, String classRoom) {
        this.name = name;
        this.id = id;
        this.classRoom = classRoom;
       if (!studentlist.containsKey(id)) {
           studentlist.put(id, this);
        }else {
            System.out.println("Maalesef kaydimiz dolmustur");
        }
        studentlist.put(id, this);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getClassRoom() {
        return classRoom;
    }
}