package day_060_hakan;

import java.io.IOException;

public class Q6 {
    public void printFileContent() throws IOException {
        // code block
        throw new IOException(); // checked exception
       // throw new NumberFormatException(); // unchecked exception
        //throw new InterruptedException(); // checked exception
       // throw new SQLException(); // checked exception
       // throw new FileNotFoundException(); // checked exception
         /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e){

        }*/
    }
}

class Test {
    public static void main(String[] args) throws IOException {
        Q6 q6 = new Q6();
       // try {
            q6.printFileContent();
        //} catch (IOException e){}
    }
}
