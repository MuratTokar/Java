package day_064_hakan;

public class Q54 {
}

class Toy{
    public int calculatePrice(Toy t){
        // calculate the price
        return 0;
    }

    void printToy(Toy t){
        // print the details of the toy
    }
    // public int a(); gives compilation error, ya method body eklemeleiyiz
    // ya da abstract keyword u eklemeliyiz
}
class EduToy extends Toy{}
class ConsToy extends Toy{}

// abstract keyword e sahip olan method, body si olamaz
// body si olan method, abstract olamaz
