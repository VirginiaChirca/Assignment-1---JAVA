package library;
public class book {
    private String name;
    private int nr_pages;
    public book(String name, int nr_pages) {
        this.name = name;
        this.nr_pages = nr_pages;
    }
    public String getName() {
        return name;
    }
    public void afisare() {
        System.out.println("Numele cartii: " + name);
        System.out.println("Numarul paginilor: " + nr_pages);
    }
}

