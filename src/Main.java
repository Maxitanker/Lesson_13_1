public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {
                "Яблоко", "Банан", "Груша", "Груша", "Игорь",
                "Игорь", "Банан", "Игорь", "Яблоко", "Банан",
                "Банан", "Груша", "Игорь", "Банан", "Яблоко",
                "Игорь", "Яблоко", "Груша", "Банан", "Яблоко"
        };

        // Создаем объект UniqueWordsCounter и передаем массив слов
        WordCounter counter = new WordCounter(wordsArray);
        counter.printUniqueWords();


    }
}
