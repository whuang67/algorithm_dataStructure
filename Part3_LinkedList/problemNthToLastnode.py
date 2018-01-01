# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 14:04:10 2018

@author: whuang67
"""

class Node(object):
    def __init__(self, value):
        self.value = value
        self.nextnode = None

    ## 1. Let marker1 go n steps first.
    ## 2. Let marker2 go together with marker1
    ## 3. When marker1 reach the end of the Linked List, marker2 will have n 
    ##    more steps to reach the end.
    ## 4. The marker2's position is what we want. 
    ## DON'T forget to check if n is too big.

def nth_to_last_node(n, head):
    marker1 = marker2 = head
    
    for i in range(n-1):
        if not marker1.nextnode:
            raise LookupError("Inappropriate n, too large!")
        marker1 = marker1.nextnode
    
    while marker1.nextnode:
        marker1 = marker1.nextnode
        marker2 = marker2.nextnode
    
    return marker2.value
    
if __name__ == "__main__":
    a = Node(1)
    b = Node(2)
    c = Node(3)
    d = Node(4)
    e = Node(5)
    a.nextnode = b; b.nextnode = c; c.nextnode = d; d.nextnode = e
    
    print(nth_to_last_node(2, a))
    
    ## This one should generate an ERROR.
    print(nth_to_last_node(6, a))