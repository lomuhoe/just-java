package BookProject;

public class Book {
    private String id;
    private String title;
    private String publisher;

    public Book(){}
    public Book(String id, String title, String publisher){
        this.id = id;
        this.title = title;
        this.publisher = publisher;
    }

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
        // TODO Auto-generated method stub
        return "Book.toString()";
    }
}