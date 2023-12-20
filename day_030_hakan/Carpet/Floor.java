package day_030_hakan.Carpet;

public class Floor {
    int width;
    int length;

    public Floor(int width, int length){
        System.out.println("Floor objecti olusturuluyor");
        this.width = width;
        this.length = length;
    }

    public int getArea(){
        System.out.println("Alan hesaplaniyor");
        return width*length;
    }
}
