package Junior_Part.Proiect_P2;

public class GiveSurpriseAndSing extends AbstractGiveSurprises{

    public GiveSurpriseAndSing(String typeContainer, int timpAsteptare){
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
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
