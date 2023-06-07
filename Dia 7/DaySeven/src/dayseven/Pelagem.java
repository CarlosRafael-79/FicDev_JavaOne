package dayseven;

public enum Pelagem {
    PRETO(1), BRANCO(2), CARAMELO(3), MALHADO(4);
    
    private int pelos;
    
    private Pelagem(int num){
        this.pelos = num;
    }

    public int getPelos() {
        return pelos;
    }
}
