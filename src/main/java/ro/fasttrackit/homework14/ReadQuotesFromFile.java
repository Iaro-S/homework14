package ro.fasttrackit.homework14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadQuotesFromFile {

    public static void main(String[] args) throws Exception {
        List<Quote> quotes = readFromFile();
        quotes.forEach(System.out::println);
    }

    public static List<Quote> readFromFile() throws Exception {
        List<Quote> quotes = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/quotes.txt"));
        String line;
        int id = 1;
        while ((line = fileReader.readLine()) != null) {
            quotes.add(readQuotes(id++, line));
        }
        return quotes;
    }

    private static Quote readQuotes(int id, String quotesInfo) {
        String[] quotesData = quotesInfo.split("~");
        String author = quotesData[0];
        String quote = quotesData[1];
        return new Quote(id, author, quote);
    }
}
