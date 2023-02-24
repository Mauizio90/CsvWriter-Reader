
package eu.mauizio90.csvwriter;

import java.io.IOException;

/**
 *
 * @author mauiz
 */
public class App {

    public static void main(String[] args) throws IOException {
        User maurizio = new User("maurizio", "mastropasqua", 32);
        User giovanni = new User("giovanni", "covelli", 22);
        User pippo = new User("filippo", "mancetti", 65);
        User carlo = new User("carlo", "cracco", 12);
        
        User[] users = {maurizio, giovanni, pippo, carlo};
        

        
        Converter.convert(users);
        CsvReader ciao = new CsvReader();
        ciao.readCsv();
        
    }
}
