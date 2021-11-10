package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbtiposucursal")
public class TipoSucursal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipoSucursal;
    @Column(name = "nombre")
    private String nombre;

    public int getId_tipoSucursal() {
        return id_tipoSucursal;
    }

    public void setId_tipoSucursal(int id_tipoSucursal) {
        this.id_tipoSucursal = id_tipoSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id_tipoSucursal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoSucursal other = (TipoSucursal) obj;
        if (this.id_tipoSucursal != other.id_tipoSucursal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SucursalTipo{" + "id_tipoSucursal=" + id_tipoSucursal + '}';
    }

}
