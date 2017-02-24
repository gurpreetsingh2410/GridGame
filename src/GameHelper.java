import java.util.Scanner;

/**
 * Created by root on 24/02/17.
 */
public class GameHelper {
    int guess;
    Scanner sc = new Scanner(System.in);

    public int UserInput(){
        guess = sc.nextInt();
        return guess;
    }
}
