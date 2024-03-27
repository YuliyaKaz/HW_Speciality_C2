import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для подсчета данных
 */
public class Counter {
    private List<String> listFruct;
    private Map<String, Integer> wordCounter;

    /**
     * Конструктор.
     * @param list список фруктов
     */
    public Counter(List<String> list) {
        listFruct = new ArrayList<String>(list);
    }

    /**
     * Подсчет количества слов в исходном наборе.
     * @return количество слов
     */
    public int getCountWords() {
        return listFruct.size();
    }

    /**
     * Поиск самого длинного слова в наборе.
     * @return Самое длинное слово в наборе.
     */
    public String getLongerWord() {
        String longerWord = listFruct.get(0);
        for (String fruct : listFruct) {
            if (fruct.length() > longerWord.length()) {
                longerWord = fruct;
            }
        }
        return longerWord;
    }

    /**
     * Набор в виде HashMap для подсчета количества вхождений определенных значений в набор.
     */
    private void wordFrequency() {
        wordCounter = new HashMap<String,Integer>();
        for (String fruct : listFruct) {
            if (fruct.length() > 1) {
                wordCounter.putIfAbsent(fruct, 0);
                wordCounter.put(fruct, wordCounter.get(fruct) + 1);
            }
        }
    }

    /**
     * Вывод на печать набора.
     */
    public void wordFrequencyPrint() {
        wordFrequency();
        wordCounter.forEach((key,value) -> System.out.println(key + " " + value));
    }
}
