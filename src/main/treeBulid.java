package main;
/**
 * 创建不同的二叉树
 *
 * @author liuziy
 * @createdate 2022/04/20
 *
 * */
public class treeBulid {
    public static class TNode {
        public String value;
        public TNode left, right;

        public TNode(String value) {
            this.value = value;
        }
    }

    public TNode bulidTree() {
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

    //根据递归，生成一颗i+1层的满二叉树
    public TNode bulidTree(TNode root, int i) {
        if(i == 0) {
            return null;
        }
        root.left = new TNode("" + i);
        addBulidTree(root.left,i-1);
        root.right = new TNode("" + i);
        addBulidTree(root.right,i-1);
        return root;
    }
    public  void addBulidTree(TNode root, int i) {
        if(i == 0) {
            return ;
        }
        root.left = new TNode("" + i);
        addBulidTree(root.left,i-1);
        root.right = new TNode("" + i);
        addBulidTree(root.right,i-1);
    }
    //根据递归，生成一颗i+1层的只有左子树二叉树
    public TNode bulidTreeLeft(TNode root, int i) {
        if(i == 0) {
            return null;
        }
        root.left = new TNode("" + i);
        addBulidTreeLeft(root.left,i-1);
        return root;
    }
    public  void addBulidTreeLeft(TNode root, int i) {
        if(i == 0) {
            return ;
        }
        root.left = new TNode("" + i);
        addBulidTreeLeft(root.left,i-1);
    }
    //根据递归，生成一颗i+1层的只有右子树二叉树
    public TNode bulidTreeRight(TNode root, int i) {
        if(i == 0) {
            return null;
        }
        root.right = new TNode("" + i);
        addBulidTreeRight(root.right,i-1);
        return root;
    }
    public  void addBulidTreeRight(TNode root, int i) {
        if(i == 0) {
            return ;
        }
        root.right = new TNode("" + i);
        addBulidTreeRight(root.right,i-1);
    }
}
