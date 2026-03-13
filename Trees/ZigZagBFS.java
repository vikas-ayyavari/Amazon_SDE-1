// 103 leetcode
import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean rev = false;

        while(!q.isEmpty()){
            int n = q.size();
            LinkedList<Integer> list = new LinkedList<>();

            for(int i=0;i<n;i++){
                TreeNode t = q.poll();
                if(rev) list.addFirst(t.val);
                else list.addLast(t.val);

                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }

            res.add(list);
            rev = !rev;
        }
        return res;
    }
}

/**
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;

        boolean flag = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int l = q.size();
            System.out.println(l);
            List<Integer> sub = new ArrayList<>();
            for(int i = 0; i < l; i++){
                TreeNode temp = q.poll();    
                sub.add(temp.val);            
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);                                            
            }
            if(flag) Collections.reverse(sub);
            flag = !flag;
            res.add(sub);
        }
        return res;
        
    }
}
*/
