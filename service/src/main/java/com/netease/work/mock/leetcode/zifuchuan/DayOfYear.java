package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-11-02 下午5:28<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DayOfYear {
    public static void main(String[] args) {
        System.out.println(new DayOfYear().dayOfYear("2019-10-10"));
    }

    public int dayOfYear(String date) {
        String year = date.substring(0, 4);
        Integer month = Integer.valueOf(date.substring(5, 7));
        Integer day = Integer.valueOf(date.substring(8, 10));
        Integer intYear = Integer.valueOf(year);
        boolean flag = false;
        if ((intYear % 4 == 0 && intYear % 100 != 0) || intYear % 400 == 0) {
            flag = true;
        }

        switch (month) {
            case 1:
                return Integer.valueOf(day);
            case 2:
                return 31 + day;
            case 3:
                return 31 + (flag == true ? 29 : 28) + day;
            case 4:
                return 31 * 2 + (flag == true ? 29 : 28) + day;
            case 5:
                return 31 * 2 + 30 + (flag == true ? 29 : 28) + day;
            case 6:
                return 31 * 3 + 30 + (flag == true ? 29 : 28) + day;
            case 7:
                return 31 * 3 + 30*2 + (flag == true ? 29 : 28) + day;
            case 8:
                return 31 * 4 + 30*2 + (flag == true ? 29 : 28) + day;
            case 9:
                return 31 * 5 + 30*2 + (flag == true ? 29 : 28) + day;
            case 10:
                return 31 * 5 + 30*3 + (flag == true ? 29 : 28) + day;
            case 11:
                return 31 * 6 + 30*3 + (flag == true ? 29 : 28) + day;
            case 12:
                return 31 * 6 + 30*4 + (flag == true ? 29 : 28) + day;
        }
        return 0;
    }
}
