package library;
public class album extends book implements common_action {
    private String paper_quality;
    public album(String paper_quality, String name, int nr_pages) {
        super(name, nr_pages);
        this.paper_quality = paper_quality;
    }
    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Calitatea hartiei: " + paper_quality);
    }
}
