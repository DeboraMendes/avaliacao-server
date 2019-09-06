package br.com.viasoft.avaliacao;

import br.com.viasoft.avaliacao.tarifa.*;
import br.com.viasoft.avaliacao.tipoOnibus.TipoOnibus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
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

	private TipoOnibus tipoOnibus1;

	private Tarifa tarifa1;

	@Before
	public void criarTipoOnibus() {
		this.tipoOnibus1 = new TipoOnibus();
		this.tipoOnibus1.setId(1L);
		this.tipoOnibus1.setDescricao("Metropolitano");
	}

	@Before
	public void criarTarifa() {
		this.tarifa1 = new Tarifa();
		this.tarifa1.setId(1L);
		this.tarifa1.setPartida(LocalTime.now());
		this.tarifa1.setValor(1D);
		this.tarifa1.setTipoOnibus(tipoOnibus1);
		this.tarifa1.setTempoViajem("11:00");
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
	public void teste3() throws ValorMenorQueZeroException {
		Double novoValor = tarifa1.getValor()+1;

		tarifaServiceImpl.updateValorTarifaPassagem(tarifa1.getId(), novoValor);

		ArgumentCaptor<Tarifa> tarifaArgumentoCaptor = ArgumentCaptor.forClass(Tarifa.class);
		verify(tarifaServiceImpl).updateValorTarifaPassagem(tarifaArgumentoCaptor.capture().getId(), tarifaArgumentoCaptor.capture().getValor());

		Assert.assertEquals(novoValor, tarifaArgumentoCaptor.capture().getValor());

	}

}
