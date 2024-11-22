package print_date;

import org.junit.jupiter.api.Test;

class PrintDateTest {
  @Test
  void printDate() {
    PrintDate printDate = new PrintDate(new SystemCalendar(), new SystemPrinter());

    printDate.printCurrentDate();

    // How can we test this function?
  }
}