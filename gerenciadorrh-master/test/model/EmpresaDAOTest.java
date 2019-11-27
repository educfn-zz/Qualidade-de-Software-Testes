/*
 * Eh necessario ter um MySQL ativo e conectado a sua IDE para realizar estes testes.
 */
package model;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    Empresa empresa;
    
    public EmpresaDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
              
    }
    
    @AfterClass
    public static void tearDownClass() 
    {

    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    public void criador()
    {
        empresa = new Empresa(2, "razao_empresa_sa");
        empresa.setBairro("Bairro_qualquer");
        empresa.setCep("11000");
        empresa.setCidade("Cidade");
        empresa.setCnpj("000.000.000-12");
        empresa.setEmail("email@mail.com");
        empresa.setEndereco("Endereco");
        empresa.setEndereco_complemento("endereco");
        empresa.setEndereco_numero("000");
        empresa.setEstado("Estado");
        empresa.setNome_fantasia("Nome_Fantasia");
        empresa.setProprietario("Proprietario");
        empresa.setTelefone("0000-0000");
        empresa.setId_criador(1);
    }
    
    //Teste ignorado devido a nao ser possivel a este metodo encontrar 'cnpj's
    //fora do funcionamento normal da aplicacao.
    @Ignore
    @Test
    public void testAutenticar() throws Exception {
        System.out.println("EmpresaDAOTest: autenticar()");     
        EmpresaDAO instance = new EmpresaDAO(); 
        criador();
        
        try 
        {
          instance.cadastraEmpresa(empresa);
        } catch (Exception e) 
        {
            System.err.println("Erro: problema no cadastramento da empresa!");
        }
       
        
        boolean expResult = true;
        String cnpj = empresa.getCnpj();
        System.out.println("\ncnpj: " + cnpj + "\n");
        boolean result = instance.autenticar(cnpj);
        assertEquals(expResult, result);
        
        instance.excluir(empresa.getCnpj());
    }


    @Test
    public void testCadastraEmpresa() throws Exception {
        System.out.println("EmpresaDAOTest: cadastraEmpresa()");
        EmpresaDAO instance = new EmpresaDAO();
        criador();
        
        instance.excluir(empresa.getCnpj());
        Boolean result = instance.cadastraEmpresa(empresa);
        Boolean expectedResult = true;
        assertEquals(expectedResult, result);
        instance.excluir(empresa.getCnpj());
    
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("EmpresaDAOText: listar()");
        EmpresaDAO instance = new EmpresaDAO();
        
        criador();
        
        instance.cadastraEmpresa(empresa);
        
        List<Empresa> result = instance.listar();
        assertTrue(result != null);
        
         instance.excluir(empresa.getCnpj());
    }

    @Test
    public void testGetEmpresas() throws Exception {
        System.out.println("getEmpresas");
        EmpresaDAO instance = new EmpresaDAO();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.getEmpresas();
        assertEquals(expResult, result);
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
