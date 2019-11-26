package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-11-02 下午9:09<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindOcurrences {

    public String[] findOcurrences(String text, String first, String second) {

        String[] split = text.split(" ");
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < split.length - 1; ++i) {
            if (split[i].equals(first) && split[i + 1].equals(second)) {
                if (i + 2 < split.length) {
                    ret.add(split[i + 2]);
                }
            }
        }
        String[] rets = new String[ret.size()];
        return ret.toArray(rets);
    }
}
