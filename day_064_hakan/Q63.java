package day_064_hakan;

public class Q63 {
}
interface Exportable2 {
    // Void export();  // default
    void export();  // default
    String f="a";
    // public final String f="a";
    // public final , varsayilan olarak atama otomatik yapilir
}

class Tool implements Exportable2 {
    // protected void export(){ // line n1
    public void export(){ // line n1
        System.out.println("Tool::export");
    }
}

class ReportTool extends Tool implements Exportable2 {
    // alttaki method public olmadigi icin compilation error verir
    public void export(){ // line n2
        System.out.println("RTool::export");
    }
    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Exportable2 ex) {
        ex.export();
    }
}
