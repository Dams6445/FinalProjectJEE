package exemple.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtils {


  public static  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
 public static   EntityManager entityManager = entityManagerFactory.createEntityManager();


    public static EntityManager getEntityManager() {
       try {
           return entityManager;
       }
       catch (Exception e ){
           e.printStackTrace();
       }
        return null;
    }

}
