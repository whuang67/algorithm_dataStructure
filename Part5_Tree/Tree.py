# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 23:48:29 2018

@author: whuang67
"""

###### Binary Tree 1 ######
def binaryTree(root):
    return [root, [], []]

def insertLeft(root, newBranch):
    t = root.pop(1)
    if len(t) > 1:
        root.insert(1, [newBranch, t, []])
    else:
        root.insert(1, [newBranch, [], []])
    return root

def insertRight(root, newBranch):
    t = root.pop(2)
    if len(t) > 1:
        root.insert(2, [newBranch, [], t])
    else:
        root.insert(2, [newBranch, [], []])
    return root

def getRootValue(root):
    return root[0]

def setRootValue(root, newValue):
    root[0] = newValue

def getLeftChild(root):
    return root[1]

def getRightChild(root):
    return root[2]


###### Binary Tree 2 ######

class BinaryTree(object):
    def __init__(self, rootObject):
        self.key = rootObject
        self.leftChild = None
        self.rightChild = None
    
    def insertLeft(self, newNode):
        if self.leftChild is None:
            self.leftChild = BinaryTree(newNode)
        else:
            t = BinaryTree(newNode)
            t.leftChild = self.leftChild
            self.leftChild = t
    
    def insertRight(self, newNode):
        if self.rightChild is None:
            self.rightChild = BinaryTree(newNode)
        else:
            t = BinaryTree(newNode)
            t.rightChild = self.rightChild
            self.rightChild = t
    
    def getRightChild(self):
        return self.rightChild
    
    def getLeftChild(self):
        return self.leftChild
    
    def setRootValue(self, newObject):
        self.key = newObject
    
    def getRootValue(self):
        return self.key
    
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
