/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author maldo
 */
public class BILIOTECA {

    private int codigo;
    private String TItulo;
    private String Autor;
    private String categoria;
    private String editorial;
    private int stock;

    public BILIOTECA() {
    }

    public BILIOTECA(int codigo, String TItulo, String Autor, String categoria, String editorial, int stock) {
        this.codigo = codigo;
        this.TItulo = TItulo;
        this.Autor = Autor;
        this.categoria = categoria;
        this.editorial = editorial;
        this.stock = stock;
    }

    public BILIOTECA(int codigo, String TItulo, String Autor, String categoria, String editorial) {
        this.codigo = codigo;
        this.TItulo = TItulo;
        this.Autor = Autor;
        this.categoria = categoria;
        this.editorial = editorial;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTItulo() {
        return TItulo;
    }

    public void setTItulo(String TItulo) {
        this.TItulo = TItulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String Registrado() {
        return "DETALLES DEL LIBRO \n"
                + "CÓDIGO: " + codigo + "\n"
                + "TITULO: " + TItulo + "\n"
                + "AUTOR: " + Autor + "\n"
                + "CATEGORIA: " + categoria + "\n"
                + "EDITORIAL: " + editorial;
    }

}
