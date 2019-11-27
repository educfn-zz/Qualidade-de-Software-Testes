/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import model.Empresa;
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
public class EmpresaBeanTest {
 
    @Inject
    private Empresa empresa;
    private List<Empresa> empresas;
    private String conteudo_busca;
    private EmpresaBean empresaBean;
    
    public EmpresaBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        empresa = new Empresa(12, "razao_empresa_sa");
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
        
        empresaBean = new EmpresaBean();
        empresaBean.setEmpresa(empresa);
        
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testGetEmpresa() {
        System.out.println("EmpresaBeanTest: getEmpresa()");
        EmpresaBean instance = new EmpresaBean();
        Empresa expResult = null;
        Empresa result = instance.getEmpresa();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetEmpresa() {
        System.out.println("EmpresaBeanTest: setEmpresa()");
        Empresa empresa = null;
        EmpresaBean instance = new EmpresaBean();
        instance.setEmpresa(empresa);
    }


    @Test
    public void testGetEmpresas() {
        System.out.println("EmpresaBeanTest: getEmpresas()");
        EmpresaBean instance = new EmpresaBean();
        List<Empresa> expResult = null;
        List<Empresa> result = instance.getEmpresas();
        assertEquals(expResult, result);
    }


    @Test
    public void testSetEmpresas() {
        System.out.println("EmpresaBeanTest: setEmpresas()");
        List<Empresa> empresas = null;
        EmpresaBean instance = new EmpresaBean();
        instance.setEmpresas(empresas);
    }


    @Test
    public void testGetConteudo_busca() {
        System.out.println("EmpresaBeanTest: getConteudo_busca()");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.getConteudo_busca();
        assertEquals(expResult, result);
    }


    @Test
    public void testSetConteudo_busca() {
        System.out.println("EmpresaBeanTest: setConteudo_busca()");
        String conteudo_busca = "";
        EmpresaBean instance = new EmpresaBean();
        instance.setConteudo_busca(conteudo_busca);
    }

    @Test
    public void testListar_empresas() throws Exception {
        System.out.println("EmpresaBeanTest: listar_empresas()");
        EmpresaBean instance = new EmpresaBean();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.listar_empresas();
        assertEquals(expResult, result);
    }

    @Ignore
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("EmpresaBeanTest: cadastrar()");
        int criador = 0;
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.cadastrar(criador);
        assertEquals(expResult, result);
    }

    @Test
    public void testConsultar() throws Exception {
        System.out.println("EmpresaBeanTest: consultar()");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.consultar();
        assertEquals(expResult, result);
    }

    @Test
    public void testPag_view() {
        System.out.println("EmpresaBeanTest: pag_view()");
        Empresa _empresa = null;
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.pag_view(_empresa);
        assertEquals(expResult, result);
    }

    @Test
    public void testPag_cadastra() {
        System.out.println("EmpresaBeanTest: pag_cadastra()");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.pag_cadastra();
        assertEquals(expResult, result);
    }

    @Test
    public void testSuas_empresas() throws Exception {
        System.out.println("EmpresaBeanTest: suas_empresas()");
        int id = 0;
        EmpresaBean instance = new EmpresaBean();
        instance.suas_empresas(id);
    }

    @Test
    public void testPag_buscar() throws Exception {
        System.out.println("EmpresaBeanTest: pag_buscar()");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.pag_buscar();
        assertEquals(expResult, result);
    }

    @Test
    public void testRetornar() {
        System.out.println("EmpresaBeanTest: retornar()");
        int choose = 0;
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.retornar(choose);
        assertEquals(expResult, result);
    }

    @Test
    public void testAlterar() throws Exception {
        System.out.println("EmpresaBeanTest: alterar()");
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        String result = instance.alterar();
        assertEquals(expResult, result);
    }

    @Test
    public void testExcluir() throws Exception {
        System.out.println("EmpresaBeanTest: excluir()");
        Empresa e = null;
        EmpresaBean instance = new EmpresaBean();
        String expResult = "";
        
        //String result = 
        //assertEquals(expResult, result);
        
        /*esperado um NullpointerException quando o banco de dados está vazio,
        *caso contrario alguma valor ja esta sendo armazenado
        */
        try
        {
            instance.excluir(e);
            assertTrue(false);
            System.err.println("Erro: o metodo esta aceitando valores 'nulos'!");
            
        }catch(NullPointerException n)
        {
            assertTrue(true);
        }
        
        /*
        *
        */
        try
        {          
            empresaBean.cadastrar(3669);
            assertTrue(true);
            
        }catch(NullPointerException n)
        {
            assertTrue(false);
        }
        
        
    }
    
}
