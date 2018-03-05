# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 23:48:29 2018

@author: whuang67
"""

###### Binary Tree 1 ######

def BinaryTree(r):
    return [r, [], []]
def insertLeft(root, newBranch):
    root.insert(1, [newBranch, root.pop(1), []])
    return root
def insertRight(root, newBranch):
    root.insert(2, [newBranch, [], root.pop(2)])
    return root
def getRootValue(root):
    return root[0]
def setRootValue(root, new_value):
    root[0] = new_value
def getLeftChild(root):
    return root[1]
def getRightChild(root):
    return root[2]


###### Binary Tree 2 ######

class BinaryTree2(object):
    def __init__(self, r):
        self.root = r
        self.left = None
        self.right = None
        
    def insertLeft(self, newBranch):
        if self.left is None:
            self.left = BinaryTree2(newBranch)
        else:
            temp = BinaryTree2(newBranch)
            temp.left = self.left
            self.left = temp
    
    def insertRight(self, newBranch):
        if self.right is None:
            self.right = BinaryTree2(newBranch)
        else:
            temp = BinaryTree2(newBranch)
            temp.right = self.right
            self.right = temp
    
    def getRootValue(self):
        return self.root
    
    def setRootValue(self, new_value):
        self.root = new_value
    
    def getLeftChild(self):
        if self.left is None:
            return self.left
        return self.left.getRootValue()
   
    def getRightChild(self):
        if self.right is None:
            return self.right
        return self.right.getRootValue()
    
        """
    def preorder(self):
        print(self.key)
        if self.left:
            self.left.preorder()
        if self.right:
            self.right.preorder()
    """

def preorder(tree):
    if tree:
        print(tree.getRootValue())
        preorder(tree.left)
        preorder(tree.right)

def postorder(tree):
    if tree:
        postorder(tree.left)
        postorder(tree.right)
        print(tree.getRootValue())

def inorder(tree):
    if tree:
        inorder(tree.left)
        print(tree.getRootValue())
        inorder(tree.right)


if __name__ == "__main__":
    ###### Binary Tree 1 ######
    r = binaryTree(3)
    print(insertLeft(r, 4))
    print(insertLeft(r, 5))
    print(insertRight(r, 6))
    l = getLeftChild(r)
    print(l)
    setRootValue(l, 9)
    print(r)
    
    ###### Binary Tree 2 ######
    r = BinaryTree("a")
    print(r.getRootValue())
    print(r.getLeftChild())
    r.insertLeft("b")
    print(r.getLeftChild().getRootValue())
    
    print(preorder(r))
    ## print(r.preorder())
