# -*- coding: utf-8 -*-
"""
Created on Wed Jan 03 22:58:53 2018

@author: whuang67
"""

###### Hash Table ######
class HashTable(object):
    def __init__(self, size):
        self.size = size
        self.slots = [None]*self.size
        self.data = [None]*self.size
    
    def put(self, key, value):
        hashvalue = self.hashfunction(key)
        if self.slots[hashvalue] == None:
            self.slots[hashvalue] = key
            self.data[hashvalue] = value
        
        elif self.slots[hashvalue] == key:
            self.data[hashvalue] = value
        
        else:
            nextslot = self.rehash(hashvalue)
            while self.slots[nextslot] != None and self.slots[nextslot] != key:
                nextslot = self.rehash(nextslot)
            if self.slots[nextslot] == None:
                self.slots[nextslot] = key
                self.data[nextslot] = value
            else:
                self.data[nextslot] = value
    
    def hashfunction(self, key):
        return key%self.size
    
    def rehash(self, oldhash):
        return (oldhash+1)%self.size
    
    def get(self, key):
        startslot = self.hashfunction(key)
        stop = False
        data = None
        position = startslot
        while self.slots[position] != None and not stop:
            if self.slots[position] == key:
                data = self.data[position]
                stop = True
                
            else:
                position = self.rehash(position)
                if position == startslot:
                    stop = True
        return data
    
    def __setitem__(self, key, value):
        self.put(key, value)
    
    def __getitem__(self, key):
        return self.get(key)

if __name__ == "__main__":
    h = HashTable(5)
    h[1]="one"
    h[6]="six"
    h[3]="three"
    h[11]="eleven"
    print(h.slots)
    print(h.data)
