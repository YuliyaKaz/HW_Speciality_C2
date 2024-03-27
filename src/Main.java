public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        Counter counter = new Counter(fh.readFile());
        System.out.println("Количество слов в файле `input.txt` = " + counter.getCountWords());
        System.out.println("Самое длинное слово в файле `input.txt` = " + counter.getLongerWord());
        System.out.println("Частота слов в файле `input.txt` ");
        counter.wordFrequencyPrint();
    }
}