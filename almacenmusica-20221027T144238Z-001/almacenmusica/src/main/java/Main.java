/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class Main{
    public static void main(String[] args) {
        int codigo1 = 12345;
        int codigo2 = 12346;
        int codigo3 = 12347;
        int codigo4 = 12348;
        boolean sucursal1;
        boolean sucursal2;
        boolean sucursal3;
        boolean sucursal4;
        Object respuestasucursal1;
        Object respuestasucursal2;
        Object respuestasucursal3;
        Object respuestasucursal4;
        
        
        //instancio la sucursal principal
        InventarioPrincipal invmain = new InventarioPrincipal();
        
        //instanciar sucursales con los codigos de cada articulo y su umbral minimo de solicitud
        InventarioSucursal invsucursal1 = new InventarioSucursal(codigo1,5);
        InventarioSucursal invsucursal2 = new InventarioSucursal(codigo2,5);
        InventarioSucursal invsucursal3 = new InventarioSucursal(codigo3,5);
        InventarioSucursal invsucursal4 = new InventarioSucursal(codigo4,5);
        
        
       //anade gran cantidad de inventario para surtir a las otras
        invmain.aniadirCD(new CD(codigo1,12000,"Julio","Clase",100));
        invmain.aniadirCD(new CD(codigo2,13000,"Mario","Bros",120));
        invmain.aniadirCD(new CD(codigo3,14000,"Maluma","MalumaBABY",150));
        invmain.aniadirCD(new CD(codigo4,15000,"Harry Styles","onedirection",130));
        
        
        //se muestra cada objeto CD que existe en el inventario
        System.out.println(invmain.toString());
        invsucursal1.aniadirCD(new CD(codigo1,12000,"Julio","Clase",1));
        System.out.println(invsucursal1.toString());
        invsucursal2.aniadirCD(new CD(codigo2,13000,"Mario","Bros",2));
        System.out.println(invsucursal2.toString());
        invsucursal3.aniadirCD(new CD(codigo3,14000,"Maluma","MalumaBABY",3));
        System.out.println(invsucursal3.toString());
        invsucursal4.aniadirCD(new CD(codigo4,15000,"Harry Styles","onedirection",4));
        System.out.println(invsucursal4);
        
       //peticion de enviar solicitud true o false
        sucursal1  =(invsucursal1.enviarSolicitud(codigo1));
        sucursal2  =(invsucursal2.enviarSolicitud(codigo2));
        sucursal3  =(invsucursal3.enviarSolicitud(codigo3));
        sucursal4  =(invsucursal4.enviarSolicitud(codigo4));
        
        //resultado a la peticion de las sucursales
        respuestasucursal1 =(invmain.respondersolicitud(sucursal1, codigo1, 10) );
        respuestasucursal2 =(invmain.respondersolicitud(sucursal2, codigo2, 11) );
        respuestasucursal3 =(invmain.respondersolicitud(sucursal3, codigo3, 12) );
        respuestasucursal4 =(invmain.respondersolicitud(sucursal4, codigo4, 13) );
       
        //ver resultado de la peticion si imprime un objeto CD fue aceptada la peticion y si impreme null fue denegada
        System.out.println(respuestasucursal1);
        System.out.println(respuestasucursal2);
        System.out.println(respuestasucursal3);
        System.out.println(respuestasucursal4);
    }
}
