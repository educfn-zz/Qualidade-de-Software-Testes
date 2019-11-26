/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author EduardoCFN
 */
public class DAOTest<T> implements Serializable{
    
    public DAOTest() {
    }
    
    
    @Before
    public void setUp()
    {

    }
    
    @After
    public void tearDown()
    {
        
    }
    
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
    }

    //Testando NullPointerException no metodo adicionar()
    @Test(expected = NullPointerException.class)
    public void testAdicionarNullEx() {
        System.out.println("DAO - Method: adicionar()");
      
        DAO<T> dao = null;
        
        dao.adicionar(null);
              
    }
    
    //Testando se aceita um Objeto qualquer.
    @Test
    public void testAdicionarObject() {
        System.out.println("DAO - Method: adicionar()");
      
        DAO<T> dao = null;
        
        Object t = new Object();
        
        try
        {
            dao.adicionar((T) t);
            assertTrue(false);
            System.err.println("Erro: foi adicionado um Object vazio!");
        }catch(Exception e)
        {
            assertTrue(true);
        }
        
              
    }


    @Test
    public void testConsultarNull() {
        System.out.println("DAOTest: Method - consultar()");
        Long id = null;
        DAO instance = null;
        try
        {
            instance.consultar(id);
            assertTrue(false);
            System.err.println("\nErro: metodo aceitou valor 'null' como parametro");
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
    }

    /**
     * Test of alterar method, of class DAO.
     */
    @Ignore
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Object t = null;
        DAO instance = null;
        instance.alterar(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class DAO.
     */
    @Ignore
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        Long id = null;
        DAO instance = null;
        instance.excluir(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarGenerico method, of class DAO.
     */
    @Ignore
    @Test
    public void testListarGenerico() {
        System.out.println("listarGenerico");
        String query = "";
        Object[] params = null;
        DAO instance = null;
        List expResult = null;
        List result = instance.listarGenerico(query, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
