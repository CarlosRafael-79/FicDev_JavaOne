/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author ficdev
 */
public class JogoDaVelha {
    private char[][] tabuleiro = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
    private boolean terminou = false;
    private int turno = 0;  
    
    public void exibirTabuleiro(){
        System.out.println("");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(this.tabuleiro[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    
    public void fazerJogada(int i, int j) throws IndexOutOfBoundsException{
        if(i < 0 || i > 2){
            throw new IndexOutOfBoundsException();
        }
        if(i < 0 || i > 2){
            throw new IndexOutOfBoundsException();
        }
        this.tabuleiro[i][j] = this.getTurno() % 2 == 0 ? 'X' : 'O';
        this.turno++;
    }

    /**
     * @return the tabuleiro
     */
    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    /**
     * @param tabuleiro the tabuleiro to set
     */
    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    /**
     * @return the terminou
     */
    public boolean isTerminou() {
        return terminou;
    }

    /**
     * @param terminou the terminou to set
     */
    public void setTerminou(boolean terminou) {
        this.terminou = terminou;
    }

    /**
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    
    
    
    
    
    
    
}
