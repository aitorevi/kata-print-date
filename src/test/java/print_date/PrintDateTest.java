package print_date;

import org.junit.jupiter.api.Test;

class PrintDateTest {
  @Test
  void printDate() {
    PrintDate printDate = new PrintDate(new Calendar(), new Printer());

    printDate.printCurrentDate();

    // How can we test this function?
  }
}