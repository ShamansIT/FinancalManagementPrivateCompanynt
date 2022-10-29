package Model;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Filter{
    public static final int STEP_DAY = 0;
    public static final int STEP_MONTH = 1;
    public static final int STEP_YEAR = 2;
    private int step;
    private Date fromDate;
    private Date toDate;

    public Filter(){}

    public Filter(int step){
        this.step = step;
    }

    public int getStep(){
        return step;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void next(){
        offsetCalendar(1);
    }
    public void prev(){
        offsetCalendar(-1);
    }

    public void nextPeriod(){
        step += 1;
        if(step > STEP_YEAR) step = STEP_DAY;
        setFromTo(new GregorianCalendar());
    }

    public boolean checkDate(Date date){
        return (date.compareTo(fromDate) > 0) && (date.compareTo(toDate) < 0);
    }

    private void setFromTo(Calendar calendar){
        switch (step) {
            case STEP_DAY -> {
                this.fromDate = new GregorianCalendar(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH),
                        0, 0, 0).getTime();
                this.toDate = new GregorianCalendar(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH),
                        23, 59, 59).getTime();
            }
            case STEP_MONTH -> {
                YearMonth yearMonth = YearMonth.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1);
                this.fromDate = new GregorianCalendar(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        1,
                        0, 0, 0).getTime();
                this.toDate = new GregorianCalendar(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        yearMonth.lengthOfMonth(),
                        23, 59, 59).getTime();
            }
            case STEP_YEAR -> {
                this.fromDate = new GregorianCalendar(
                        calendar.get(Calendar.YEAR),
                        0,
                        1,
                        0, 0, 0).getTime();
                this.toDate = new GregorianCalendar(
                        calendar.get(Calendar.YEAR),
                        11,
                        31,
                        23, 59, 59).getTime();
            }
        }

    }
    private void offsetCalendar(int i){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fromDate);
        switch (step) {
            case STEP_DAY -> calendar.add(Calendar.DAY_OF_MONTH, i);
            case STEP_MONTH -> calendar.add(Calendar.MONTH, i);
            case STEP_YEAR -> calendar.add(Calendar.YEAR, i);
        }
        setFromTo(calendar);
    }

}
