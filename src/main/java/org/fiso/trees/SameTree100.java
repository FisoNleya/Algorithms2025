package org.fiso.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SameTree100 {
}



class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public boolean isSameNotIdealSolutionTree(TreeNode p, TreeNode q) {


        TreeNode currentPNode = p;
        Stack<TreeNode> pStake = new Stack();
        pStake.push(currentPNode);

        List<TreeNode> ptreeValues = new ArrayList<>();

        while(!pStake.isEmpty()){

            currentPNode = pStake.pop();

            ptreeValues.add(currentPNode);

            if(currentPNode != null){


                if(currentPNode.left == null &&  currentPNode.right==null)
                    continue;

                if(currentPNode.right != null)
                    pStake.push(currentPNode.right);

                pStake.push(currentPNode.left);
            }


        }


        TreeNode currentQNode = q;
        Stack<TreeNode>  qStake = new Stack();
        qStake.push(currentQNode);


        List<TreeNode> qtreeValues = new ArrayList<>();

        while(!qStake.isEmpty()){

            currentQNode = qStake.pop();
            qtreeValues.add(currentQNode);

            if(currentQNode != null){

                if(currentQNode.left == null &&  currentQNode.right==null)
                    continue;

                if(currentQNode.right != null)
                    qStake.push(currentQNode.right);

                qStake.push(currentQNode.left);

            }

        }


        if(qtreeValues.size()  != ptreeValues.size())
            return false;

        int index = 0;

        while(index < ptreeValues.size()){

            TreeNode pNode = ptreeValues.get(index);
            TreeNode qNode = qtreeValues.get(index);


            if( pNode != null && qNode== null){
                return false;
            }else if(pNode == null && qNode != null){
                return false;
            }else if(pNode != null && qNode != null){
                if(pNode.val != qNode.val ){
                    return false;
                }
            }

            index++;
        }

        return true;
    }

}