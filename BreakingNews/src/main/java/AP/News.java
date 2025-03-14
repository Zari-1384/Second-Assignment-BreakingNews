package AP;

public class News {
    String title;
    String description;
    String sourceName;
    String author;
    String url;
    String publishedAt;

    public void displayNews(){
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("SourceName: " + sourceName);
        System.out.println("Author: " + author);
        System.out.println("Url: " + url);
        System.out.println("PublishedAT: " + publishedAt);
    }

}
