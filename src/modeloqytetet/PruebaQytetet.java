/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modeloqytetet;
import java.util.*;
/**
 *
 * @author gonza
 */
public class PruebaQytetet {
        //Variable tablero
        private static Tablero tablero;
        //ArrayList de sorpresas
        static ArrayList<Sorpresa> mazo = new ArrayList();
        //Metodo guarda en un nuevo mazo las sorpresas con valor mayor que 0
        private ArrayList<Sorpresa> valorMayor0(){
        
            ArrayList<Sorpresa> newMazo = new ArrayList();
            
            for(Sorpresa s : mazo){
                if(s.getValor() > 0){
                    newMazo.add(s);
                }
            }
            
            return newMazo;
        }
        //Metodo guarda en un nuevo mazo las sorpresas de tipo IRACASILLA
        private ArrayList<Sorpresa> tipoIrACasilla(){
        
            ArrayList<Sorpresa> newMazo = new ArrayList();
            
            for(Sorpresa s : mazo){
                if(s.getTipo() == TipoSorpresa.IRACASILLA){
                    newMazo.add(s);
                }
            }
            
            return newMazo;
        }
        //Metodo guarda en un nuevo mazo las sorpesas del tipo que se especifique en el argumento
        private ArrayList<Sorpresa> tipo(TipoSorpresa tipo){
            
            ArrayList<Sorpresa> newMazo = new ArrayList();
            
            for(Sorpresa s : mazo){
                if(s.getTipo() == tipo){
                    newMazo.add(s);
                }
            }  
            
            return newMazo;
        }

        //Hay que hacer 5 cartas mas
        private static void inicializarSorpresas(){
            
            mazo.add(new Sorpresa ("Te hemos pillado robando, directo a la carcel" , 3, TipoSorpresa.IRACASILLA));
            mazo.add(new Sorpresa ("Tropezaste y caiste al suelo, la confusion "
                    + "te hace volver a la casilla de salida" , 2, TipoSorpresa.IRACASILLA));
            mazo.add(new Sorpresa("Te haces amigo del alcaide, quedas libre de la carcel"
                    + ". Puedes conservar esta carta si aun no has entrado.", 1, TipoSorpresa.SALIRCARCEL ));
            mazo.add(new Sorpresa("Es tu dia de suerte, recibe 100.", 2, TipoSorpresa.PORJUGADOR));
            mazo.add(new Sorpresa("Nadie se libra de los impuestos. Paga por cada"
                    + "casilla no hipotecada con casas o hoteles.", 1, TipoSorpresa.PORCASAHOTEL));
            
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tablero tablero;
       
       inicializarSorpresas();
       
       //metodo apropiado
       for(Sorpresa s : mazo){
           
           System.out.println(s);
           
       }
       
    }
    
}
