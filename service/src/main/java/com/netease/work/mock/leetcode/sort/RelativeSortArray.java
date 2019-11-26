package com.netease.work.mock.leetcode.sort;

import java.util.Arrays;


/**
 * description:
 * Date: 2019-10-05 下午9:52<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RelativeSortArray {

    public static void main(String[] args) {
        new RelativeSortArray().relativeSortArray(new int[]{33,22,48,4,39,36,41,47,15,45},new int[]{22,33,48,4});
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index = 0;
        for (int i = 0; i < arr2.length; ++i) {
            int value = arr2[i];
            for (int j = 0; j < arr1.length; ++j) {
                if (arr1[j] == value){
                    int tmp = arr1[index];
                    arr1[index] = arr1[j];
                    arr1[j] = tmp;
                    ++index;
                }
            }
        }
        Arrays.sort(arr1,index,arr1.length);
        return arr1;
    }
}
