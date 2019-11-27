/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.faces.model.SelectItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author EduardoCFN
 */
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Ignore
    @Test
    public void testAutenticar() throws Exception {
        System.out.println("autenticar");
        String cnpj = "";
        EmpresaDAO instance = new EmpresaDAO();
        boolean expResult = false;
        boolean result = instance.autenticar(cnpj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCadastraEmpresa() throws Exception {
        System.out.println("EmpresaDAOTest: cadastraEmpresa()");
        
        Empresa empresa = new Empresa(2, "razao_empresa_sa");
        empresa.setBairro("Bairro_qualquer");
        empresa.setCep("11000");
        empresa.setCidade("Cidade");
        empresa.setCnpj("0.000.000");
        empresa.setEmail("email@mail.com");
        empresa.setEndereco("Endereco");
        empresa.setEndereco_complemento("endereco");
        empresa.setEndereco_numero("000");
        empresa.setEstado("Estado");
        empresa.setNome_fantasia("Nome_Fantasia");
        empresa.setProprietario("Proprietario");
        empresa.setTelefone("0000-0000");
        empresa.setId_criador(2);
        
        EmpresaDAO instance = new EmpresaDAO();
        instance.excluir(empresa.getCnpj());
        Boolean result = instance.cadastraEmpresa(empresa);
        Boolean expectedResult = true;
        assertEquals(expectedResult, result);
        instance.excluir(empresa.getCnpj());
    
    }

    @Ignore
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        EmpresaDAO instance = new EmpresaDAO();
        List<Empresa> expResult = null;
        List<Empresa> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testGetEmpresas() throws Exception {
        System.out.println("getEmpresas");
        EmpresaDAO instance = new EmpresaDAO();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.getEmpresas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testIsANumber() {
        System.out.println("isANumber");
        String strNum = "";
        EmpresaDAO instance = new EmpresaDAO();
        boolean expResult = false;
        boolean result = instance.isANumber(strNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        String _conteudo_busca = "";
        EmpresaDAO instance = new EmpresaDAO();
        List<Empresa> expResult = null;
        List<Empresa> result = instance.consultar(_conteudo_busca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testConsultarSuasEmpresas() throws Exception {
        System.out.println("consultarSuasEmpresas");
        int _conteudo_busca = 0;
        EmpresaDAO instance = new EmpresaDAO();
        List<Empresa> expResult = null;
        List<Empresa> result = instance.consultarSuasEmpresas(_conteudo_busca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testAlterar() throws Exception {
        System.out.println("alterar");
        Empresa empresa = null;
        EmpresaDAO instance = new EmpresaDAO();
        instance.alterar(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        String cnpj = "";
        EmpresaDAO instance = new EmpresaDAO();
        instance.excluir(cnpj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
