package Exercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    /**
     * <h1> Desenvolva + | #1322 Datas e java.time</h1>
     * <br>Enunciado<br><br>
     * Convertendo datas<br><br>
     * Utilizando a API de datas do pacote java.time, faça um método chamado converteData para receber uma String no formato 'dd/MM/yyyy', convertê-la para LocalDate e retornar a data original acrescida de três dias. Dica: Utilize a classe DateTimeFormatter para formatar a data e o método plusDays de LocalDate para adicionar dias à data original.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 13/03/2025
     */
    public static String converteData(String dataRecebida) {
        String[] partes = dataRecebida.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        LocalDate date = LocalDate.of(ano, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAtualizada = date.plusDays(3).format(formato);
        return dataAtualizada;
    }
    public static void main(String[] args) {
        System.out.println(converteData("21/08/2022"));
    }
}

