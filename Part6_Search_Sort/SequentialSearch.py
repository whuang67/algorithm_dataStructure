# -*- coding: utf-8 -*-
"""
Created on Wed Jan 03 20:40:39 2018

@author: whuang67
"""

###### Sequential Search ######
def search(arr, item, sort=False):
    
    ## Unordered
    def seq_search(arr, item):
        pos = 0
        found = False
        while pos < len(arr) and not found:
            print(pos)
            if arr[pos] == item:
                found = True
            else:
                pos += 1
        return found
    
    ## Ordered
    def ordered_seq_search(arr, item):
        pos = 0
        found = False
        stopped = False
        
        while pos < len(arr) and not found and not stopped:
            print(pos)
            if arr[pos] == item:
                found = True
            elif arr[pos] > item:
                stopped = True
            else:
                pos += 1
                
        return found
    
    ## If unknown, unordered is the default.
    if sort:
        return ordered_seq_search(arr, item)
    else:
        return seq_search(arr, item)
    
if __name__ == "__main__":
    arr = [1,2,3,4,5,6,7]
    arr2 = [7,6,5,4,3,2,1]
    
    print(search(arr, 5, True))
    print(search(arr, 10, True))
    print(search(arr2, 1))
    print(search(arr2, 10))
