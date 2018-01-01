# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 01:10:17 2018

@author: whuang67
"""

###### Singly Linked List Cycle Check ######
"""
Given a singly linked list, write a function which takes in the first node in a 
singly linked list and returns a boolean indicating if the linked list contains 
a 'cycle'.

A cycle is when a node's next point actually points back to a previous node in 
the list. This is also sometimes known as a circularly linked list. 

The linked list node class is given: 
"""
class Node(object):
    def __init__(self, value):
        self.value = value
        self.nextnode = None

def cycle_check(node):
    lst = [node.value]
    current_node = node
    while current_node.nextnode:
        val = current_node.nextnode.value
        if val in lst:
            return True
        lst.append(current_node.nextnode.value)
        current_node = current_node.nextnode
    return False

a = Node(1)
b = Node(2)
c = Node(3)
a.nextnode = b; b.nextnode = c; c.nextnode = a

print(cycle_check(a))