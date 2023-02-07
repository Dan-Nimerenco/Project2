package Junior_Part.Proiect_P2;

import java.util.ArrayList;

public class TolbaFIFO implements IBag{
    private ArrayList<ISurprise> BagFIFO = new ArrayList<ISurprise>();

    @Override
    public void put(ISurprise newSurprise){
        this.BagFIFO.add(newSurprise);
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
            ISurprise x = this.BagFIFO.get(0);
            this.BagFIFO.remove(0);
            return x;
        }
        else{
            System.out.println("There are no more surprises inside");
            return null;
        }
    }

    @Override
    public boolean isEmpty(){
        return this.BagFIFO.size() == 0;
    }

    @Override
    public int size(){
        return this.BagFIFO.size();
    }
}
