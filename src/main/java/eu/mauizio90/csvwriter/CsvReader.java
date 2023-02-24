package eu.mauizio90.csvwriter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CsvReader {
    public static void readCsv() throws IOException {
        File csv = new File("C:\\Users\\mauiz\\Desktop\\Corso Java\\CsvWriter\\csv.csv");
        Scanner scanner = new Scanner(csv);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split(",");
            System.out.println("Nome: " + fields[0] + ", Cognome: " + fields[1] + ", Età: " + fields[2]);
        }

        scanner.close();
    }
}