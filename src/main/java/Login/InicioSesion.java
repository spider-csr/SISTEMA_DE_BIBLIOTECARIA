/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author maldo
 */
public class InicioSesion {
    private String Usuario;
    private String contranesa;

    public InicioSesion(String Usuario, String contranesa) {
        this.Usuario = Usuario;
        this.contranesa = contranesa;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContranesa() {
        return contranesa;
    }

    public void setContranesa(String contranesa) {
        this.contranesa = contranesa;
    }
    
    
    
}
