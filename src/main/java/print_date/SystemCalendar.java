package print_date;

import java.util.Date;

public class SystemCalendar implements Calendar {
  @Override
  public Date today() {
    return new Date();
  }
}
