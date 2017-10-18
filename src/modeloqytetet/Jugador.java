/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;
import java.util.*;

/**
 *
 * @author gonzalo
 */
public class Jugador {
    
    private boolean encarcelado;
    private String nombre;
    private int saldo;  
    private Sorpresa cartaLibertad;
    private Casilla casillaActual;
    private ArrayList<TituloPropiedad> propiedades = new ArrayList();
    
    Jugador(String nombre){
        
        this.encarcelado = false;
        this.nombre = nombre;
        this.saldo = 7500;
        this.cartaLibertad = null;
        this.casillaActual = null;
        
    }
    
    public Casilla getCasillaActual(){
        
        return casillaActual;
    }
    
    public boolean  getEncarcelado(){
        
        return encarcelado;
    }
    
    void setCartaLibertad(Sorpresa carta){
        
        this.cartaLibertad = carta;
        
    }
    
    void setCasillaActual(Casilla casilla){
        
        this.casillaActual = casilla;
        
    }
    
    void setEncarcelado(boolean encarcelado){
        
        this.encarcelado = encarcelado;
        
    }

    @Override
    public String toString() {
        return "Jugador{" + "encarcelado=" + encarcelado + ", nombre=" + nombre + ", saldo=" + saldo + ", cartaLibertad=" + cartaLibertad + ", casillaActual=" + casillaActual + ", propiedades=" + propiedades + '}';
    }
    
    
}
