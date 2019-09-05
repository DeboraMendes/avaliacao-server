package br.com.viasoft.avaliacao.tarifa;

import java.io.*;
import java.util.Date;

public class LogUpdateValorTarifaPassagem {

    public static void save(String content) {

        Date dataHoraAtual = new Date();

        File dir = new File("../resources/static/logs/");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        try {

            // Cria arquivo
            File file = new File(String.valueOf(dataHoraAtual)+"txt");

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
            FileReader ler = new FileReader(String.valueOf(dataHoraAtual)+"txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

            // Imprime confirmacao
            System.out.println("Arquivo: " + String.valueOf(dataHoraAtual)+"txt" + " salvo com sucesso! ");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
