package main;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 返回树tree的第level层的所有节点值，并且输出顺序为从左到右
 *
 * @author liuziy
 * @createdate 2022/04/20
 *
 * */
public class treeTraversal {

public void treeLevel(treeBulid.TNode tree, int level){
    if(tree == null)
        return;
    if(level == 1){
        System.out.println(tree.value);
        return ;
    }
    int high = 0;
    Queue<treeBulid.TNode> queue=new LinkedList<>();
    queue.offer(tree);


    while(!queue.isEmpty()){
        int len = queue.size();
        StringBuilder str1 = new StringBuilder();
        for(int m = 0 ; m < len ; m++) {
            treeBulid.TNode ts=queue.poll();
            str1.append(ts.value).append(" ");
            if(ts.left!=null){
                queue.offer(ts.left);
            }
            if(ts.right!=null){
                queue.offer(ts.right);
            }
        }
        high++;
        if(high == level){
            System.out.println(str1);
            return;
        }
    }
   }
}




