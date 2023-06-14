
package desafio.app;

import desafio.model.Nutricionista;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("desafio1");
        EntityManager em = factory.createEntityManager();
        
        Nutricionista nutri = new Nutricionista("Carlos Rafael","123456","MT");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(nutri);
        tx.commit();
        em.close();
        factory.close();
    }
}
