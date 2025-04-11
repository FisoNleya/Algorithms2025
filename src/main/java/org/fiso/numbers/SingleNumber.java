package org.fiso.numbers;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

    public int NonIdealSolution(int[] nums) {


        List<Integer> cleanedList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            Integer val = nums[i];
            if(cleanedList.contains(val)){
                cleanedList.remove(val);
            }else
                cleanedList.add(val);

        }

        return  cleanedList.getFirst();
    }
}

