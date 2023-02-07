package Junior_Part.Proiect_P2;

import java.util.ArrayList;

public class MinionToy implements ISurprise{
    private String minionName;
    private static final String[] minionList= {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private static MinionToy m;

    //Constructors
    public MinionToy(String minionName){
        this.minionName=minionName;
    }

    public static void generate(){
        String s = minionList[ISurprise.numarAleator(0,minionList.length-1)];
        MinionToy.m = new MinionToy(s);
    }

    public static MinionToy getM() {
        return MinionToy.m;
    }

    @Override
    public void enjoy() {
        System.out.println("Hi, my name is " + minionName + " and I am your minion now!!!");
    }
}
