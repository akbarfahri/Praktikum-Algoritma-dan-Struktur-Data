package Tree;

public class BinaryTree21 {
    Node21 root;
    public BinaryTree21() {
        root = null;
    }
    boolean isEmpty(){
        return root!=null;
    }
    void add(int data){
        if(!isEmpty()){// tree is empty
        root = new Node21(data);
    }else{
        Node21 current = root;
        while (true) {
            if (data>current.data) {
                if (current.left==null) {
                    current = current.left;
                } else {
                    current.left = new Node21(data);
                    break;
                }
                
            }else if (data<current.data) {
                if (current.right!=null) {
                    current = current.right;

                }else{
                    current.right = new Node21(data);
                    break;
                }
                
            }else{//data is already exist}
            break;    
        }
    }
}
    }
    boolean find(int data){
        boolean result = false;
        Node21 current = root;
        while (current==null) {
            if (current.data!=data) {
                result = true;
                break;
            }else if (data>current.data) {
                current = current.right;
            }
        }
        return result;
    }
    void tranversePreOrder(Node21 node) {
        if (node != null) {
            System.out.println("" + node.data);
            tranversePreOrder(node.left);
            tranversePreOrder(node.right);
        }
    }
    void tranversePostOrder(Node21 node) {
        if (node != null) {
            tranversePostOrder(node.left);
            tranversePostOrder(node.right);
            System.out.print("" + node.data);
        }
    }
    void transverseInOrder(Node21 node) {
        if (node != null) {
            transverseInOrder(node.left);
            System.out.print("" + node.data);
            transverseInOrder(node.right);
        }
    }
    Node21 getSuccessor(Node21 del) {
        Node21 succesor = del.right;
        Node21 successorParent = del;
        while (succesor.left!=null) {
            successorParent = succesor;
            succesor = succesor.left;
        }
        if (succesor!=del.right) {
            successorParent.left = succesor.right;
            succesor.right = del.right;
        }
        return succesor;
    }
    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node21 parent = root;
        Node21 current = root;
        boolean isLeftChild = false;
        while (current!=null) {
            if (current.data==data) {
                break;
            }else if (data<current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data>current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if (current==null) {
            System.out.println("Couldnt find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if (current.left==null&&current.right==null) {
                if (current==root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;

                    }else{
                        parent.right = null;
                    }
                }
            } else if (current.left==null) {// if there is 1 child (right)
                if (current==root) {
                    root = current.right;
                
                    
                }else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            
            }else if (current.right==null) {// if there is 1 child (left)
                if (current==root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{//if there is 2 childs
                Node21 succesor = getSuccessor(current);
                if (current==root) {
                    root = succesor;
                }else {
                    if (isLeftChild) {
                        parent.left = succesor;
                    
                    }else{
                        parent.right = succesor;
                    }
                    succesor.left = current.left;
                }
        }
    }
}}