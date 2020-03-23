package Tugas_TM3;

public class Ikan extends Hewan {
    boolean statusGantiAir;
    
    public Ikan(boolean statusGantiAir){
        this.statusGantiAir = statusGantiAir;
    }
    
    @Override
    boolean status(boolean statusPenitipan){
        this.statusPenitipan = statusPenitipan;
        return true;
    }
    
}
