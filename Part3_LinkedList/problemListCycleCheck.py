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

    marker1 = node
    marker2 = node

    while marker2 != None and marker2.nextnode != None:
        
        # Note
        marker1 = marker1.nextnode
        marker2 = marker2.nextnode.nextnode

        # Check if the markers have matched
        if marker2 == marker1:
            return True

    # Case where marker ahead reaches the end of the list
    return False

if __name__ == "__main__":
    a = Node(1)
    b = Node(2)
    c = Node(3)
    a.nextnode = b; b.nextnode = c; c.nextnode = a
    print(cycle_check(a))
