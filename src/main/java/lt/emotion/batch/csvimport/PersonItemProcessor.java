package lt.emotion.batch.csvimport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) throws Exception {
        int newSalary = (int)(Math.round(person.getSalary() * 1.1));
        final Person transformedPerson = new Person(person.getFirstName(), person.getLastName(), newSalary);
        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }

    private String capitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        str = str.trim();
        int strLen = str.length();
        StringBuffer buffer = new StringBuffer(strLen);
        boolean capitalizeNext = true;
        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                buffer.append(ch);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                buffer.append(Character.toTitleCase(ch));
                capitalizeNext = false;
            } else {
                buffer.append(Character.toLowerCase(ch));
            }
        }
        return buffer.toString();
    }
}
