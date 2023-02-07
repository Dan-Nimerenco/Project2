package Junior_Part.Proiect_P2;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private final IBag tolba;
    private final int waitTime;


    public AbstractGiveSurprises(String typeContainer, int timpAsteptare){
        this.tolba= BagFactory.getInstance().makeBag(typeContainer);
        this.waitTime = timpAsteptare;
    }

    public void put(ISurprise newSurprise){
        this.tolba.put(newSurprise);
    }

    public void put(IBag surprises){
        this.tolba.put(surprises);
    }

    public void give(){
        this.tolba.takeOut().enjoy();

    }

    public void giveAll(){
        while (!this.tolba.isEmpty()){
            this.tolba.takeOut().enjoy();
            try {
                TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isEmpty(){
        return this.tolba.isEmpty();
    }

    protected abstract void giveWithPassion();
}
