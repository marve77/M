package POJOs;
// Generated 24/10/2023 12:54:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private int idEmpleado;
     private Boolean estado;
     private String nombreEmpleado;
     private String usuario;
     private String contrasenia;
     private Set clientesForUsuarioIngresa = new HashSet(0);
     private Set productosForUsuarioModifica = new HashSet(0);
     private Set productosForUsuarioIngresa = new HashSet(0);
     private Set clientesForUsuarioModifica = new HashSet(0);
     private Set ventasForUsuarioIngresa = new HashSet(0);
     private Set ventasForUsuarioModifica = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Empleado(int idEmpleado, Boolean estado, String nombreEmpleado, String usuario, String contrasenia, Set clientesForUsuarioIngresa, Set productosForUsuarioModifica, Set productosForUsuarioIngresa, Set clientesForUsuarioModifica, Set ventasForUsuarioIngresa, Set ventasForUsuarioModifica) {
       this.idEmpleado = idEmpleado;
       this.estado = estado;
       this.nombreEmpleado = nombreEmpleado;
       this.usuario = usuario;
       this.contrasenia = contrasenia;
       this.clientesForUsuarioIngresa = clientesForUsuarioIngresa;
       this.productosForUsuarioModifica = productosForUsuarioModifica;
       this.productosForUsuarioIngresa = productosForUsuarioIngresa;
       this.clientesForUsuarioModifica = clientesForUsuarioModifica;
       this.ventasForUsuarioIngresa = ventasForUsuarioIngresa;
       this.ventasForUsuarioModifica = ventasForUsuarioModifica;
    }
   
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public String getNombreEmpleado() {
        return this.nombreEmpleado;
    }
    
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Set getClientesForUsuarioIngresa() {
        return this.clientesForUsuarioIngresa;
    }
    
    public void setClientesForUsuarioIngresa(Set clientesForUsuarioIngresa) {
        this.clientesForUsuarioIngresa = clientesForUsuarioIngresa;
    }
    public Set getProductosForUsuarioModifica() {
        return this.productosForUsuarioModifica;
    }
    
    public void setProductosForUsuarioModifica(Set productosForUsuarioModifica) {
        this.productosForUsuarioModifica = productosForUsuarioModifica;
    }
    public Set getProductosForUsuarioIngresa() {
        return this.productosForUsuarioIngresa;
    }
    
    public void setProductosForUsuarioIngresa(Set productosForUsuarioIngresa) {
        this.productosForUsuarioIngresa = productosForUsuarioIngresa;
    }
    public Set getClientesForUsuarioModifica() {
        return this.clientesForUsuarioModifica;
    }
    
    public void setClientesForUsuarioModifica(Set clientesForUsuarioModifica) {
        this.clientesForUsuarioModifica = clientesForUsuarioModifica;
    }
    public Set getVentasForUsuarioIngresa() {
        return this.ventasForUsuarioIngresa;
    }
    
    public void setVentasForUsuarioIngresa(Set ventasForUsuarioIngresa) {
        this.ventasForUsuarioIngresa = ventasForUsuarioIngresa;
    }
    public Set getVentasForUsuarioModifica() {
        return this.ventasForUsuarioModifica;
    }
    
    public void setVentasForUsuarioModifica(Set ventasForUsuarioModifica) {
        this.ventasForUsuarioModifica = ventasForUsuarioModifica;
    }




}


