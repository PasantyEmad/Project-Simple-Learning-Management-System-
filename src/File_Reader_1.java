import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Reader_1 {
    public static void main(String[] args) throws IOException {

        File file =new File("D:\\UDACITY\\JAVA\\Sales Invoice Generator-Java Project 1\\StudentData .csv");
        Scanner scan;
        scan = new Scanner(file);

        System.out.println("\n\nWelcome to LMS\n" +
                "created by {studentName_date}\n" +
                "====================================================================================\n" +
                "Home page\n" +
                "====================================================================================\n" +
                "Student list:\n");

        String file_contant = "";
        while (scan.hasNextLine()) {
            file_contant =file_contant.concat(scan.nextLine()+"\n\n");
        }

        System.out.println(file_contant);


        FileWriter writer = new FileWriter(("D:\\UDACITY\\JAVA\\Sales Invoice Generator-Java Project 1\\biboNewfile.txt"));
        writer.write((file_contant));
        writer.close();


        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.println("WRITE YOUR NAME PLZ");
        String str= sc.nextLine();              //reads string
    }
}
