# -*- coding: utf-8 -*-
"""
Created on Sat Dec 30 16:00:17 2017

@author: whuang67
"""

##### Dynamic Array ######
import sys

n = 50
dat = []
for i in range(n):
    a = len(dat) ## Number of elements
    b = sys.getsizeof(dat) ## Actual size in Bytes
    print("Length: {0:3d}; Size in Bytes: {1:4d}".format(a, b))
    dat.append(n)


###### Examples ######
import ctypes
class DynamticArray(object):
    def __init__(self):
        self.n = 0
        self.capacity = 1
        self.A = self.make_array(self.capacity)
    
    def __len__(self):
        return self.n
    
    def __getitem__(self, k):
        if not 0 <= k < self.n:
            return IndexError("K is out of bounds!")
        return self.A[k]
    
    def append(self, element):
        if self.n == self.capacity:
            self._resize(2*self.capacity) ## 2x if capacity isn't enough
        self.A[self.n] = element
        self.n += 1
    
    def _resize(self, new_cap):
        B = self.make_array(new_cap)
        for k in range(self.n):
            B[k] = self.A[k]
        self.A = B
        self.capacity = new_cap
    
    def make_array(self, new_cap):
        return (new_cap * ctypes.py_object)()

if __name__ == "__main__":
    arr = DynamticArray()
    len(arr)
    arr.append(2)
    print(arr[0])
