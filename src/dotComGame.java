import java.util.ArrayList;
/**
 * Created by root on 18/02/17.
 */
public class dotComGame {


    ArrayList<String> location = new ArrayList<>();
    int numOfHit = 0;
    int numOfGuess = 0;

    public void setLocation() {
        this.location = location;
        location.add("1");
        location.add("2");
        location.add("3");
    }

    public String checkGuess(int guess) {
        String result = "miss";
        int indexOfCell = location.indexOf(String.valueOf(guess));
        if(indexOfCell >= 0){
            location.remove(indexOfCell);
            if(location.isEmpty()) {
                result = "kill";
                }else {
                    result ="hit";
                }
            }
        System.out.println(result);
        return result;
    }

}