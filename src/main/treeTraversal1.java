package main;

/**
 * 返回树tree的第level层的所有节点值，并且输出顺序为从左到右
 *
 * @author liuziy
 * @createdate 2022/04/19
 *
 * */
public class treeTraversal1 {

    public void treeLevel1(treeBulid.TNode tree, int level){
      if(tree == null){
          return ;
      }
      String str = tree.value + " ";
      if(level == 1){
          System.out.print(str);
          return ;
      }
      if(tree.left != null){
          treeLevel1(tree.left,level-1);
      }
      if(tree.right != null){
          treeLevel1(tree.right,level-1);
      }
    }
}




