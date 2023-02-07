package Junior_Part.Proiect_P2;

public class Main {

    public static void main(String[] args){
        // TODO Random-Bag with surprises, after we move surprises into a bag with LIFO rules, and giving all
        //  with applause to children
        GatherSurprises gener = GatherSurprises.getInstance();
        BagFactory factory = BagFactory.getInstance();
        GiveSurpriseAndApplause decembrie25 = new GiveSurpriseAndApplause("lifo", 2);
        IBag punga = factory.makeBag("random");
        ISurprise[] surprizeCopii = gener.gather(15);
        for (ISurprise i : surprizeCopii){
            punga.put(i);
        }
        System.out.println(punga.isEmpty());
        decembrie25.put(punga);
        decembrie25.giveAll();
        System.out.println(punga.isEmpty());

        // TODO FIFO Bag, and giving all with singing
//        GiveSurpriseAndSing december31 = new GiveSurpriseAndSing("FiFO",1);
//        ISurprise x = gener.gather();
//        ISurprise y = gener.gather();
//        ISurprise z = gener.gather();
//        december31.put(x);
//        december31.put(y);
//        december31.put(z);
//        System.out.println("Surprizele vor fi adaugate in december 31, in ordinea urmatoare: ");
//        x.enjoy();
//        y.enjoy();
//        z.enjoy();
//        System.out.println("Deci ordinea cu care in continuare trebuie sa vedem iesirile, sa fie \n" +
//                "aceeasi cu care au fost adaugate (FIFO)");
//        december31.giveAll();

        // TODO LIFO Bag, and giving all with hugging
//        GiveSurpriseAndHug mai31 = new GiveSurpriseAndHug("lifO", 3);
//        ISurprise x = gener.gather();
//        ISurprise y = gener.gather();
//        ISurprise z = gener.gather();
//        mai31.put(x);
//        mai31.put(y);
//        mai31.put(z);
//        System.out.println("Surprizele vor fi adaugate in december 31, in ordinea urmatoare: ");
//        x.enjoy();
//        y.enjoy();
//        z.enjoy();
//        System.out.println("Deci ordinea cu care in continuare trebuie sa vedem iesirile, sa fie \n" +
//                "inversa celei cu care au fost adaugate (LIFO)");
//        System.out.println("Is it Empty? : " + mai31.isEmpty());
//        mai31.giveAll();
//        System.out.println("Is it Empty now? :" + mai31.isEmpty());
    }
}
