/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wlfran
 */
public class Alumno {
    String nombre;
    int codigo;
    int telefono;
    
    public void codigo(int codi){
        codigo = codi;
    }
    
    public void nombre (String nomb){
        nombre = nomb;
    }
    
    public void telefono (int telefo){
        telefono = telefo;
    }
    
   public void impcod (){
       System.out.print(codigo);
   }
   
}
