package day_015_hakan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\HS\\Desktop\\JavaTraining\\Day_015\\test.txt");
        Scanner input = new Scanner(file);
        String lineData;
        int lineNumber=1;
        while(input.hasNextLine()){
            lineData = input.nextLine();
            System.out.println("Line " + lineNumber + " : " + lineData);
            lineNumber++;
        }


    }
}
