package Books;

public class Encyclopedia
{
    private int articles;
    private int pages;
    private String startLetter;
    private String endLetter;
    private String title;


    public int getArticles(){
        return articles;
    }

    public void setArticles(int numArticles){
        articles = numArticles;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getStartLetter(){
        return startLetter;
    }

    public void setStartLetter(String startLetter){
        this.startLetter = startLetter;
    }

    public String getEndLetter(){
        return endLetter;
    }

    public void setEndLetter(String endLetter){
        this.endLetter = endLetter;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
