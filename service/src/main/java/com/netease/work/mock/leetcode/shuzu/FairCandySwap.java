package com.netease.work.mock.leetcode.shuzu;

import java.util.Arrays;

/**
 * description:
 * Date: 2019-11-17 上午12:05<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        for (int i =0;i<A.length;i++){
            sumA += A[i];
        }
        for (int i = 0;i<B.length;++i){
            sumB += B[i];
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        int j = 0;
        while (i<A.length && j<B.length){
            if (sumA - A[i] + B[j] > sumB - B[j] + A[i]){
                ++i;
            }else if (sumA - A[i] + B[j] < sumB - B[j] + A[i]){
                ++j;
            }else {
                return new int[]{A[i],B[j]};
            }
        }
        return null;
    }
}
