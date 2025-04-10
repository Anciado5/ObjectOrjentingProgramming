public class Book {

    public Book(){
    }

    public Book(String title, int pages, int releaseYear){//konstruktorius
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString(){
        return "Title:" + this.title + ", Pages:" + this.pages + ", Release year:" + this.releaseYear;
    }

    private String title;//done

    private int pages;//done

    private int releaseYear;

        public String getTitle() {//geteris
        return this.title;
    }
    public void setTitle(String title) {//seteris
        this.title = title;
    }
    public int getPages() {
        return this.pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getReleaseYear() {
        return this.releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }




}
