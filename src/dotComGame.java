/**
 * Created by root on 18/02/17.
 */
public class dotComGame {
    int[] location;
    int numOfHit = 0;
    int numOfGuess = 0;

    public void randLocation() {
        int num = (int) ((Math.random()) * 5);
        location = new int[]{num, num + 1, num + 2};
    }

    public String checkGuess(int guess) {
        String result = "miss";
        for (int cell : location) {
            if (guess == cell) {
                result = "hit";
                numOfHit++;
                break;
            }
        }
        numOfGuess++;

        if (numOfHit == location.length) {
            result = "kill";
            System.out.println("You took "+ numOfGuess+ " guesses");
        }
        System.out.println(result);
        return result;
    }

}