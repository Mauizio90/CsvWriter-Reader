package eu.mauizio90.csvwriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mauiz
 */
public class ObjectConverter {
    public static void convert(User[] array) throws IOException{
        FileWriter writer = new FileWriter("C:\\Users\\mauiz\\Desktop\\Corso Java\\CsvWriter\\csv.csv", true);
        for (User user : array) {
            writer.write(user.getFirstName() + "," + user.getLastName()+ "," + user.getAge() + "\n");
        }
        
        writer.close();
    }
}
