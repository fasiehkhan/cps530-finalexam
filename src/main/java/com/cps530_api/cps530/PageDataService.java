package com.cps530_api.cps530;



import java.util.*;

public class PageDataService {
    private static Map<Long, PageData> pageDataMap = new HashMap<>();
    private static Long index = 2L;

    static {
        PageData pageOne = new PageData(1L,goodFridayCalculator(),1);
        pageDataMap.put(1L,pageOne);
    }

    public static List<PageData> getPageOneData() {
        return new ArrayList<>(pageDataMap.values());
    }

    //this code will work for future years as well! just update the year in this function
    public static String goodFridayCalculator(){
        int a = 2022 % 19,
                b = 2022 / 100,
                c = 2022 % 100,
                d = b / 4,
                e = b % 4,
                g = (8 * b + 13) / 25,
                h = (19 * a + b - d - g + 15) % 30,
                j = c / 4,
                k = c % 4,
                m = (a + 11 * h) / 319,
                r = (2 * e + 2 * j - k - h + m + 32) % 7,
                month = (h - m + r + 90) / 25, //determines month as a number
                date = ((h - m + r + month + 19) % 32) - 2 ;//determines date of easter then subtracts 2 days for goodfriday




        String test;
        switch(month)//switch case to convert "month" to a string
        {
            case 1:
                test = "January ";
                break;
            case 2:
                test = "February ";
                break;
            case 3:
                test = "March ";
                break;
            case 4:
                test = "April ";
                break;
            case 5:
                test = "May ";
                break;
            case 6:
                test = "June ";
                break;
            case 7:
                test = "July ";
                break;
            case 8:
                test = "August ";
                break;
            case 9:
                test = "September ";
                break;
            case 10:
                test = "October ";
                break;
            case 11:
                test = "November ";
                break;
            case 12:
                test = "December ";
                break;
            default:
                test = "error";
        }

        return "In " + 2022 + ", Good Friday will be on " + test + "" + date + ".";//displays year,date and month of good friday 
    }


}
