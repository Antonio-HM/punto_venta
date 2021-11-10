package ejb;

import entity.Tiempo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author andy.chuyusam
 */
@Local
public interface TiempoFacadeLocal {
    
    void create(Tiempo tiempo);
    
    List<Tiempo> findAll();
    
    void edit(Tiempo tiempo);
    
    void delete(Tiempo tiempo);
    
    Tiempo find(Object id);
}