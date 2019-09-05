package br.com.viasoft.avaliacao;

import br.com.viasoft.avaliacao.tarifa.Tarifa;
import br.com.viasoft.avaliacao.tarifa.TarifaRepository;
import br.com.viasoft.avaliacao.tarifa.TarifaServiceImp;
import br.com.viasoft.avaliacao.tarifa.ValorMenorQueZeroException;
import br.com.viasoft.avaliacao.tipoOnibus.TipoOnibus;
import br.com.viasoft.avaliacao.tipoOnibus.TipoOnibusRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalTime;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class AvaliacaoApplicationTests {

	@InjectMocks
	private TarifaServiceImp tarifaService;

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
		this.tarifa2.setValor(1D);
		this.tarifa2.setTipoOnibus(tipoOnibus2);
		this.tarifa2.setTempoViajem("12:00");

	}

	//um que lance uma exceção
	@Test(expected = ValorMenorQueZeroException.class)
	public void naoDeveSalvarTarifaComValorMenorQueZero() throws Exception {
		tarifa1.setValor(0D);
		tarifaService.save(tarifa1);
	}


	//outro que mostre que determinado método foi invocado
	@Test
	public void deveVerificarSeOsParametrosEstaoCorretos() {


	}

	@Test
	public void teste3() {


	}

}
