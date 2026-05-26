/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Entidades.BILIOTECA;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maldo
 */
public class TLista_Gestion_Libros {

    public static List<BILIOTECA> RegistrarLibros = new ArrayList<>();

    public static void Insertar_Libro(BILIOTECA op) {
        RegistrarLibros.add(op);
    }

    public static void Eliminar_Libro(BILIOTECA op) {
        RegistrarLibros.remove(op);
    }

    public static void Modificar(BILIOTECA op, int pos) {
        RegistrarLibros.set(pos, op);
    }

    public static int Buscar(String codigo) {
        for (int i = 0; i < RegistrarLibros.size(); i++) {
            if (String.valueOf(RegistrarLibros.get(i).getCodigo()).equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public static DefaultTableModel Visualizar_Libros_Registrados(String buscar) {
        String[] Titulos = {"CÓDIGO", "TÍTULO", "AUTOR", "CATEGORÍA", "EDITORIAL"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Titulos);

        for (int i = 0; i < RegistrarLibros.size(); i++) {

            BILIOTECA libro = RegistrarLibros.get(i);
            if (libro.getTItulo().toLowerCase().contains(buscar.toLowerCase())
                    || libro.getAutor().toLowerCase().contains(buscar.toLowerCase())
                    || libro.getCategoria().toLowerCase().contains(buscar.toLowerCase())
                    || libro.getEditorial().toLowerCase().contains(buscar.toLowerCase())
                    || String.valueOf(libro.getCodigo()).contains(buscar.toLowerCase())) {

                Datos[0] = String.valueOf(RegistrarLibros.get(i).getCodigo());
                Datos[1] = RegistrarLibros.get(i).getTItulo();
                Datos[2] = RegistrarLibros.get(i).getAutor();
                Datos[3] = RegistrarLibros.get(i).getCategoria();
                Datos[4] = RegistrarLibros.get(i).getEditorial();
                dt.addRow(Datos);
            }

        }
        return dt;

    }

    public static DefaultTableModel Visualizar_Libros_Registrados() {
        String[] Titulos = {"CÓDIGO", "TÍTULO", "AUTOR", "CATEGORÍA", "EDITORIAL"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Titulos);

        for (int i = 0; i < RegistrarLibros.size(); i++) {

            Datos[0] = String.valueOf(RegistrarLibros.get(i).getCodigo());
            Datos[1] = RegistrarLibros.get(i).getTItulo();
            Datos[2] = RegistrarLibros.get(i).getAutor();
            Datos[3] = RegistrarLibros.get(i).getCategoria();
            Datos[4] = RegistrarLibros.get(i).getEditorial();
            dt.addRow(Datos);

        }
        return dt;

    }

}
