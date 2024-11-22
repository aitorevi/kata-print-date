package print_date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PrintDateTest {
    @Test
    void should_check_printer_is_called() {
        PrinterSpy printerSpy = new PrinterSpy();
        PrintDate printDate = new PrintDate(new CalendarDummy(), printerSpy);

        printDate.printCurrentDate();

        assertTrue(printerSpy.isCalled());
    }

    @Test
    void should_use_calendar_to_get_date() {
        CalendarStrictMock calendarStrictMock = new CalendarStrictMock();
        PrintDate printDate = new PrintDate(calendarStrictMock, new PrinterDummy());

        printDate.printCurrentDate();

        calendarStrictMock.verify();
    }

    @Test
    void should_print_current_date() {
        PrinterSpy printerSpy = new PrinterSpy();
        CalendarStrictMock calendarStrictMock = new CalendarStrictMock();
        PrintDate printDate = new PrintDate(calendarStrictMock, printerSpy);

        printDate.printCurrentDate();

        calendarStrictMock.verify();
        assertTrue(printerSpy.isCalled());
    }
}