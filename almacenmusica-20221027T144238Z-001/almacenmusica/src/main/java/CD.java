/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class CD {
   private int codigo;
   private double precio;
   private String interprete;
   private String titulo;
   private int cantidad;

    public CD(int codigo, double precio, String interprete, String titulo, int cantidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.interprete = interprete;
        this.titulo = titulo;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CD{" + "codigo=" + codigo + ", precio=" + precio + ", interprete=" + interprete + ", titulo=" + titulo + ", cantidad=" + cantidad + '}';
    }

   
 
}
