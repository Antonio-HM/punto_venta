/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ejb.TipoSucursalFacadeLocal;
import entity.TipoSucursal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "CTipoSucursal")
@SessionScoped
public class CTipoSucursal implements Serializable {

    @EJB
    private TipoSucursalFacadeLocal tsucursalEJB;
    private TipoSucursal tsucursal;
    private List<TipoSucursal> lista;

    private String msj ;

    public CTipoSucursal() {
    }

    public TipoSucursal getTsucursal() {
        return tsucursal;
    }

    public void setTsucursal(TipoSucursal tsucursal) {
        this.tsucursal = tsucursal;
    }

    public List<TipoSucursal> getLista() {
        this.lista = this.tsucursalEJB.findAll();
        return lista;
    }

    public void setLista(List<TipoSucursal> lista) {
        this.lista = lista;
    }

    @PostConstruct
    public void init(){
     tsucursal = new TipoSucursal();
    }
   
    public void clear(){
    init();
    }
    
     public void save() {

        try {
            tsucursalEJB.create(tsucursal);
            this.msj = "Registro guardado con éxito ";
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORME", msj);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
            clear();
        } catch (Exception e) {
            e.printStackTrace();
            this.msj = "Transaccion fallida" ;
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ALERTA", msj);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        }

    }

    public void delete(TipoSucursal id) {
        try {
            this.tsucursalEJB.delete(id);
            this.msj = "Registro Eliminado con éxito ";
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORME", msj);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        } catch (Exception e) {
            e.printStackTrace();
            this.msj = "Error Grave : " + e.getMessage();
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ALERTA", msj);
        }
    }

    public void update() {
        try {
            this.tsucursalEJB.edit(tsucursal);
            this.msj = "Registro Actualizado con éxito ";
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORME", msj);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        } catch (Exception e) {
            e.printStackTrace();
            this.msj = "Error Grave : " + e.getMessage();
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ALERTA", msj);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);

        }

    }

    public void find(TipoSucursal id) {
        try {
            this.tsucursal = id;
        } catch (Exception e) {
            System.out.println("Error al cargar : " + e.getMessage());
        }
    }
    
    
    
}
