# -*- coding: utf-8 -*-
"""
Created on Sun Dec 31 17:41:40 2017

@author: whuang67
"""

###### Implement a Queue using 2 Stacks ######
"""
Given a Stack class below, implement a Queue using two stacks!

Note, this is a 'classic' interview question. 
"""

class Queue2Stacks(object):
    def __init__(self):
        # Two Stacks
        self.inStack = []
        self.outStack = []
    
    def enqueue(self, element):
        self.inStack.append(element)

    def dequeue(self):
        if not self.outStack:
            while self.inStack:
                self.outStack.append(self.inStack.pop())
        return self.outStack.pop()

"""
Solution:

The key insight is that a Stack reverses order while a Queue doesn't. A sequence 
of elements pushed on a Stack comes back in reversed order when popped. 
Consequently, two Stacks chained together will return elements in the same order. 

We use an in-stack that we fill when an element is enqueued and dequeue operation 
takes elements from an out-stack. If the out-stack is empty, we pop all elements 
from the in-stack and push them onto the out-stack
"""
if __name__ == "__main__":
    q = Queue2Stacks()
    for i in range(5):
        q.enqueue(i)
    for i in range(5):
        print(q.dequeue())
