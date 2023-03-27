public class Date {
  private int day;
  private int month;
  private int year;

  void setValues(String dateString) {
    DateParser util = new DateParser();
    int[] dateValues = util.parse(dateString);

    this.day = dateValues[0];
    this.month = dateValues[1];
    this.year = dateValues[2];
  }

  int getDay() {
    return this.day;
  }

  int getMonth() {
    return this.month;
  }

  int getYear() {
    return this.year;
  }
}
