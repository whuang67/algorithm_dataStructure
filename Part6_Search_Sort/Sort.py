# -*- coding: utf-8 -*-
"""
Created on Thu Jan 04 13:52:07 2018

@author: whuang67
"""

###### Bubble Sort ########################
def bubble_sort(arr):
    for i in range(len(arr)-1, 0, -1):
        for j in range(i):
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp

###### Selection Sort ########################
def selection_sort(arr):
    
    for i in range(len(arr)):
        positionOfMin = len(arr)-1
        
        for j in range(i, len(arr)-1):    
            if arr[positionOfMin] > arr[j]:
                positionOfMin = j
        
        temp = arr[i]
        arr[i] = arr[positionOfMin]
        arr[positionOfMin] = temp

def selection_sort2(arr):
    for i in range(len(arr)-1, 0, -1):
        positionOfMax = 0
        
        for j in range(1, i+1):
            if arr[positionOfMax] < arr[j]:
                positionOfMax = j
        
        temp = arr[i]
        arr[i] = arr[positionOfMax]
        arr[positionOfMax] = temp


###### Insertion Sort ########################
def insertion_sort(arr):
    
    for i in range(1, len(arr)):
        currentValue = arr[i]
        position = i
        
        while position > 0 and arr[position-1] > currentValue:
            arr[position] = arr[position-1]
            position -= 1
        arr[position] = currentValue


###### Shell Sort ########################
def shell_sort(arr):
    sublistcount = len(arr)/2
    
    while sublistcount > 0:
        for start in range(sublistcount):
            gap_insertion_sort(arr, start, sublistcount)
        
        sublistcount = sublistcount/2

def gap_insertion_sort(arr, start, gap):
    for i in range(start+gap, len(arr), gap):
        
        currentValue = arr[i]
        position = i
        
        while position >= gap and arr[position-gap] > arr[position]:
            arr[position] = arr[position-gap]
            position -= gap
        
        arr[position] = currentValue

###### Merge Sort ########################
def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr)//2
        lefthalf = arr[:mid]
        righthalf = arr[mid:]
        
        merge_sort(lefthalf)
        merge_sort(righthalf)
        
        i = 0; j = 0; k = 0
        while i < len(lefthalf) and j < len(righthalf):
            if lefthalf[i] < righthalf[j]:
                arr[k] = lefthalf[i]
                i += 1
            else:
                arr[k] = righthalf[j]
                j += 1
            k += 1
        
        while i < len(lefthalf):
            arr[k] = lefthalf[i]
            i += 1
            k += 1
        
        while j < len(righthalf):
            arr[k] = righthalf[j]
            j += 1
            k += 1
        
    print(arr)

if __name__ == "__main__":
    ###### Bubble Sort ######
    arr = [5, 3, 7, 2]
    bubble_sort(arr)
    print(arr)
    
    ###### Selection Sort ######
    arr2 = [5, 3, 7, 2]
    selection_sort2(arr2)
    print(arr2)
    arr3 = [5, 3, 7, 2]
    selection_sort2(arr3)
    print(arr3)
    
    ###### Insertation Sort ######
    arr4 = [3, 5, 4, 6, 8, 1, 2, 12, 41, 25]
    insertion_sort(arr4)
    print(arr4)
    
    ###### Shell Sort ######
    arr5 = [3, 5, 4, 6, 8, 1, 2, 12, 41, 25]
    shell_sort(arr5)
    print(arr5)
    
    ###### Merge Sort ######
    arr6 = [11,2,5,4,7,56,2,23]
    merge_sort(arr6)
    print(arr6)
