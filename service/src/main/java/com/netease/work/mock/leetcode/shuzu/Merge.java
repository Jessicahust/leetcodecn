package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-09-16 下午6:23<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Merge {

    public static void main(String[] args) {
        int[] a = new int[10];
        a[0]=1;
        a[1]=1;
        a[2]=1;
        new Merge().merge(a, 3, new int[]{2,5,6}, 3);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[len] = nums2[j];
                --len;
                --j;
            } else {
                nums1[len] = nums1[i];
                --len;
                --i;
            }
        }
        while (j>=0){
            nums1[len] = nums2[j];
            --len;
            --j;
        }
    }

}
