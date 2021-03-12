package sk.stuba.fei.uim.oop;

public class Pes extends Zivocich {
    public Pes(){
        this.pocet_noh = 4;
    }
    @Override
    void zvuk() {
        System.out.println("Hav Hav");
    }
}
