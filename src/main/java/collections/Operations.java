package collections;

/**Класс для манипуляций со считанными данными
 *
 */

import java.util.*;

public class Operations {

    private List words;

    public Operations (List words) {
        this.words = words;
    }

    //Сортировка коллекции в алфавитном порядке и вывод на экран
    public void order () {
        Collections.sort(words);
        for (Object word : words)
            System.out.println(word);
    }

    //подсчет и вывод на экран статистики по каждому слову из файла (слово - сколько раз в файле оно встречается)
    public void frequency () {
        Set<String> unique=new HashSet<>(words);
        for (Object s : unique)
            System.out.println("word: " + s + ", count: " + Collections.frequency(words, s));
    }

    //ищем слова, встречающиеся максимальное число раз в файле и их частоту
    public void counter () {
        Map<Object, Integer> map = new HashMap<Object, Integer>();
        for (Object s : words) {
            map.put(s, Collections.frequency(words, s));
        }
        int a = Collections.max(map.values());
        for (Object s : map.keySet()) {
            if (map.get(s) == a) {
                System.out.println("word: " + s + ", count: " + a);
           }
        }
    }
}

