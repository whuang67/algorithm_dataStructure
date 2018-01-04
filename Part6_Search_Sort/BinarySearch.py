# -*- coding: utf-8 -*-
"""
Created on Wed Jan 03 21:10:18 2018

@author: whuang67
"""

###### Binary Search ######
## While statement
def Binary_Search(arr, item):
    if len(arr) == 0:
        return False
    
    first = 0
    last = len(arr)-1
    found = False
    
    while first <= last and not found:
        
        mid = (first+last)//2
        if arr[mid] == item:
            found = True
        else:
            if arr[mid] < item:
                first = mid + 1
            else:
                last = mid - 1
            print(arr[first: (last+1)])
    
    return found

## Recursive
def Binary_Search2(arr, item):
    if len(arr) == 0:
        return False
    
    mid = len(arr)//2
    
    if arr[mid] == item:
        return True
    else:
        if arr[mid] < item:
            print(arr[(mid+1):])
            return Binary_Search2(arr[(mid+1):], item)
        else:
            print(arr[:mid])
            return Binary_Search2(arr[:mid], item)


if __name__ == "__main__":
    arr = [1,2,3,4,5,6,7,8,9,10]
    print(Binary_Search(arr, 10))
    print(Binary_Search(arr, 4))
    
    print(Binary_Search2(arr, 10))
    print(Binary_Search2(arr, 13))
    print(Binary_Search2(arr, 6))