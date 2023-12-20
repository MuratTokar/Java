package day_064_mrt;

public class C063 {
    public static void main(String[] args) {
        Tool aTool=new ReportTool();
        Tool bTool=new Tool();
        callExport(aTool);
        callExport(bTool);

    }
    public static void callExport(Exportable ex){
        ex.export();
    }

}
interface Exportable{
    void export();

}
class Tool implements Exportable{

    public void export() {    // line n1
        System.out.println("Tool :: export");

    }
}
class ReportTool extends Tool{
    //void export(){  // public void export() olmali           // line n2
    public void export(){  // public void export() olmali
        System.out.println("RTool :: export");
        // cevap B--Compilation fails only at line n2


    }
}
