public class DateParser {
  public int[] parse(String date) {
    String[] parts = date.split("/");
    int[] values = new int[3];
    
    for(int i=0; i<3; i++) {
      values[i] = Integer.parseInt(parts[i]);
    }
    return values;
  }
}
