package sk.stuba.fei.uim.oop;

public class Clovek extends Zivocich{
    public Clovek(){
        this.pocet_noh = 2;
    }
    @Override
    void zvuk() {
        System.out.println("Ahoj, ako sa mas?");
    }
}
