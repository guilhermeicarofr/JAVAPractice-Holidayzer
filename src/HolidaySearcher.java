import java.util.ArrayList;
import java.util.List;

public class HolidaySearcher implements HolidaysListInterface {
  List<Holiday> holidaysList = new ArrayList<>();

  public HolidaySearcher() {
    String[] dates = HolidaysListInterface.dates;
    String[] names = HolidaysListInterface.names;

    for(int i=0; i<dates.length; i++) {
      Holiday holiday = new Holiday(dates[i], names[i]);
      this.holidaysList.add(holiday);
    }
  }

  public void searchList() {
    System.out.println("Lista de feriados:");
    for(int i=0; i<holidaysList.size(); i++) {
      Holiday holiday = this.holidaysList.get(i);
      String date = holiday.getDate();
      String name = holiday.getName();

      System.out.println(date + " - " + name);
    }
  }

  public void searchDate(String searchString) {
    System.out.println("Data pesquisada: " + searchString);

    for(int i=0; i<holidaysList.size(); i++) {      
      Holiday holiday = this.holidaysList.get(i);
      String date = holiday.getDate();
      String name = holiday.getName();

      DateParser util = new DateParser();
      int[] searchValues = util.parse(searchString);
      if(
        searchValues[0] == holiday.getDay() &&
        searchValues[1] == holiday.getMonth() &&
        searchValues[2] == holiday.getYear()
      ) {
        System.out.println(date + "- Feriado: " + name);
        return;
      }    
    }

    System.out.println("Não existe feriado na data: " + searchString);
  }
}
