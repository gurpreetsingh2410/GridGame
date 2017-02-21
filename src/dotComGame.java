/**
 * Created by root on 18/02/17.
 */
public class dotComGame {
    int[] location = {2, 3, 4};
    int numOfHit = 0;
    int count = 0;

    public void setLocation(int[] location) {
        this.location = location;
    }

    public String checkGuess(int guess) {
        String result = "miss";
        count = count + 1;

        for (int cell : location) {
            if (guess == cell) {
                result = "hit";
                numOfHit++;
                break;
            }
        }

        if (numOfHit == location.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}