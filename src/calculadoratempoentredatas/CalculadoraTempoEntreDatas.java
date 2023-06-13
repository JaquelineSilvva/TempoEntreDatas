/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratempoentredatas;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculadoraTempoEntreDatas {
    public static void main(String[] args) {
        // Formato das datas
        try ( // Cria um objeto Scanner para receber entrada do usuário
                Scanner scanner = new Scanner(System.in)) {
            // Formato das datas
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            // Solicita a primeira data ao usuário
            System.out.print("Digite a primeira data (dd/MM/yyyy): ");
            String data1Str = scanner.nextLine();
            LocalDate data1 = LocalDate.parse(data1Str, formatter);
            // Solicita a segunda data ao usuário
            System.out.print("Digite a segunda data (dd/MM/yyyy): ");
            String data2Str = scanner.nextLine();
            LocalDate data2 = LocalDate.parse(data2Str, formatter);
            // Calcula a diferença entre as datas
            Period periodo = Period.between(data1, data2);
            // Exibe o resultado
            System.out.println("Tempo decorrido: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
            // Fecha o Scanner
        }
    }
}

