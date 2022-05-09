package moe.chei.book.vo;

public class Novel extends Book {
    private String author;
    private String genre;

    public Novel(){}
    public Novel(String author, String genre){
        this.author = author;
        this.genre = genre;
    }

    //setter
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    //getter
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Novel.toString()";
    }
}
