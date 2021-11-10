import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import edu.princeton.cs.algs4.*;

public class PhanTu<T extends Comparable<T>>{
    private T t;
    public PhanTu(){}

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public boolean isGreaterThan(T a) {
        if(t.compareTo(a)>0)
            return true;
        return false;
    }

    public static void fileIO(String input,String output){
            In in = new In(input);
            Out out = new Out(output);
            List<Integer> numbers = new ArrayList<>();
            while(!in.isEmpty()) {
                int a = in.readInt();
                numbers.add(a);
            }
            Collections.sort(numbers);
            for(Integer integer : numbers){
                out.println(integer.toString());
            }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Integer number = sc.nextInt();
        PhanTu<Integer> n = new PhanTu<>();
        n.setT(number);
        Integer m = sc.nextInt();
        System.out.println(n.isGreaterThan(m));

        String input = args[0];
        String output = args[1];
        fileIO(input,output);
    }
}

