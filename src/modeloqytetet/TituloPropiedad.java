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
public class TituloPropiedad {
    
    private String nombre;
    private boolean hipotecado;
    private int alquilerBase;
    private float factorRevalorizacion;
    private int hipotecaBase;
    private int precioEdificar;
    private Casilla casilla;
    private Jugador propietario;
    
    TituloPropiedad(String nombre, int alquilerBase, float factorRevalorizacion,
            int hipotecaBase, int precioEdificar){
            
        this.nombre = nombre;
        this.hipotecado = false;
        this.alquilerBase = alquilerBase;
        this.factorRevalorizacion = factorRevalorizacion;
        this.hipotecaBase = hipotecaBase;
        this.precioEdificar = precioEdificar;
        
    }

    String getNombre() {
        return nombre;
    }

    boolean isHipotecado() {
        return hipotecado;
    }

    int getAlquilerBase() {
        return alquilerBase;
    }

    float getFactorRevalorizacion() {
        return factorRevalorizacion;
    }

    int getHipotecaBase() {
        return hipotecaBase;
    }

    int getPrecioEdificar() {
        return precioEdificar;
    }
    
    void setCasilla(Casilla casilla){
        this.casilla = casilla;
    }
    
    void setHipotecada(boolean hipotecado) {
        this.hipotecado = hipotecado;
    }
    
    void setPropietario(Jugador propietario){
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "TituloPropiedad{" + "nombre=" + nombre + ", hipotecado=" + hipotecado + ", alquilerBase=" + alquilerBase + ", factorRevalorizacion=" + factorRevalorizacion + ", hipotecaBase=" + hipotecaBase + ", precioEdificar=" + precioEdificar + ", casilla=" + casilla + ", propietario=" + propietario + '}';
    }

    
    
    
    
    
}
