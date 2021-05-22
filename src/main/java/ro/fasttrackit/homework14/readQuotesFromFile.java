package ro.fasttrackit.homework14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class readQuotesFromFile {
    public static void main(String[] args) throws Exception {
        ArrayList<Quote> quotes = readFromFile();
        quotes.forEach(System.out::println);
    }

    public static ArrayList<Quote> readFromFile() throws Exception {
        ArrayList<Quote> quotes = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/quotes.txt"));
        String line;
        while ((line = fileReader.readLine()) != null) {
            quotes.add(readQuotes(line));
        }
        return quotes;
    }

    private static Quote readQuotes(String quotesInfo) {
        String[] quotesData = quotesInfo.split("~");
        int id = 0;
        String author = quotesData[0];
        String quote = quotesData[1];
        return new Quote(id, author, quote, false);
    }
}
