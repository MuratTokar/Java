package day_012_murat;

public class SwitchCase {
    public static void main(String[] args) {
int a=2,b=3;
char op='*';
switch (op){
    case '+':
        System.out.println("Toplam= " + (a+b));
        break;
    case '-':
        System.out.println("Fark= " + (a-b));
        break;
    case '*':
        System.out.println("Carpim = " + (a*b));
        break;
    case '/':
        System.out.println("Bölüm = " + (a/b));
        break;
    case '%':
        System.out.println("Mod = " + (a%b));
        break;
    default:
        System.out.println("Lütfen gecerli bir islem giriniz");
        break;


}
    }
}
