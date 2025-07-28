package sv.com.jsoft.salvatier.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;
import lombok.Getter;
import java.util.List;

public abstract class AbstractRepository<Entity, Primary> {

    @Getter
    @PersistenceContext(unitName = "SalvatierPU")
    public EntityManager entityManager;

    private final Class<Entity> entityClass;

    public AbstractRepository(Class<Entity> entityClass) {
        this.entityClass = entityClass;
    }

    public void save(Entity entity) {
        entityManager.persist(entity);
    }

    public void update(Entity entity) {
        entityManager.merge(entity);
    }

    public void delete(Entity entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

    public Entity findByPk(Primary pk) {
        return entityManager.find(entityClass, pk);
    }

    public List<Entity> findAll() {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }
}
