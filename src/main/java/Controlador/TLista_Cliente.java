/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Entidades.CLIENTE;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maldo
 */
public class TLista_Cliente {
    public static List<CLIENTE> GestorDeUsuarios = new ArrayList<>();
    
    public static void Insertar(CLIENTE op){
        GestorDeUsuarios.add(op);
    }
    
    public static void Elminar(CLIENTE op){
        GestorDeUsuarios.remove(op);
    }
    
    public static void Modificar(CLIENTE op, int pos){
        GestorDeUsuarios.set(pos, op);
    }
    
    public static int Buscar(String cedula){
        for(int i = 0; i < GestorDeUsuarios.size(); i++){
            if(String.valueOf(GestorDeUsuarios.get(i).getCedula()).equals(cedula)){
                return i;
            }
        }
        return -1;
    }
    
    public static DefaultTableModel Visualizar_Lista_Usuarios(){
        String[] Titulos_Usuarios = {"NOMBRE", "CÉDULA", "CORREO", "TELÉFONO"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Titulos_Usuarios);
        
        for(int i = 0; i < GestorDeUsuarios.size(); i++){
            Datos[0] = GestorDeUsuarios.get(i).getNombre();
            Datos[1] = String.valueOf(GestorDeUsuarios.get(i).getCedula());
            Datos[2] = GestorDeUsuarios.get(i).getCorreo();
            Datos[3] = String.valueOf(GestorDeUsuarios.get(i).getTelefono());
            dt.addRow(Datos);
        }
        return dt;
    }
    
}
