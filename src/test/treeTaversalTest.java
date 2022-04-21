package test;
import main.treeBulid;
import main.treeTraversal;
import main.treeTraversal1;
import org.junit.Test;
/**
 * 返回树tree的第level层的所有节点值，并且输出顺序为从左到右的测试
 *
 * @author liuziy
 * @createdate 2022/04/20
 *
 * */
public class treeTaversalTest {
    //测试方法可以输出正确
    @Test
    public void test1(){
        treeBulid tb = new treeBulid();
        treeTraversal t = new treeTraversal();
        treeTraversal1 t1 = new treeTraversal1();
        long start = System.currentTimeMillis();
        t.treeLevel(tb.bulidTree(),3);
        long end = System.currentTimeMillis();
        System.out.println("方法一运行时间： "+(end-start)+"ms");
        long start1 = System.currentTimeMillis();
        t1.treeLevel1(tb.bulidTree(),3);
        long end1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("方法二运行时间： "+(end1-start1)+"ms");
    }
    //测试输出一颗满二叉树的20层的节点，两种方法的时间消耗
    @Test
    public void trBulid(){
        treeBulid.TNode A = new treeBulid.TNode("0");
        treeBulid tb = new treeBulid();
        treeTraversal t = new treeTraversal();
        treeTraversal1 t1 = new treeTraversal1();
        long start = System.currentTimeMillis();
        t.treeLevel(tb.bulidTree(A,19),20);
        long end = System.currentTimeMillis();
        long start1 = System.currentTimeMillis();
        t1.treeLevel1(tb.bulidTree(A,19),20);
        long end1 = System.currentTimeMillis();
        System.out.println();
        if((end-start - end1 + start1) > 0)
            System.out.println("递归快");
        else if((end-start - end1 + start1) == 0)
            System.out.println("一样快");
        else
            System.out.println("遍历快");
        System.out.println("遍历方法运行时间： "+(end-start )+"ms");
        System.out.println("递归方法运行时间： "+( end1 - start1)+"ms");
    }
    //测试一个只有三层的数，测试1000次，两种方法的时间消耗。
    @Test
    public void trBulid1(){
        treeBulid.TNode A = new treeBulid.TNode("0");
        treeBulid tb = new treeBulid();
        treeTraversal t = new treeTraversal();
        treeTraversal1 t1 = new treeTraversal1();

        long sum = 0;
        for(int i = 0;i < 1000;i++){
            long start = System.currentTimeMillis();
            t.treeLevel(tb.bulidTree(),3);
            long end = System.currentTimeMillis();
            sum += end - start;
        }
        long sum1 = 0;
        for(int i = 0;i < 1000;i++){
            long start1 = System.currentTimeMillis();
            t1.treeLevel1(tb.bulidTree(),3);
            long end1 = System.currentTimeMillis();
            sum1 += end1 - start1;
        }
        System.out.println();
        System.out.println("遍历方法运行时间： "+(sum)+"ms");
        System.out.println("递归方法运行时间： "+(sum1)+"ms");
    }
    //测试输出一个只有左子树的5000层的节点，两种方法的时间消耗
    @Test
    public void trBulid2(){
        treeBulid.TNode A = new treeBulid.TNode("0");
        treeBulid tb = new treeBulid();
        treeTraversal t = new treeTraversal();
        treeTraversal1 t1 = new treeTraversal1();
        long start = System.currentTimeMillis();
        t.treeLevel(tb.bulidTreeLeft(A,4999),5000);
        long end = System.currentTimeMillis();
        long start1 = System.currentTimeMillis();
        t1.treeLevel1(tb.bulidTreeLeft(A,4999),5000);
        long end1 = System.currentTimeMillis();
        System.out.println();
        if((end-start - end1 + start1) > 0)
            System.out.println("递归快");
        else if((end-start - end1 + start1) == 0)
            System.out.println("一样快");
        else
            System.out.println("遍历快");
        System.out.println("遍历方法运行时间： "+(end-start )+"ms");
        System.out.println("递归方法运行时间： "+( end1 - start1)+"ms");
    }
    //测试输出一个只有右子树的5000层的节点，两种方法的时间消耗
    @Test
    public void trBulid3(){
        treeBulid.TNode A = new treeBulid.TNode("0");
        treeBulid tb = new treeBulid();
        treeTraversal t = new treeTraversal();
        treeTraversal1 t1 = new treeTraversal1();
        long start = System.currentTimeMillis();
        t.treeLevel(tb.bulidTreeRight(A,4999),5000);
        long end = System.currentTimeMillis();
        long start1 = System.currentTimeMillis();
        t1.treeLevel1(tb.bulidTreeRight(A,4999),5000);
        long end1 = System.currentTimeMillis();
        System.out.println();
        if((end-start - end1 + start1) > 0)
            System.out.println("递归快");
        else if((end-start - end1 + start1) == 0)
            System.out.println("一样快");
        else
            System.out.println("遍历快");
        System.out.println("遍历方法运行时间： "+(end-start )+"ms");
        System.out.println("递归方法运行时间： "+( end1 - start1)+"ms");
    }
}
