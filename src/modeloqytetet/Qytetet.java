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
public class Qytetet {
    
    static int MAX_JUGADORES = 4;
    static int MAX_CARTAS = 10;
    static int  MAX_CASILLAS = 20;
    static int PRECIO_LIBERDAD = 200;
    static int SALDO_SALIDA = 1000;
    private Sorpresa cartaActual;
    private Tablero tablero;
    private Jugador jugadorActual;
    private ArrayList<Sorpresa> mazo = new ArrayList();

    private Qytetet(Tablero tablero, Jugador jugadorActual) {
        this.cartaActual = null;
        this.tablero = tablero;
        this.jugadorActual = jugadorActual;
    }
    
    private Qytetet(){
        
    }
    
    
    public static Qytetet getInstance() {
        return QytetetHolder.INSTANCE;
    }
    
    private static class QytetetHolder {

        private static final Qytetet INSTANCE = new Qytetet();
    }
    
    public Sorpresa getCartaActual(){
        
        return cartaActual;
        
    }
    
    public Jugador getJugadorActual(){
        
        return jugadorActual;
        
    }
    
    private void inicializarCartasSorpresa(){
        
        
        mazo.add(new Sorpresa ("Te hemos pillado robando, directo a la carcel" , 3, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Tropezaste y caiste al suelo, la confusion "
                    + "te hace volver a la casilla de salida" , 2, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa("Te haces amigo del alcaide, quedas libre de la carcel"
                    + ". Puedes conservar esta carta si aun no has entrado.", 1, TipoSorpresa.SALIRCARCEL ));
        mazo.add(new Sorpresa("Es tu dia de suerte, recibe 100.", 2, TipoSorpresa.PORJUGADOR));
        mazo.add(new Sorpresa("Nadie se libra de los impuestos. Paga por cada"
                    + "casilla no hipotecada con casas o hoteles.", 1, TipoSorpresa.PORCASAHOTEL));

    }
    
    private void inicializarJugadores(String nombre, int MAX_JUGADORES ){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    private void inicializarTablero(){
        tablero = new Tablero();
    }

    @Override
    public String toString() {
        return "Qytetet{" + "cartaActual=" + cartaActual + ", tablero=" + tablero + ", jugadorActual=" + jugadorActual + ", mazo=" + mazo + '}';
    }
    
}
