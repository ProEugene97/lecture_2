import java.io.File;
import java.io.IOException;

public class Main {

    public static void create_dir() {
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder path = new StringBuilder();
        int count = (int)(Math.random()*20);
        for(int i = 0; i < count; i++)
            path.append(symbols.charAt((int)(Math.random()*symbols.length())));
        File newDir = new File(path.toString());
        newDir.mkdir();
        path.append("/text.txt");
        File newFile = new File(path.toString());
        try
        {
            newFile.createNewFile();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
    public static void main(String[] args) {
        create_dir();
        System.out.println("Hello, world!");
    }
}