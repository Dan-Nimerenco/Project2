package Junior_Part.Proiect_P2;

import java.util.ArrayList;

public class TolbaLIFO implements IBag {
    private ArrayList<ISurprise> BagLIFO = new ArrayList<ISurprise>();

    @Override
    public void put(ISurprise newSurprise){
        this.BagLIFO.add(newSurprise);
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
            ISurprise x = this.BagLIFO.get(this.size()-1);
            this.BagLIFO.remove(this.BagLIFO.size()-1);
            return x;
        }
        else{
            System.out.println("There are no more surprises inside");
            return null;
        }
    }

    @Override
    public boolean isEmpty(){
        return this.BagLIFO.size() == 0;
    }

    @Override
    public int size(){
        return this.BagLIFO.size();
    }

}
