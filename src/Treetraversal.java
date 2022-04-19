import java.util.LinkedList;
import java.util.Queue;

/**
 * 返回树tree的第level层的所有节点值，并且输出顺序为从左到右
 *
 * @author liuziy
 * @createdate 2022/04/19
 *
 * */
public class Treetraversal {
    public static void main(String[] args) {
        Treetraversal tr = new Treetraversal();
        TNode node = tr.bulidTree();
        tr.treeLevel(node,3);
    }

public static class TNode  {
    String    value;
    TNode   left,right;
    public TNode(String value){
        this.value = value;
    }
}
public TNode bulidTree(){
    TNode A = new TNode("A");
    TNode B = new TNode("B");
    TNode C = new TNode("C");
    TNode D = new TNode("D");
    TNode H = new TNode("H");
    TNode F = new TNode("F");
    TNode G = new TNode("G");
    A.left = B;
    A.right = D;
    B.left = G;
    B.right = H;
    D.left = C;
    D.right = F;
    return A;
}

public void treeLevel(TNode tree, int level){
    if(tree == null)
        return;
    int i = 0,j = 0;
    String[][] arr = new String[10][10];
    Queue<TNode> queue=new LinkedList<>();
    queue.offer(tree);
    while(!queue.isEmpty() ){
        int len = queue.size();
        for(int m = 0 ; m < len ; m++) {
            TNode ts=queue.poll();
            assert ts != null;
            arr[i][j++] = ts.value;
            if(ts.left!=null){
                queue.offer(ts.left);
            }
            if(ts.right!=null){
                queue.offer(ts.right);
            }
        }
        i++;
    }
    for (int n = 0; n < 10; n++){
        if(arr[level-1][n] == null)
            continue;
        else
            System.out.print(arr[level-1][n] + " ");
}
}}




