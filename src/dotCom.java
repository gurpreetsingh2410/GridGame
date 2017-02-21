import java.util.Scanner;
/**
 * Created by root on 18/02/17.
 */
public class dotCom {
   static String result;
   static int x = 0;
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        dotComGame dgame = new dotComGame();
        dgame.randLocation();
        do{
        System.out.printf("Please enter any number to play this game\n");
        result = dgame.checkGuess(sc.nextInt());
        }while(!"kill".equals(result));

    }
}
