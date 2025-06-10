package org.fiso.pascal;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        numRows--;

        while (numRows > 0 ){
            List<Integer> iterationList = result.get(result.size()-1);
            List<Integer> newList = new ArrayList<>();

            for(int i = 0 ; i <iterationList.size(); i ++){
                if(i == 0){
                    newList.add(iterationList.get(i));
                }else {
                    newList.add(iterationList.get(i-1) + iterationList.get(i));
                }

            }

            newList.add(iterationList.get(iterationList.size() -1));

            result.add(newList);
            numRows--;
        }

        return result;

    }

}
