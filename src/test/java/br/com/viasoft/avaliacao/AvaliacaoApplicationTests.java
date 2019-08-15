package br.com.viasoft.avaliacao;

//import br.com.viasoft.avaliacao.linhaPonto.LinhaPonto;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Ter no minimo 3 testes unitários
//Métodos anotados com @BeforeClass são executados apenas uma vez, antes de todos os métodos de teste.
//O método anotado com @AfterClass, por sua vez, é executado uma vez, após a execução do último método de teste da classe.
public class AvaliacaoApplicationTests {

	//escreva um teste por classe de equivalencia

	//TDD (Test-Driven Development): faz muito sentido ao implementar novas funcionalidades, ao corrigir bugs, ao trabalhar em códigos complexos, etc. Nos traz segurança e feedback constante sobre a qualidade do nosso código.
	//escrever um teste para que ele falhe
	//implementar o código em produção
	//escrever o teste mais simples para ele passar (baby steps)
	//refatorar o código
	//testar novamente

	// LinhaPonto linhaPonto;

	//O método Before é executado antes de cada teste da classe. Utilizamos metodos @Befone para criar instancias por exemplo.
	//@Before
	//public void setUp() {
//		this.linhaPonto = new LinhaPonto();
//	}

	//o método com @After é executado após a execução do método de teste. Utilizamos métodos @After quando nossos testes consomem recursos que precisam ser finalizados. Exemplos podem ser testes que acessam banco de dados, abrem arquivos, abrem sockets, e etc.  Testes de Integração.
	@After
	public void finaliza() {
		System.out.println("fim");
	}

	//um que lance uma exceção
	@Test(expected = RuntimeException.class)
	public void naoDeveAvaliarLeiloesSemNenhumLanceDado() {
		//escreve o teste normal, para que que seja lançada uma exceção, se der verde é pq a exceção foi lançada

		//cenário (Test Data Builders)

		//ação

		//validação
		//@Test(expected = RuntimeException.class)
	}

	//outro que mostre que determinado método foi invocado
	@Test
	public void deveAtualizarLeiloesEncerrados() {
/*
		Calendar antiga = Calendar.getInstance();
        antiga.set(1999, 1, 20);

        Leilao leilao1 = new CriadorDeLeilao().para("TV de plasma")
            .naData(antiga).constroi();

        RepositorioDeLeiloes daoFalso = mock(RepositorioDeLeiloes.class);
        when(daoFalso.correntes()).thenReturn(Arrays.asList(leilao1));

        EncerradorDeLeilao encerrador = new EncerradorDeLeilao(daoFalso);
        encerrador.encerra();

		//verifica se foi invocado e, se foi deve ter sido inivocado apenas uma vez
        verify(daoFalso, times(1)).atualiza(leilao1);

        //teste abaixo, verifica que o método atualiza() não foi invocado nenhuma vez.
        verify(daoFalso, never()).atualiza(leilao2);

        //Ainda podemos passar atLeastOnce(), atLeast(numero) e atMost(numero) para o verify().
        //O método atLeastOnce() vai garantir que o método foi invocado no mínimo uma vez. Ou seja, se ele foi invocado 1, 2, 3 ou mais vezes, o teste passa. Se ele não for invocado, o teste vai falhar.

        //O método atLeast(numero) funciona de forma análoga ao método acima, com a diferença de que passamos para ele o número mínimo de invocações que um método deve ter.

        //Por fim, o método atMost(numero) nos garante que um método foi executado até no máximo N vezes. Ou seja, se o método tiver mais invocações do que o que foi passado para o atMost, o teste falha.
*/

	}

	//outro a critério - Capturando argumentos
	@Test
	public void teste3() {
		//cenário (Test Data Builders)

		//ação

		//validação
		//Assert.assertEquals(valorEsperado, valorReal, margemErro);

	}

}
