package day_32_murat;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer=new Printer(0.30);
        System.out.println(printer.getTonerLevel());//100
        printer.fillUpToner(20);//%20
        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.printPage(100);
        System.out.println(printer.getPrintedPageNumber());//107
        System.out.println(printer.getTonerLevel());//70
        printer.fillUpToner(20);//90


    }
}
