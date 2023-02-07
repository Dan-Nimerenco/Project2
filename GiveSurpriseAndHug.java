package Junior_Part.Proiect_P2;

public class GiveSurpriseAndHug extends AbstractGiveSurprises{

    public GiveSurpriseAndHug(String typeContainer, int timpAsteptare){
        super(typeContainer,timpAsteptare);
    }

    @Override
    public void give(){
        super.give();
        this.giveWithPassion();
    }

    @Override
    public void giveAll(){
        super.giveAll();
        this.giveWithPassion();
    }

    @Override
    public void giveWithPassion(){
        System.out.println("Warm wishes and a big hug!");
    }
}
