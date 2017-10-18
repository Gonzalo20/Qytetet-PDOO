/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

/**
 *
 * @author gonzalo
 */
public class Casilla {
    
    private int numeroCasilla;
    private int coste;
    private int numHoteles, numCasas;
    private TipoCasilla tipo;
    private TituloPropiedad titulo;
    
    public Casilla(int numeroCasilla, int coste, TipoCasilla tipo){
       
        this.numeroCasilla = numeroCasilla;
        this.coste = coste;
        numCasas = 0;
        numHoteles = 0;
        this.tipo = tipo;
        titulo = null;
        
    }
    
    public Casilla(int numeroCasilla, int coste, TituloPropiedad titulo){
       
        this.numeroCasilla = numeroCasilla;
        this.coste = coste;
        numCasas = 0;
        numHoteles = 0;
        tipo = TipoCasilla.CALLE;
        this.setTituloPropiedad(titulo);
        
    }

    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public int getCoste() {
        return coste;
    }

    public int getNumHoteles() {
        return numHoteles;
    }

    public int getNumCasas() {
        return numCasas;
    }

    public TipoCasilla getTipo() {
        return tipo;
    }
    
    public TituloPropiedad getTituloPropiedad(){
        return titulo;
    }

    public void setNumHoteles(int numHoteles) {
        this.numHoteles = numHoteles;
    }
    
    public void setNumCasas(int numCasas) {
        this.numCasas = numCasas;
    }

    private void setTituloPropiedad(TituloPropiedad titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Casilla{" + "numeroCasilla=" + numeroCasilla + ", coste=" + coste + ", numHoteles=" + numHoteles + ", numCasas=" + numCasas + ", tipo=" + tipo + ", titulo=" + titulo + '}';
    }

    
    
    
    
    
    
}
