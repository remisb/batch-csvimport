package lt.emotion.batch.csvimport;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class CsvImportBatchApplication {

    public static void main(String[] args) {
//        String[] newArgs = new String[] {"inputFlatFile=/input/player-small1.csv"};
        String[] newArgs = new String[] {"inputFlatFile=/input/people.csv"};
        SpringApplication.run(CsvImportBatchApplication.class, newArgs);
    }
}
