package Exercicio03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Solution {
    /**
     * <h1> Desenvolva + | #1322 Datas e java.time</h1>
     * <br>Enunciado<br><br>
     * Sexta-feira 13<br><br>
     * Fred é um rapaz muito supersticioso que não sai de casa nos dias que são sexta-feira treze, considerado popularmente como um dia de má sorte. Ele pretende se planejar marcando no calendário os dias em que deve ficar em casa. Faça um programa que ajude Fred a descobrir se uma determinada data ocorre na sexta-feira treze. Para isso, crie uma classe que possua o método ehSexta13. O método deverá receber um par de inteiros, para corresponder ao mês e ano respectivamente, e retornar true, se a combinação formar uma data em que ocorre a junção do dia 13 com a sexta-feira, e false caso contrário. Se o mês ou ano forem inválidos, retornar falso também.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *4-
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 13/03/2025
     */
    public static boolean ehSexta13(int mes, int ano) {
        try{
            int dia = 13;
            LocalDate data = LocalDate.of(ano, mes, dia);
            if (data.getDayOfWeek() == DayOfWeek.FRIDAY){
                return true;
            }
        }catch (DateTimeParseException e){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ehSexta13(9, 2024));
    }
}
