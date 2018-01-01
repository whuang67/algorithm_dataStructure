# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 13:44:42 2018

@author: whuang67
"""

###### Linked List Reversal ######
"""
Write a function to reverse a linked list in place. The function will take in 
the head of the list as input and return the new head of the list. 
"""

class Node(object):
    def __init__(self, value):
        self.value = value
        self.nextnode = None

def reverse(head):
    currNode = head
    prevNode = None
    nextNode = None
    
    while currNode:
        nextNode = currNode.nextnode
        currNode.nextnode = prevNode
        prevNode = currNode
        currNode = nextNode
    
    return prevNode

if __name__ == "__main__":
    a = Node(1)
    b = Node(2)
    c = Node(3)
    d = Node(4)
    a.nextnode = b; b.nextnode = c; c.nextnode = d
    
    print(reverse(a).value)
    print(d.nextnode.value)
    print(c.nextnode.value)
    print(b.nextnode.value)
    # print(a.nextnode.value)