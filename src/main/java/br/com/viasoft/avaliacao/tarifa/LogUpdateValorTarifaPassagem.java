package br.com.viasoft.avaliacao.tarifa;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Date;

@Component
public class LogUpdateValorTarifaPassagem {

    public void save(String content) {

        Date dataHoraAtual = new Date();

        try {

            // Cria arquivo
            File file = new File(String.valueOf(dataHoraAtual));

            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                file.createNewFile();
            }

            // Prepara para escrever no arquivo
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Escreve e fecha arquivo
            bw.write(content);
            bw.close();

            // Le o arquivo
            FileReader ler = new FileReader(String.valueOf(dataHoraAtual));
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

            // Imprime confirmacao
            System.out.println("O arquivo: " + String.valueOf(dataHoraAtual) + " foi salvo com sucesso! ");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
