import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.solution("Wolrd"));

        }
    }

class Kata {
    public static String solution(String str) {
    String newcad="";

    for(int i = str.length()-1; i >= 0; i--){
        newcad += str.charAt(i);
    }

    return newcad;
}

}