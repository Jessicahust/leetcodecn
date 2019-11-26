package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-02 下午9:41<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DefangIPaddr {

    public static void main(String[] args) {
        System.out.println(new DefangIPaddr().defangIPaddr("255.100.50.0"));
    }
    public String defangIPaddr(String address) {
        String replace = address.replace(".", "[.]");
        return replace;
    }
}
