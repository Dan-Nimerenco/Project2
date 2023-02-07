package Junior_Part.Proiect_P2;

import java.util.Random;

public final class GatherSurprises {
    private static Random random = new Random();
    private static int numarAleator(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static GatherSurprises instance;

    private GatherSurprises(){};

    public static GatherSurprises getInstance(){
        if (instance == null){
            instance = new GatherSurprises();
        }
        return instance;
    }
    public ISurprise gather(){
        int num = numarAleator(1,4);
        switch (num){
            case 1:
                FortuneCookie.generate();
                return FortuneCookie.getF();

            case 2:
                Candies.generate();
                return Candies.getC();

            case 3:
                MinionToy.generate();
                return MinionToy.getM();

        }
        return null;
    }

    public ISurprise[] gather(int n){
        ISurprise[] nSurprises = new ISurprise[n];
        for (int i=0;i<=n-1;i++){
            nSurprises[i] = this.gather();
        }
        return nSurprises;
    }
}
