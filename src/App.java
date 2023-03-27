public class App {
    public static void main(String[] args) {
        HolidaySearcher searcher = new HolidaySearcher();
        searcher.searchList();

        searcher.searchDate("12/10/2023");
        searcher.searchDate("2/11/2023");
        searcher.searchDate("02/11/2023");
        searcher.searchDate("23/10/2023");
    }
}
