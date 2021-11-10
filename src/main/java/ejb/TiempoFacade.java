package ejb;

import entity.Tiempo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TiempoFacade extends AbstractFacade<Tiempo> implements TiempoFacadeLocal {

    @PersistenceContext(unitName = "pvb")

    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiempoFacade() {
        super(Tiempo.class);
    }


}
