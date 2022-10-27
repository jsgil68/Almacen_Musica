
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JUAN
 */
public class InventarioPrincipal {

    private int cantidadRequerida;
    public ArrayList<CD> listaCD = new ArrayList();

    public int getCantidadRequerida() {
        return cantidadRequerida;
    }

    public void aniadirCD(CD cd) {
        this.listaCD.add(cd);
    }

    public CD respondersolicitud(boolean solicitud, int codigo, int cantidad) {
        Object respuesta = null;
        if (solicitud) {

            for (CD cd : listaCD) {
                if (cd.getCodigo() == codigo) {
                    respuesta = new CD(cd.getCodigo(), cd.getPrecio(), cd.getInterprete(), cd.getTitulo(), cantidad);
                }
            }
        }
        return (CD) respuesta;
    }

    @Override
    public String toString() {
        return "inventarioprincipal{" + "cantidadRequerida=" + cantidadRequerida + ", listaCD=" + listaCD.toString() + '}';
    }
    
}
