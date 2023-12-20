package day_070_mrt;

public class C199 {
    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;

        // res=stuff.equals("TV")?"Walter":stuff.equals("Movie")? "White":"No result";  // cevap =D

        if (stuff.equals("TV")) {
            res = "Walter";
        } else if (stuff.equals("Movie")) {
            res = "White";
        } else {
            res = "No Result";
        }
    }// if blogunun yaptigi isi baska nasilo yapabilirz?
}