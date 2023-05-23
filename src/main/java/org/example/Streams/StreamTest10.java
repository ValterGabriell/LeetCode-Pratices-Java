package org.example.Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamTest10 {
    public static void main(String[] args) {
//        Stream.iterate(1, n -> n + 2)
//                .limit(10)
//                .forEach(System.out::println);
//
//        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10).forEach(Arrays::toString);
//
//        ThreadLocalRandom random = ThreadLocalRandom.current();
//        Stream.generate(() -> random.nextDouble(1, 540)).limit(10).forEach(System.out::println);


        int nums[] = {2, 5, 5, 11};
        System.out.println(Arrays.toString(twoSum2(nums, 10)));
    }

    public static int[] twoSum(int[] nums, int target) {
        var aux = 0;
        var auy = 0;
        var ix = 0;
        var iy = 0;
        var stop = false;
        int[] finalValues = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (stop) {
                break;
            }
            for (int j = 1; j < nums.length; j++) {
                aux = nums[i];
                auy = nums[j];
                ix = i;
                iy = j;
                if (aux + auy == target && ix != iy) {
                    finalValues[0] = ix;
                    finalValues[1] = iy;
                    stop = true;
                    break;
                }
            }
        }
        return finalValues;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] finalValues = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            var currentValue = nums[i];
            if (map.containsKey(target - currentValue)){
                finalValues[0] = i;
                finalValues[1] = map.get(currentValue);
            }
            map.put(nums[i], i);
        }
        return finalValues;
    }
}
