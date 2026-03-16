// Inorder Preorder and PostOrder using single iteration

Stack<Pair> s = new Stack<>();
List<Integer> pre =
List<Integer> in =
""            post = ....;

if(root == null) return ;

S.push(root,1);
while(!s.isEmpty()){
Pair temp = s.pop();
if( temp.num == 1){
pre.add(temp.root.val);
temp.num ++;
s.push(temp);
if(temp.root.left != null) s.push(temp.root.left,1);
}
else if( temp.num ==2 ){
in.push(temp.node);
temp.num++;
s.push(temp);
if(temp.root.right !=  null) s.push(temp.root.right,1);
} 
else {
post.push(temp.node);
}
}


