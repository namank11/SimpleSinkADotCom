import java.util.Scanner;

public class SimpleDotCom {
    int [] locationcells;
    int numofhits=0;
    public void setLocationcells(int [] celllocations){
        locationcells=celllocations;
    }
    public String checkYourself(String stringguess){
        int guess=Integer.parseInt(stringguess);
        String result="miss";
        for(int n: locationcells){
            if(guess==n){
                result="hit";
                numofhits++;
                break;
            }
        }
        if(numofhits==locationcells.length){
            result="Kill";
        }
        System.out.println(result);
        return result;
    }
}
