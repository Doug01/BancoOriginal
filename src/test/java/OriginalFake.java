import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class OriginalFake {
	BDDOriginalPage conta = new BDDOriginalPage();
	
	@Dado("^Que eu esteja no site do Banco Original$")
	public void que_eu_esteja_no_site_do_Banco_Original() throws Throwable {
		conta.site();
	   
	}

	@Quando("^Eu tentar cadastrar uma conta Fake$")
	public void eu_tentar_cadastrar_uma_conta_Fake() throws Throwable {
	  conta.criarconta();
	  conta.camponome("Douglas Ferreira");
	  conta.campocelular("11971368987");
	  conta.campoemail("Douglas.e2e@eu.com");
	  conta.campocpf("959.854.120-75");
	  conta.enviar();
	 
	}

	@Entao("^O Sistema retornara a mensagem de erro$")
	public void o_Sistema_retornara_a_mensagem_de_erro() throws Throwable {
		conta.msgfinal();
	  
	}
	
	@Quando("^Eu tentar cadastrar uma conta sem preencher meu nome$")
	public void eu_tentar_cadastrar_uma_conta_sem_preencher_meu_nome() throws Throwable {
		 conta.criarconta();
		  conta.camponome("");
		  conta.campocelular("11971368987");
		  conta.campoemail("Douglas.e2e@eu.com");
		  conta.campocpf("959.854.120-75");
		  
	   
	}

	@Entao("^O Sistema retornara a mensagem para preencher o campo obrigatorio$")
	public void o_Sistema_retornara_a_mensagem_para_preencher_o_campo_obrigatorio() throws Throwable {
	  conta.campoobrigatorio();
	}



}
