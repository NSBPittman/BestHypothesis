import java.util.ArrayList;

public class CallClass {

    public static ArrayList<String> getBestMatches(String hyp, int numRes){
        ArrayList<String> bestArr = BestMatch.returnBestMatches(hyp, numRes);
        return bestArr;
    }
    public static void main(String[] args) {
        String hyp = "I believe the patient has hyperthyroid and sclerosis";
        ArrayList<String> bestMatches = getBestMatches(hyp, 5);
        System.out.println("Best Options:");
        int i = 1;
        for (String bestOp : bestMatches){
            System.out.println(i + ": " + bestOp);
            i++;
        }
    }

}
