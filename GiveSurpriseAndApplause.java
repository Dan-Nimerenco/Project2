package Junior_Part.Proiect_P2;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises{

    public GiveSurpriseAndApplause(String typeContainer, int timpAsteptare){
        super(typeContainer,timpAsteptare);
    }

    @Override
    public void give(){
        super.give();
        this.giveWithPassion();
    }

    @Override
    public void giveAll(){
        this.giveWithPassion();
        super.giveAll();
        // Aici sunt confuz, daca se vrea aplauze dupa fiecare cadou dat, sau dupa ce toti iau cadourile.
    }

    @Override
    public void giveWithPassion(){
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }
}
