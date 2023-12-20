package day_069_hakan;

public class Q168 {
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try{
            for(String n : names){
                pwd[idx] = n.substring(2,6);
                idx++;
            }
        } catch(Exception e){
            System.out.println("Invalid Name");
        }

        for(String p : pwd){
            System.out.println(p);
        }
    }
}
// Thomas (6)       pwd [0] = omas   pwd = {"omas", null, null}

// Invalid Name
// omas
// null
// null