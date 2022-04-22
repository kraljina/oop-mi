package hr.fer.oop.task3;

public class WebEntry<Entry> {
    private String author;
    private String date;
    private Entry entry;

    public WebEntry(String author, String date, Entry entry) {
        this.author = author;
        this.date = date;
        this.entry = entry;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Entry getEntry() {
        return entry;
    }
}
