package Exercicio09;

import java.time.LocalDate;
import java.time.Period;

public class Solution {
    /**
     * <h1> Desenvolva + | #1322 Datas e java.time</h1>
     * <br>Enunciado<br><br>
     * Calculando a diferença de anos entre duas datas<br><br>
     * A classe LocalDate do pacote "java.time", presente na linguagem a partir da versão 1.8, possui uma melhor abstração no tratamento de datas. Sendo assim, escreva um código usando LocalDate para calcular a diferença de anos entre duas datas.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *4-
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 13/03/2025
     */
    public static int obterDiferencaEmAnos(String inicio, String fim) {
        String[] dataInicial = inicio.split("/");
        int diaInicial = Integer.parseInt(dataInicial[0]);
        int mesInicial = Integer.parseInt(dataInicial[1]);
        int anoInicial = Integer.parseInt(dataInicial[2]);
        LocalDate dateInicial = LocalDate.of(anoInicial, mesInicial, diaInicial);
        String[] dataFinal = fim.split("/");
        int diaFinal = Integer.parseInt(dataFinal[0]);
        int mesFinal = Integer.parseInt(dataFinal[1]);
        int anoFinal = Integer.parseInt(dataFinal[2]);
        LocalDate dateFinal = LocalDate.of(anoFinal, mesFinal, diaFinal);
        Period periodo = Period.between(dateInicial,dateFinal);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        System.out.println(obterDiferencaEmAnos("08/08/1983","13/03/2025"));
    }
}
