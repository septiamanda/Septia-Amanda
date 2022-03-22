public class TABT 
{
    //Nama : Septia Amanda
    //NIM  : 2111521008

    public void PreOrder(Node root) 
    {
        if (root == null) 
        {
            return;
        }
        System.out.println(root.data + " "); 
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public void InOrder(Node root) 
    {
        if (root == null) 
        {
            return;
        }
        InOrder(root.left);
        System.out.println(root.data + " ");
        InOrder(root.right);
    }
    public void PostOrder(Node root) 
    {
        if (root == null) 
        {
            return;  
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data + " ");
    }

    public static void main(String[] args) 
    {
        Node root = new Node ("+");
        root.left = new Node ("*");
        root.right = new Node ("-");
        root.left.left = new Node ("3");
        root.left.right = new Node ("5");
        root.right.left = new Node ("2");
        root.right.right = new Node ("/");
        root.right.right.left = new Node ("8");
        root.right.right.right = new Node ("4");

        TABT treeOrder = new TABT();

        //PreOrder
        treeOrder.PreOrder(root);
        System.out.println(" ");

        //InOrder
        treeOrder.InOrder(root);
        System.out.println(" ");

        //PostOrder
        treeOrder.PostOrder(root);
        System.out.println(" ");
    }
}
class Node 
{
    String data;
    Node left;
    Node right;

    Node(String string)
    {
        data = string;
        left = right = null;
    }
}