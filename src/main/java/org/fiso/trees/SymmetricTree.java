package org.fiso.trees;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {

    //Brute force approach ....O(n) runtime complexity
    public boolean isSymmetric(TreeNode root) {

        if(root == null || (root.right == null  && root.left ==null) )
            return true;

        List<TreeNode> listNodes = new ArrayList<>();
        listNodes.add(root.left);
        listNodes.add(root.right);


        while(!listNodes.isEmpty()){

            int size = listNodes.size();

            List<TreeNode> newLevelNodes = new ArrayList<>();

            for(int i = 0 ; i < size/2; i++){

                TreeNode first = listNodes.get(i);
                TreeNode second = listNodes.get(size - i- 1);
                if(first == null && second == null)
                    continue;

                if((first == null && second != null) || (first != null && second == null))
                    return false;

                if(first.val != second.val)
                    return false;

            }

            listNodes.forEach(n-> {

                if(n != null){
                    newLevelNodes.add(n.left);
                    newLevelNodes.add(n.right) ;
                }

            });

            listNodes = newLevelNodes;

        }
        return true;

    }

}
