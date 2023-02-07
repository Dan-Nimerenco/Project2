package Junior_Part.Proiect_P2;
import java.util.Random;
public class Candies implements ISurprise {
    private final int nrCandies;
    private final String candyType;
    private static final String[] candyNames = {"Snickers", "Mars", "Twix", "Kit-Kat", "Bounty", "Milky-Way", "M&Ms"};
    private static Candies c;
//    private static Random random = new Random();
    //Constructors
    public Candies(int nrCandies, String candyType){
        this.nrCandies=nrCandies;
        this.candyType=candyType;
    }
    //Methods


    public static Candies getC() {
        return Candies.c;
    }

    public static void generate(){
        int nrB = ISurprise.numarAleator(1,15);
        String s = candyNames[ISurprise.numarAleator(0,(Candies.candyNames.length-1))];
        Candies.c = new Candies(nrB,s);
    }

    @Override
    public void enjoy() {
        System.out.println("Savureaza " + this.nrCandies + " " + this.candyType+"-uri. !!!");
    }
}
