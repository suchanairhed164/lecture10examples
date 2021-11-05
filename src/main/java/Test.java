/*
public class Test {
    static int x;
    public Test() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.test(5);
        System.out.println("Member value x = "
                + x);
    }
    private void test(int x){
        this.x = x + 5;
        System.out.println("Local value x = "
                + x);
    }
}

 */
/*
import java.io.*;
public class Test {

    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.doFileInput("bogus.file");
        }
        catch (IOException ex) {
            System.out.println("Second exception handle stack trace");
            ex.printStackTrace();
        }
    }

    private String doFileInput(String fileName)
            throws FileNotFoundException,IOException {
        String retStr = "";
        java.io.FileInputStream fis = null;
        try {
            fis = new java.io.FileInputStream(fileName);
        }
        catch (FileNotFoundException ex) {
            System.out.println("First exception handle stack trace");
            ex.printStackTrace();
            throw ex;
        }
        return retStr;
    }
}

 */
import java.io.*;

public class Test {

    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.doFileInput();
        }
        catch (IOException ex) {
            System.out.println("Exception hash code " + ex.hashCode());
            ex.printStackTrace();
        }
    }

    private String doFileInput()
            throws FileNotFoundException,IOException{
        String retStr = "";
        java.io.FileInputStream fis = null;
        try {
            fis = new java.io.FileInputStream("bogus.file");
        }
        catch (FileNotFoundException ex) {
            System.out.println("Exception hash code " + ex.hashCode());
            ex.printStackTrace();
            fis = new java.io.FileInputStream("anotherBogus.file");
            throw ex;
        }
        return retStr;
    }
}