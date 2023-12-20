package day_050_hakan;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private String id;
    private String classRoom;
    static Map<String, Student> studentList = new HashMap<>();

    Student(String name, String id, String classRoom){
        this.name = name;
        this.id = id;
        this.classRoom = classRoom;
        if(!studentList.containsKey(id)){
            studentList.put(id,this);
        } else {
            System.out.println("Maalesef, kaydimiz dolmustur (ayni id sebebi ile)");
        }
        //studentList.put(id,this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
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
