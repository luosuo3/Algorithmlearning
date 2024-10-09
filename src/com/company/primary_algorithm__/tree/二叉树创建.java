class 二叉树创建 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void start() {
        //来源的数组
        Integer[] data = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        //创建二叉树
        TreeNode treeNode = createTree(data, 0);
    }

    private TreeNode createTree(Integer []array,int index){
        TreeNode treeNode = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            /*主要操作！！！*/
        /*采用递归方式，每次执行此方法，就会生成一个根节点和两个子节点a和b，
		同时子节点a再往下，创建属于a的子节点c和d，b也是同理。
		index为当前的下标。
		*/
            treeNode = new TreeNode(value);
            treeNode.left = createTree(array, 2*index+1);
            treeNode.right = createTree(array, 2*index+2);
            return treeNode;
        }
        return treeNode;
    }
}