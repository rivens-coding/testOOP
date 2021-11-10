import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PhanTu<T>{
    private T t;
    private T[] arr;
    public boolean isGreaterThan(T a) {
        int intt = (int)t;
        int inta = (int)a;
        if(Integer.compare(intt,inta)==1)
            return true;
        return false;
    }
    public static void main(String[] args){
        File file = new File(”data.txt”);
        FileReader reader = new FileReader(file);
        BufferedReader in = new BufferedReader(reader);
        int a;
        try {
            a = in.read();
        }
        catch (IOException e)
    }
}

