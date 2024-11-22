package print_date;

public class PrinterSpy implements Printer {
    private int calls;

    @Override
    public void printLine(String line) {
        calls ++;
    }

    public boolean isCalled() {
        return calls == 1;
    }
}
