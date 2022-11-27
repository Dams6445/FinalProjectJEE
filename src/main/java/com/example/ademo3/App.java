package com.example.ademo3;


import com.example.ademo3.util.HibernateUtils;

import javax.persistence.EntityManager;

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
