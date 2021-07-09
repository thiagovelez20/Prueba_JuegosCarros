
package Carreras;

import java.util.ArrayList;


public abstract class Jugadores {
    // Creamos la lsiata de los jugadores del Juego
    ArrayList carros;
    ArrayList pista;
    ArrayList NombConductor;
    ArrayList NombPropietario;
    /// Creamos el Constructro de la Lista

    public Jugadores(ArrayList carros, ArrayList pista, ArrayList NombConductor, ArrayList NombPropietario) {
        this.carros = carros;
        this.pista = pista;
        this.NombConductor = NombConductor;
        this.NombPropietario = NombPropietario;
    }
    // Insertamos los Métodos Getter y Setters

    public ArrayList getCarros() {
        return carros;
    }

    public void setCarros(ArrayList carros) {
        this.carros = carros;
    }

    public ArrayList getPista() {
        return pista;
    }

    public void setPista(ArrayList pista) {
        this.pista = pista;
    }

    public ArrayList getNombConductor() {
        return NombConductor;
    }

    public void setNombConductor(ArrayList NombConductor) {
        this.NombConductor = NombConductor;
    }

    public ArrayList getNombPropietario() {
        return NombPropietario;
    }

    public void setNombPropietario(ArrayList NombPropietario) {
        this.NombPropietario = NombPropietario;
    }
    // Insertamos los Métodos que utilizaremos en el ArrayList
    public abstract void  IngreamosCarros(String carros);
    public abstract void  IngreamosPista(int pista);
    public abstract void  IngreamosNombConductor(String nombconductor);
    public abstract void  IngreamosNOmbPropietario(String nombporpietario);
    public abstract void  ElimiarDatos(String elimiar);
  
    
    
    
    
    
}
