import java.util.ArrayList;
import java.util.Scanner;
public class Al{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String userInput;
        ArrayList<String> a = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            System.out.print("Whats your favorite ice cream flavor: ");
            userInput = s.next();
            System.out.println();
            a.add(userInput);
        }
        s.close();
        System.out.println(a);
    }
}