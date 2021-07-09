package Carreras;
import java.util.ArrayList;

public class InicioJuego extends Jugadores {

    // Insertamos el constructos con sus parametros
    public InicioJuego(ArrayList carros, ArrayList pista, ArrayList NombConductor, ArrayList NombPropietario) {
        super(carros, pista, NombConductor, NombPropietario);
    }
    // Extendemos la Clase Jugadores para ingresar los Datos
    @Override
    public void IngreamosCarros(String carros) {
        super.carros.add(carros);
         }
    @Override
    public void IngreamosPista(int pista) {
       super.pista.add(pista); 
    }

    @Override
    public void IngreamosNombConductor(String nombconductor) {
       super.NombPropietario.add(nombconductor);
    }

    @Override
    public void IngreamosNOmbPropietario(String nombporpietario) {
        super.NombPropietario.add(nombporpietario);
    }

    @Override
    public void ElimiarDatos(String eliminar) {
        super.NombConductor.remove(super.NombConductor.indexOf(eliminar));
    }
    
}
