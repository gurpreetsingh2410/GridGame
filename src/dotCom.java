/**
 * Created by root on 18/02/17.
 */
public class dotCom {
   static String result;
   static int x = 0;
    public static void main (String args[]){
        dotComGame dgame = new dotComGame();
        GameHelper gh = new GameHelper();

        dgame.setLocation();

       do{
       System.out.println("Enter any number");
        int guess = gh.UserInput();
        result = dgame.checkGuess(guess);
       }while(!"kill".equals(result));

    }
}
