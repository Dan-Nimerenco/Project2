package Junior_Part.Proiect_P2;

public class BagFactory implements IBagFactory{

    private static final BagFactory instance = new BagFactory();

    private BagFactory(){}

    public static BagFactory getInstance(){
        return BagFactory.instance;
    }
    @Override
    public IBag makeBag(String type){

        type = type.toLowerCase().trim();
        switch (type){
            case "random":
                return new TolbaAleatoare();
            case  "fifo":
                return new TolbaFIFO();
            case  "lifo":
                return new TolbaLIFO();
        }
        System.out.println("There is no such a type of container!" +
                "The available ones are:\n" +
                "1. RANDOM\n" +
                "2. FIFO\n" +
                "3. LIFO");
        return null;
    }
}
