
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TipoSucursal extends AbstractFacade<entity.TipoSucursal> implements TipoSucursalFacadeLocal{

    
    
    @PersistenceContext(unitName = "pvb")
    public EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
     return em;
    }
    
    public TipoSucursal(){
    super(entity.TipoSucursal.class);
    }

    

    
    
    
    
}
