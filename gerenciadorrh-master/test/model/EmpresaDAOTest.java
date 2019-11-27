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
    public void testGetEmpresas() throws Exception 
    {
        System.out.println("EmpresaDAOTest: getEmpresas()");
        EmpresaDAO instance = new EmpresaDAO();
        List<SelectItem> result = null;
        
        criador();
        instance.cadastraEmpresa(empresa);
        
        result = instance.getEmpresas();
        assertTrue(result != null);
        
        instance.excluir(empresa.getCnpj());
    }

    @Test
    public void testIsANumber() 
    {
        System.out.println("EmpresaDAOTest: isANumber()");
        EmpresaDAO instance = new EmpresaDAO();

        assertTrue(instance.isANumber("1"));
        assertTrue(instance.isANumber("123456789"));
        assertTrue(instance.isANumber("102030"));
        
        assertFalse(instance.isANumber("palavra")); 
        assertFalse(instance.isANumber("12palavra"));
        assertFalse(instance.isANumber(" 102030 "));
        
    }

    @Test
    public void testConsultar() throws Exception {
        System.out.println("EmpresaDAOTest: consultar()");
        EmpresaDAO instance = new EmpresaDAO();
        criador();
        
        
        String _conteudo_busca = "razao social";
        List<Empresa> result = instance.consultar(_conteudo_busca);
        assertTrue(result != null);
        
        instance.excluir(empresa.getCnpj());
    }


    @Test
    public void testConsultarSuasEmpresas() throws Exception {
        System.out.println("EmpresaDAOTest: consultarSuasEmpresas()");
        EmpresaDAO instance = new EmpresaDAO();
        
        criador();
        instance.cadastraEmpresa(empresa);
        
        
        int _conteudo_busca = 1;
        List<Empresa> result = instance.consultarSuasEmpresas(_conteudo_busca);
        assertTrue(result != null);
        
        instance.excluir(empresa.getCnpj());
    }

    @Ignore
    @Test
    public void testAlterar() throws Exception 
    {
        System.out.println("EmpresaDAOTest: alterar()");
        EmpresaDAO instance = new EmpresaDAO();
        criador();
        
        Empresa original;
        Empresa alterada;
        
        original = new Empresa(6, empresa.getRazao_social());
        original.setBairro(empresa.getBairro());
        original.setCep(empresa.getCep());
        original.setCidade(empresa.getCidade());
        original.setCnpj(empresa.getCnpj());
        original.setEmail(empresa.getEmail());
        original.setEndereco(empresa.getEndereco());
        original.setEndereco_complemento(empresa.getEndereco_complemento());
        original.setEndereco_numero(empresa.getEndereco_numero());
        original.setEstado(empresa.getEstado());
        original.setNome_fantasia(empresa.getNome_fantasia());
        original.setProprietario(empresa.getProprietario());
        original.setTelefone(empresa.getTelefone());
        original.setId_criador(empresa.getId_criador());
        
            
        instance.cadastraEmpresa(original);
        
        List<Empresa> empresas = instance.listar();
        int i = empresas.indexOf(original);

        System.out.println("\nNumero: " + i);
        //assertTrue(empresas.isEmpty());
                //empresas.contains(empresa));
        
        //alterada = original;
        original.setCidade("Cidade2");
        
        instance.alterar(original);
        
        //assertTrue(empresas.contains(alterada));
        
        //instance.excluir(alterada.getCnpj());
    }

    @Test
    public void testExcluir() throws Exception {
        System.out.println("EmpresaDAOTest: excluir()");
        EmpresaDAO instance = new EmpresaDAO();
        criador();
        //garantido que a empresa com esse CNPJ não está no Banco de Dados.
        instance.excluir(empresa.getCnpj());
        
        //Recebera true se a empresa nao tiver sido cadastrada antes e foi 
        //cadastrada com sucesso.
        assertTrue(instance.cadastraEmpresa(empresa));
        
        instance.excluir(empresa.getCnpj());
        
        //Caso o 'true' se repita eh porque o metodo 'excluiu' com sucesso o 
        //mesmo anteriormente.
        assertTrue(instance.cadastraEmpresa(empresa));
        
        //Limpando para evitar que esta empresa 'Teste' permaneca no Banco de
        //Dados.
        instance.excluir(empresa.getCnpj());
    }
    
}
