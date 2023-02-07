package Junior_Part.Proiect_P2;

import java.util.ArrayList;

public class TolbaAleatoare implements IBag{
    private ArrayList<ISurprise> BagRandom= new ArrayList<ISurprise>();

    @Override
    public void put(ISurprise newSurprise){
        this.BagRandom.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises){
        while(bagOfSurprises.size()!=0){
            this.put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut(){
        if (this.size()!=0){
            if (this.size()==1){
                ISurprise x = this.BagRandom.get(0);
                this.BagRandom.remove(0);
                return x;
            }
            int num = ISurprise.numarAleator(0,(this.BagRandom.size()-1));
            ISurprise x = this.BagRandom.get(num);
            this.BagRandom.remove(num);
            return x;
        }
        else{
            System.out.println("There are no more surprises inside");
            return null;
        }
    }

    @Override
    public boolean isEmpty(){
        return this.BagRandom.size() == 0;
    }

    @Override
    public int size(){
        return this.BagRandom.size();
    }
}
