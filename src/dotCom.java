import java.util.Scanner;
/**
 * Created by root on 18/02/17.
 */
public class dotCom {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        dotComGame dgame = new dotComGame();

        System.out.printf("Please enter any number to play this game\n");
        String result = dgame.checkGuess(sc.nextInt());

    }
}
