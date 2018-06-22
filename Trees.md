# Trees
#### prerequisite
> defination of tree-> single root/every node has only one parent(except root)/no cycles
## Binary Search Trees

1.本质是需要一种adt for sorted list且这种adt提供有接口添加／删除／遍历／查找功能：
第一种implementation array->查找的worst case ：不在array中,takes Θ(logn);
插入的worst case:在数组的开始插入数据，需要将n-1移位，takes Θ(n)；
同理删除，Θ(n)
第二种implementation singly linked list->插入不需要移位但是需要一个记录需要插入位置的指针，如果在链表的尾部仍然需要遍历链表插入，worst case takes Θ(n)，查找删除同理。
根据binary search我们从中list的中间开始查找数据并且通过大小关系discard一半的数据，我们希望的数据结构有一个记录中间位置的指针，分成两半后每一半各有一个中间位置的指针，repeat process同时我们希望可以像linked list的一样通过一个类似头指针的东西去trace整个数据结构，then we have binary search trees.<br>
2.Definition of binary trees
A binary tree is a recursive data structure,defined with base case(Empty tree/null pointer) and recursive case(TreeNode: Left/Right child and data field), any parent can have at most 2 children.
一些术语
leaf node : a node has no children
interior node: not a leaf node
ancestor/descendant:if there is a directed path from parent to that node.
depth:the length of path from the root to that node
height of a tree: deepest node + 1
属性
min number of nodes of height h : linked list liked tree, contains h nodes
max number of nodes of height h: perfect binary tree, all leaves same depth, all interior nodes have exactly 2 children, contains 2 to the h th  - 1 nodes
min height of a binary tree with n nodes: pack as many nodes as possible h = Θ(logn)
max height: linked list liked, h = n <br>
3.Binary Search trees
A binary search tree is a binary tree with the properties:left <= this <= right 
回到1:这种adt的实现比1提到的两种好在哪里？
因为这种adt的添加／删除／查找takes  Θ(the height of the tree), the average-case running time is Θ(logn),但我们需要对于max height的情况进行实现上的改进。
实现：find／insert／delete（注意如果删除的数据拥有两个孩子则需要将right subtree里最小的那个从原来位置删除并且放到这个parent的位置上来） 以及四种traversals preorder(建tree的路径：先有root再有左右)/postorder（删掉整棵树的路径：从左右孩子开始删除然后拿走root）/inorder（以这个order我们可以把整个sorted list拿出来）/levelorder（bfs？？？）

## Binary Trees

>从特殊到一般，现在我们需要知道如何得到二叉树结构的一些结论：比如深度高度有多少叶子结点等等