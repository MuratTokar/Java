package day_32_murat;

import java.util.Random;

public class Student {
private String name;
private int id;
private String classRaum;
private  int age;

public Student(String name,int age){
    assignClassRaum();

}


public String getName(){
    return this.name;

}
public void setName(String name){
    this.name=name;
}
public String getClassRaum(){
    return  this.classRaum;

}
public void setClassRaum(String classRaum){
    this.classRaum=classRaum;
}
public int getAge(){
    return  this.age;
}
public void setAge(int age){
    this.age=age;
}
public int getId(){
    return this.id;
}
public void setId(int id){
    this.id=id;
}
public String assignClassRaum(){
    Random rn=new Random();
    return  rn.nextInt(100,111 ) + "";



}
}
