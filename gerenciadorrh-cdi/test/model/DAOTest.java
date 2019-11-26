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
    @Test
    public void testAdicionar() {
        System.out.println("DAOTest - Method: adicionar()");
      
        DAO<T> dao = null;
        
        //O metodo nao deve aceitar valor 'null'(teste basico).
        try
        {
            dao.adicionar(null);
            assertTrue(false);
            System.err.println("Erro: metodo aceitou valor 'null' como parametro");
            
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
        //Eh esperado que o metodo nao aceite um Object vazio.
        try
        {
            Object t = new Object();
            
            dao.adicionar((T) t);
            assertTrue(false);
            System.err.println("Erro: foi adicionado um Object vazio!");
        }catch(Exception e)
        {
            assertTrue(true);
        }
              
    }
    

    @Test
    public void testConsultar() 
    {
        System.out.println("DAOTest: Method - consultar()");
        Long id = null;
        DAO instance = null;
        
        //O metodo nao deve aceitar valor 'null'(teste basico).
        try
        {
            instance.consultar(id);
            assertTrue(false);
            System.err.println("\nErro: metodo aceitou valor 'null' como parametro");
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
        
        //Esperado que o metodo nao aceite valores negativos como 'id'
         try
        {
            id = -1l;
            
            instance.consultar(id);
            assertTrue(false);
            System.err.println("\nErro: metodo aceitando valor negativo de 'id'");
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
    }

 
    @Test
    public void testAlterar() 
    {
        System.out.println("DAOTest: Method - alterar()");
        
        DAO dao = null;
        
        //O metodo nao deve aceitar valor 'null'(teste basico).
        try
        {
            dao.alterar(null);
            assertTrue(false);
            System.err.println("Erro: metodo aceitou valor 'null' como parametro");
            
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
        //Eh esperado que o metodo nao aceite um Object vazio.
        try
        {
            Object t = new Object();
            
            dao.alterar((T) t);
            assertTrue(false);
            System.err.println("\nErro: foi adicionado um Object vazio!");
        }catch(Exception e)
        {
            assertTrue(true);
        }
    }

  
    @Test
    public void testExcluir() 
    {
        System.out.println("DAOTest: Method - excluir()");
        Long id = null;
        DAO dao = null;
        
        //O metodo nao deve aceitar valor 'null'(teste basico).
        try
        {
            dao.excluir(id);
            assertTrue(false);
            System.err.println("\nErro: metodo aceitou valor 'null' como parametro");
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
        
        //Esperado que o metodo nao aceite valores negativos como 'id'
         try
        {
            id = -1l;
            
            dao.excluir(id);
            assertTrue(false);
            System.err.println("\nErro: metodo aceitando valor negativo de 'id'");
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
    }


    @Test(timeout = 60000)
    public void testListarGenerico() 
    {
        System.out.println("DAOTest: Method - listarGenerico()");
        String query = null;
        Object[] params = null;
        DAO dao = null;
        List expResult = null;
        
        //Testar valores null nos parametros 'String query' e 'Object ... params'
        try
        {
            params[0] = 1;
            String a = "abcdef";
            params[1] = a;
            
            dao.listarGenerico(query, params);
            assertTrue(false);
            System.err.println("\nErro: metodo aceitou o parametro String 'query' "
                    + "com valor 'null'");
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
        try
        {
            /*nao eh esperado que o statement abaixo seja realizado, contudo
            *foi colocado 'timeout = 60000(60sec)' visando forçar o termino
            *deste teste, caso o mesmo demore demais.
            */
            query = "SELECT * FROM * WHERE COLUMN_NAME IN ('Empresa')";
            
            dao.listarGenerico(query, params);
            assertTrue(false);
            System.err.println("\nErro: metodo aceitou o parametro Object[] params "
                    + "com valor 'null'");
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
        //Testar String vazia no parametro 'String query'
         try
        {
            params[0] = 1;
            String a = "abcdef";
            params[1] = a;
            query = "";
            
            dao.listarGenerico(query, params);
            assertTrue(false);
            System.err.println("\nErro: metodo aceitou o parametro String 'query' "
                    + "com valor ''(String vazia)");
        }catch(NullPointerException e)
        {
            assertTrue(true);
        }
        
    }
    
}
