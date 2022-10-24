package Setings;

import java.util.HashMap;

final public class Text {
    private static final HashMap<String, String> data = new HashMap<>();

    private static String get(String key){
        return data.get(key);
    }

    public static String[] getMonth(){
        String[] month = new String[12];
        month[0] = get("JANUARY");
        month[1] = get("FEBRUARY");
        month[2] = get("MARCH");
        month[3] = get("APRIL");
        month[4] = get("MAY");
        month[5] = get("JUNE");
        month[6] = get("JULY");
        month[7] = get("AUGUST");
        month[8] = get("SEPTEMBER");
        month[9] = get("OCTOBER");
        month[10] = get("NOVEMBER");
        month[11] = get("DECEMBER");
        return month;
    }

    public static void init(){
        data.put("PROGRAM_NAME", "Financial management private company");
        data.put("MENU_FILE", "File");
        data.put("MENU_EDIT", "Edit");
        data.put("MENU_VIEW", "View");
        data.put("MENU_HELP", "Help");
        data.put("MENU_ABOUT", "About");

        data.put("JANUARY", "January");
        data.put("FEBRUARY", "February");
        data.put("MARCH", "March");
        data.put("APRIL", "April");
        data.put("MAY", "May");
        data.put("JUNE", "June");
        data.put("JULY", "July");
        data.put("AUGUST", "August");
        data.put("SEPTEMBER", "September");
        data.put("OCTOBER", "October");
        data.put("NOVEMBER", "November");
        data.put("DECEMBER", "December");







    }

}
