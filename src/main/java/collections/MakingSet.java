package collections;

/**Класс для создания коллекции из строки. Выделяем из строки все слова, исключаем символы и пробелы
 *
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MakingSet {

    private String sample;

    public MakingSet(String sample) {
        this.sample = sample;
    }

    public List makingSet() {
        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sample);
        ArrayList<String> words = new ArrayList <>();
        while (matcher.find())
            words.add(matcher.group().toLowerCase());
        return words;
    }

}
