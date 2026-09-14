import java.util.*;
public class reverseStr{
    public static void main(String args[]){
        String name = "prince";
        String reveString = "";

        for(int i = name.length()-1; i>=0; i--){
            reveString += name.charAt(i);
        }

        System.out.println(reveString);
    }
}