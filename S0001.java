//给定一个整数数组 nums 和一个整数目标值 target，
// 请你在该数组中找出 和为目标值 target  的那 两个 整数，
// 并返回它们的数组下标。

import java.util.*;
class S0001 {
    public int[] twoSum(int[] nums, int target) {
        int[]result=new int[2];
        Map<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer a = nums[i];
            if(hashMap.containsKey(a)){
                //判断hashMap中是否已经存在当前数字（意味着该数字为另一个数字的组合部分）
                //若存在则将当前位置储存于result数组的0位，并取出hashMap中当前数字所对应的数据
                result[0]=i;
                result[1]=hashMap.get(a);
                return result;
            }
            hashMap.put(target-nums[i],i);
            //通过hashMap的对应检索功能，将当前数据所需求的数据存入，同时储存当前数据的位置信息
        }
        return result;
    }
}