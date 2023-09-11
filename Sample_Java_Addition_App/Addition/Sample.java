import java.io.File;

public class Sample {
    public static void main(String args[]){
        try{
            Runtime rt = Runtime.getRuntime();
            rt.exec("cmd.exe /c start cmd.exe /k \"java Crypto\"");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}