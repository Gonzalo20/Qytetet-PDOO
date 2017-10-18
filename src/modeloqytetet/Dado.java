/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;
import java.util.Random;
/**
 *
 * @author gonzalo
 */
public class Dado {
        
    private Dado() {
    }
    
    public static Dado getInstance() {
        return DadoHolder.INSTANCE;
    }
    
    private static class DadoHolder {

        private static final Dado INSTANCE = new Dado();
    }
    
    int tirar(){
        Random r = new Random();
        int valorDado = r.nextInt(6)+1;
        return valorDado;
    }
    
    
}
