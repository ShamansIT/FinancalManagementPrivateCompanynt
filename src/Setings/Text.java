package Setings;

import java.util.HashMap;

final public class Text {
    private static final HashMap<String, String> data = new HashMap<>();

    public static String get(String key){
        return data.get(key);
    }

    public static String[] getMonth(String may){
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

        data.put("ERROR_TITLE_EMPTY", " You don't enter name!");
        data.put("ERROR_IS_EXIST", "This record already exists");
        data.put("ERROR_DATE_FORMAT", "Invalid date format");
        data.put("ERROR_CODE_EMPTY", "Please enter code");
        data.put("ERROR_CURRENCY_EMPTY", "Please select currency");
        data.put("ERROR_ARTICLE_EMPTY", "Please select article");
        data.put("ERROR_ACCOUNT_EMPTY", "Please select account");
        data.put("ERROR_RATE_INCORRECT", "Incorrect course value");
        data.put("ERROR_AMOUNT_FORMAT", "Incorrect amount format");
        data.put("ERROR_NO_BASE_CURRENCY", "You need to set the base currency. Set the format to another currency, after which it will return automatically");



















    }

}
