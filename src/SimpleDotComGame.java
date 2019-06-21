public class SimpleDotComGame {
    public static void main(String[] args) {
        int numofguesses=0;
        SimpleDotCom simpleDotCom=new SimpleDotCom();
        GameHelper helper=new GameHelper();
        int rand=(int)(Math.random()*5);
        int []locations={rand,rand+1,rand+2};
        simpleDotCom.setLocationcells(locations);
        boolean isalive=true;
        while(isalive==true){
            String guess=helper.getUserInput("Enter a Number");
            String result=simpleDotCom.checkYourself(guess);
            numofguesses++;
            if(result.equals("Kill")){
                isalive=false;
                System.out.println("You took"+numofguesses+"Guesses");
            }
        }
    }
}
