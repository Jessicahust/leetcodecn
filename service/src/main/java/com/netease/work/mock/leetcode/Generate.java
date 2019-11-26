package com.netease.work.mock.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-09-17 上午12:08<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Generate {

    public static void main(String[] args) {
        List<List<Integer>> generate = new Generate().generate(0);
        for (int i = 0;i<generate.size();++i){
            for (int j = 0;j<generate.get(i).size();++j){
                System.out.print(generate.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>(new ArrayList<>());
        if(numRows==0){
            return lists;
        }
        if ( numRows==1) {
            List<Integer> ret = new ArrayList<>();
            ret.add(1);
            lists.add(ret);
            return lists;
        }
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        lists.add(tmp);
        for (int i = 2; i <= numRows; ++i) {
            List<Integer> copy = new ArrayList<>();
            copy.add(1);
            for (int j = 0; j < tmp.size()-1; ++j) {
                copy.add(tmp.get(j)+tmp.get(j+1));
            }
            copy.add(1);
            lists.add(copy);
            tmp = copy;
        }
        return lists;
    }
}
