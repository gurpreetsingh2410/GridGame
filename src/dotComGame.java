/**
 * Created by root on 18/02/17.
 */
public class dotComGame {
    int[] location = new int[7];
    int numOfHit = 0;
    int count =0;

    public void setLocation(int[] location) {
        location[1] = 1;
        location[2] = 2;
        location[3] = 3;
    }

    public void checkGuess(int guess) {
            setLocation(location);
            count = count +1;
            if (location.length > 0 && guess < location.length && location[guess]!=0) {
                System.out.println("Hit");
                numOfHit = numOfHit +1;

                if(numOfHit == 3)
                {
                    System.out.println("Kill");
                    System.out.println("You have took "+count+" guess");
                    System.exit(0);
                }

            }
            else {
                System.out.println("Miss");
            }
    }
}