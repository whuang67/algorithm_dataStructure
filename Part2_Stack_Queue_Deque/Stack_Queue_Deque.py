# -*- coding: utf-8 -*-
"""
Created on Sun Dec 31 13:58:21 2017

@author: whuang67
"""

###### Stack ######
## First-in, Last-out (FILO)
class Stack(object):
    def __init__(self):
        self.items = []
    
    def isEmpty(self):
        return self.items == []
    
    def push(self, item):  ## Add one to the top of the stack
        self.items.append(item)
    
    def pop(self):         ## Remove the toppest one from the stack
        return self.items.pop()
    
    def peek(self):
        return self.items[self.size()-1]
    
    def size(self):
        return len(self.items)


###### Queue ######
## First-in, First-out (FIFO)
class Queue(object):
    def __init__(self):
        self.items = []
    
    def isEmpty(self):
        return self.items == []
    
    def enqueue(self, item):   ## Add one to the rear of the queue
        self.items.append(item)

    def dequeue(self):         ## Remove the front one from the queue
        return self.items.pop(0)
    
    def size(self):
        return len(self.items)


###### Deque ######
## Items can be added to the front or the back
## Items can be removed from the front or the back
class Deque(object):
    def __init__(self):
        self.items = []
    
    def isEmpty(self):
        return self.items == []
    
    def addFront(self, item):   ## Add one to the front of the deque
        self.items.insert(0, item)
    
    def addRear(self, item):    ## Add one to the rear of the deque
        self.items.append(item)
    
    def removeFront(self):      ## Remove the front one from the deque
        return self.items.pop(0)
    
    def removeRear(self):       ## Remove the last one from the stack
        return self.items.pop()
    
    def size(self):
        return len(self.items)



if __name__ == "__main__":
    ###### Stack ######
    s = Stack()
    print(s.isEmpty())
    s.push("two")
    print(s.peek())
    s.push(True)
    print(s.peek())
    print(s.isEmpty())
    s.pop()
    s.pop()
    
    ###### Queue ######
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    print(q.dequeue())
    
    ###### Deque ######
    d = Deque()
    d.addFront("Hello")
    d.addRear("World")
    print(d.size())
    print(d.removeFront() + " " +d.removeRear())
    print(d.isEmpty())
