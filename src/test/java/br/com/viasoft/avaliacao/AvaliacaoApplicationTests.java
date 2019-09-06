package br.com.viasoft.avaliacao;

import br.com.viasoft.avaliacao.tarifa.*;
import br.com.viasoft.avaliacao.tipoOnibus.TipoOnibus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalTime;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AvaliacaoApplicationTests {

	@Mock
	private TarifaRepository tarifaRepository;

	@Mock
	private LogUpdateValorTarifaPassagem logUpdateValorTarifaPassagem;

	@InjectMocks
	private TarifaServiceImpl tarifaServiceImpl;

	@Captor
	private ArgumentCaptor<Tarifa> tarifaCaptor;

	private TipoOnibus tipoOnibus1;
	private TipoOnibus tipoOnibus2;

	private Tarifa tarifa1;
	private Tarifa tarifa2;

	@Before
	public void criarTipoOnibus() {
		this.tipoOnibus1 = new TipoOnibus();
		this.tipoOnibus1.setId(1L);
		this.tipoOnibus1.setDescricao("Metropolitano");

		this.tipoOnibus2 = new TipoOnibus();
		this.tipoOnibus2.setId(2L);
		this.tipoOnibus2.setDescricao("Convencional");
	}

	@Before
	public void criarTarifa() {
		this.tarifa1 = new Tarifa();
		this.tarifa1.setId(1L);
		this.tarifa1.setPartida(LocalTime.now());
		this.tarifa1.setValor(1D);
		this.tarifa1.setTipoOnibus(tipoOnibus1);
		this.tarifa1.setTempoViajem("11:00");

		this.tarifa2 = new Tarifa();
		this.tarifa2.setId(2L);
		this.tarifa2.setPartida(LocalTime.now());
		this.tarifa2.setValor(2D);
		this.tarifa2.setTipoOnibus(tipoOnibus2);
		this.tarifa2.setTempoViajem("12:00");
	}

	//um que lance uma exceção
	@Test(expected = ValorMenorQueZeroException.class)
	public void naoDeveSalvarTarifaComValorMenorQueZero() throws Exception {
		tarifa1.setValor(0D);
		tarifaServiceImpl.save(tarifa1);
	}


	//outro que mostre que determinado método foi invocado
	@Test
	public void deveVerificarSeSaveDoLogUpdateValorTarifaPassagemFoiInvocado() throws ValorMenorQueZeroException {
		Double novoValor =  tarifa1.getValor()+1;
		tarifaServiceImpl.updateValorTarifaPassagem(tarifa1.getId(), novoValor);
		verify(logUpdateValorTarifaPassagem).save("O valor da Tarifa: " + tarifa1.getId() + " foi alterado para: " + novoValor.toString());
	}

	//captura argumentos
	@Test
	public void deveVerificarSeDeletouTarifaCorreta() {
		tarifaServiceImpl.delete(tarifa2);
		verify(tarifaRepository).delete(tarifaCaptor.capture()); //no momento que o tarifaRepository for executar o delete o objeto passado por parametro para ele será interceptado
		Assert.assertEquals(tarifa2.getId(), tarifaCaptor.getValue().getId()); //comparo se o id do objeto que mandei ser excluido é o mesmo id do objeto que efetivamente foi excluido
	}

}
