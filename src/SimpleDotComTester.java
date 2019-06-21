public class SimpleDotComTester {
    public static void main(String[] args) {
        SimpleDotCom dot=new SimpleDotCom();
        int []locations={2,3,4};
        dot.setLocationcells(locations);
        String userguess="2";
        String result=dot.checkYourself(userguess);
    }
}
