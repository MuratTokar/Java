package day_063_hakan;

public class Q51 { }
interface Exportable{
    // Void export();  // default
    void export();  // default
    String f="a";
    // public final String f="a";
    // public final , varsayilan olarak atama otomatik yapilir
}

class Tool implements Exportable {
    // protected void export(){ // line n1
    public void export(){ // line n1
        System.out.println("Tool::export");
    }
}

class ReportTool extends Tool implements Exportable{
    public void export(){ // line n2
        System.out.println("RTool::export");
    }
    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Exportable ex) {
        ex.export();
    }
}
