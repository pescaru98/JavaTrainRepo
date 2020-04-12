package d003.abstractcls;

import java.util.Date;

public abstract class AbstractHoliday {
    private int holiday_id;
    private Date holidayDuration;

    public int getHoliday_id() {
        return holiday_id;
    }

    public void setHoliday_id(int holiday_id) {
        this.holiday_id = holiday_id;
    }

    public Date getHolidayDuration() {
        return holidayDuration;
    }

    public void setHolidayDuration(Date holidayDuration) {
        this.holidayDuration = holidayDuration;
    }
}
