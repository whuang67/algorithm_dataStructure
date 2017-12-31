# -*- coding: utf-8 -*-
"""
Created on Sat Dec 30 22:35:40 2017

@author: whuang67
"""

###### Missing Element ######
"""
Consider an array of non-negative integers. A second array is formed by 
shuffling by the elements of the first array and deleting a random element. 
Given these two arrays, find which element is missing in the second array.
"""
## Method 1
def finder(arr1, arr2):
    ## 1. Sort the arrays
    arr1.sort()
    arr2.sort()
    
    ## 2. Find out the first pairs that are different
    for num1, num2 in zip(arr1, arr2):
        if num1 != num2:
            return num1
    return arr1[-1]

## Method 2 (This method is like the method 2 of the Anagram Problem)
import collections
def finder2(arr1, arr2):
    d = collections.defaultdict(int)
    
    for num in arr2:
        d[num] += 1
    for num in arr1:
        if d[num] == 0:
            return num
        else:
            d[num] -= 0

## Method 3
def finder3(arr1, arr2):
    result = 0
    
    for num in arr1+arr2:
        result = result^num
        # print result
    return result

if __name__ == "__main__":
    print("Testing results of Method 1")
    print(finder([1,2,3,4,5,6,7], [3,7,2,1,4,6]))
    print("Testing results of Method 2")
    print(finder2([1,2,3,4,5,6,7], [3,7,2,1,4,6]))
    print("Testing results of Method 3")
    print(finder3([1,2,3,4,5,6,7], [3,7,2,1,4,6]))
    
    print("Testing results of Udemy")
    from nose.tools import assert_equal
    class TestFinder(object):
        def test(self,sol):
            assert_equal(sol([5,5,7,7], [5,7,7]), 5)
            assert_equal(sol([1,2,3,4,5,6,7], [3,7,2,1,4,6]), 5)
            assert_equal(sol([9,8,7,6,5,4,3,2,1], [9,8,7,5,4,3,2,1]), 6)
            print('ALL TEST CASES PASSED')

    # Run test
    t = TestFinder()
    t.test(finder)