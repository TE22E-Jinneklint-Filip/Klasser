public class Book {
    private String name;
    private int pages;
    private int currentPage = 0;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        this.currentPage = 0;
    }

    public void TurnPage() {
        if (currentPage < pages) {
            currentPage++;
        } else {
            System.out.println("Du är redan på sista sidan i boken!");
        }
    }

    public int GetCurrentPage() {
        return currentPage;
    }

    public String GetName() {
        return name;
    }

    public int GetPages() {
        return pages;
    }

}
