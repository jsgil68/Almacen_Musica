
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
public class InventarioSucursal {

    private int codigo;
    private int umbral;
    private ArrayList<CD> listaCD = new ArrayList();

    public boolean enviarSolicitud(int codigo) {
        boolean aux = false;
        for (CD cd : listaCD) {

            if (cd.getCodigo() == codigo) {

                if (cd.getCantidad() < this.umbral) {
                    aux = true;

                } else {
                    aux = false;
                }
            }
        }
        return aux;
    }

    public InventarioSucursal(int codigo, int umbral) {
        this.codigo = codigo;
        this.umbral = umbral;
    }

    public void aniadirCD(CD cd) {
        this.listaCD.add(cd);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    public ArrayList<CD> getListaCD() {
        return listaCD;
    }

    public void setListaCD(ArrayList<CD> listaCD) {
        this.listaCD = listaCD;
    }

    @Override
    public String toString() {
        return "inventariosucursal{" + "codigo=" + codigo + ", umbral=" + umbral + ", listaCD=" + listaCD.toString() + '}';
    }

}
