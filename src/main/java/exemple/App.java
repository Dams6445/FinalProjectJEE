package exemple;


import exemple.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManager entityManager =  HibernateUtils.getEntityManager();
        System.out.println( "Hello World!" );
    }

}
