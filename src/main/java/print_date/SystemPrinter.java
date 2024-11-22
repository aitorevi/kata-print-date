package print_date;

public class SystemPrinter implements Printer {
  @Override
  public void printLine(String line) {
    System.out.println(line);
  }
}
