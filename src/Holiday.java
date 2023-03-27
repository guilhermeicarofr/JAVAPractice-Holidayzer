public class Holiday extends Date {
  private String name;

  public Holiday(String dateString, String name) {
    super.setValues(dateString);
    this.name = name;
  }

  String getName() {
    return this.name;
  }

  String getDate() {
    return(super.getDay() + "/" + super.getMonth() + "/" + super.getYear());
  }
}
