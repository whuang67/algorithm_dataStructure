# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 00:39:18 2018

@author: whuang67
"""

###### Singly Linked List ######

## Pros: 1. Linked lists have constant-time insertions and deletions in any 
##          position, in comparison, arrays require O(n) time to do the same thing. 
##       2. Linked lists can continue to expand without having to specify their 
##          size ahead of time. 

## Cons: To access an element in a linked list, you need to take O(k) time to 
##       go from the head of the list to the k-th element. In contrast, arrays 
##       have constant time operations to access elements in any array.

class Node(object):
    def __init__(self, value):
        self.value = value
        self.nextNode = None

###### Doubly Linked List ######
        
class DoublyLinkedListNode(object):
    def __init__(self, value):
        self.value = value
        self.nextNode = None
        self.prevNode = None


if __name__ == "__main__":
    ###### Single Linked List ######
    a = Node(1)     ## Create several nodes
    b = Node(2)
    c = Node(3)
    a.nextNode = b  ## Link the nodes together
    b.nextNode = c
    print(a.value)  ## Call their values
    print(a.nextNode.value)
    print(a.nextNode.nextNode.value)
    
    ###### Double Linked List ######
    A = DoublyLinkedListNode(1)     ## Create several nodes
    B = DoublyLinkedListNode(2)
    C = DoublyLinkedListNode(3)
    A.nextNode = B; B.prevNode = A  ## Link the nodes together
    B.nextNode = C; C.prevNode = B
