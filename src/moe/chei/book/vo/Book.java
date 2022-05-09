package moe.chei.book.vo;

public abstract class Book {
    private String id;
    private String title;
    private String publisher;

    //setter
    public void setId(String id) {
        this.id = id;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //getter
    public String getId() {
        return id;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Book.toString()";
    }
}