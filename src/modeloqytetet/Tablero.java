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
public class Tablero {
    
    private ArrayList<Casilla> casillas = new ArrayList();
    private Casilla carcel;

    public Tablero() {
        
        this.casillas = null;
        this.carcel = null;
        this.inicializar(); 
        
    }

    public Casilla getCarcel() {
        return carcel;
    }

    @Override
    public String toString() {
        return "Tablero{" + "casillas=" + casillas + ", carcel=" + carcel + '}';
    }

    
    
    private void inicializar(){
        
        casillas.add(new Casilla(1,200,TipoCasilla.CALLE));
    }
    
    
    

    
}
