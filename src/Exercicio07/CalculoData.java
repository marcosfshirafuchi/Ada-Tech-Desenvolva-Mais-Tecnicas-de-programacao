package Exercicio07;

import java.time.LocalDate;

public class CalculoData {
    /**
     * <h1> Desenvolva + | #1322 Datas e java.time</h1>
     * <br>Enunciado<br><br>
     * Avançando dias de uma data com java.time<br><br>
     * Uma das muitas coisas boas sobre a nova API de data e hora do Java é que ela define os principais conceitos de data e hora, por exemplo instantes, duração, datas, horas, fusos horários e períodos.<br><br>
     *
     * Sendo assim, escreva o código do método avancaDias para obter a data correspondente à data original após a quantidade de dias passados no parâmetro, conforme o modelo da classe de exemplo.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *4-
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 13/03/2025
     */
    public LocalDate avancaDias(LocalDate data, int dias) {
        LocalDate diasAtualizados = data.plusDays(dias);
        return diasAtualizados;
    }

    public static void main(String[] args) {
        CalculoData data = new CalculoData();
        System.out.println(data.avancaDias(LocalDate.now(), 5));
    }
}
