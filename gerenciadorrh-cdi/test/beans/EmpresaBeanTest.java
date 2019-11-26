/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.faces.model.SelectItem;
import model.Empresa;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EduardoCFN
 */
public class EmpresaBeanTest {
    
    public EmpresaBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
    }

    /**
     * Test of init method, of class EmpresaBean.
     */
    @Test
    public void testInit() 
    {
        System.out.println("EmpresaBeanTest: method - init()");
        EmpresaBean instance = new EmpresaBean();
        try 
        {
            instance.init();    
        } catch (Exception e) 
        {
            
        }
        
        System.out.println("Classe");
    }

    /**
     * Test of getEmpresa method, of class EmpresaBean.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        EmpresaBean instance = new EmpresaBean();
        Empresa expResult = null;
        Empresa result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpresa method, of class EmpresaBean.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        Empresa empresa = null;
        EmpresaBean instance = new EmpresaBean();
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConteudo_busca method, of class EmpresaBean.
     */
    @Test
    public void testGetConteudo_busca() {
        System.out.println("getConteudo_busca");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.getConteudo_busca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConteudo_busca method, of class EmpresaBean.
     */
    @Test
    public void testSetConteudo_busca() {
        System.out.println("setConteudo_busca");
        String conteudo_busca = "";
        EmpresaBean instance = new EmpresaBean();
        instance.setConteudo_busca(conteudo_busca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pag_cadastra method, of class EmpresaBean.
     */
    @Test
    public void testPag_cadastra() {
        System.out.println("pag_cadastra");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.pag_cadastra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrar method, of class EmpresaBean.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        int criador = 0;
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.cadastrar(criador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class EmpresaBean.
     */
    @Test
    public void testAlterar() throws Exception {
        System.out.println("alterar");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.alterar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_empresas method, of class EmpresaBean.
     */
    @Test
    public void testListar_empresas() throws Exception {
        System.out.println("listar_empresas");
        EmpresaBean instance = new EmpresaBean();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.listar_empresas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isANumber method, of class EmpresaBean.
     */
    @Test
    public void testIsANumber() {
        System.out.println("isANumber");
        String strNum = "";
        EmpresaBean instance = new EmpresaBean();
        boolean expResult = false;
        boolean result = instance.isANumber(strNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class EmpresaBean.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pag_view method, of class EmpresaBean.
     */
    @Test
    public void testPag_view() {
        System.out.println("pag_view");
        Empresa _empresa = null;
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.pag_view(_empresa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suas_empresas method, of class EmpresaBean.
     */
    @Test
    public void testSuas_empresas() throws Exception {
        System.out.println("suas_empresas");
        int id = 0;
        EmpresaBean instance = new EmpresaBean();
        instance.suas_empresas(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pag_buscar method, of class EmpresaBean.
     */
    @Test
    public void testPag_buscar() throws Exception {
        System.out.println("pag_buscar");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.pag_buscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornar method, of class EmpresaBean.
     */
    @Test
    public void testRetornar() {
        System.out.println("retornar");
        int choose = 0;
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.retornar(choose);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class EmpresaBean.
     */
    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Empresa e = null;
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.excluir(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
