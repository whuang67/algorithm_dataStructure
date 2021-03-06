# -*- coding: utf-8 -*-
"""
Created on Sat Dec 30 23:13:15 2017

@author: whuang67
"""

###### Largest Continuous Sum ######
"""
Given an array of integers (including positive and negative), find the largest
continuous sum.
"""

## Method 1: Basic version, output max_sum only
def large_cont_sum(arr):
    if len(arr) == 0:
        return 0

    max_sum = current_sum = arr[0]
    
    for i, num in enumerate(arr[1:]):
        ## current_sum + num ==> [.., .., num]
        ## num ==> [num]
        ## if current_sum < num, it is unnecessary to include the previous array slice
        current_sum = max(current_sum+num, num)
        max_sum = max(current_sum, max_sum)
    return max_sum

## Method 2: Advanced version, output max_sum and the array slice
def large_cont_sum2(arr):
    if len(arr) == 0:
        return 0

    max_sum = current_sum = arr[0]
    
    ## first, last for final output
    ## start, end for current array that is being calculated
    first = last = start = 0    
    for i, num in enumerate(arr[1:]):
        ## current_sum + num ==> [.., .., num]
        ## num ==> [num]
        ## if current_sum < num, it is unnecessary to include the previous array slice
        if current_sum + num > num:   ## if current_sum > 0:
            current_sum += num
        else:
            current_sum = num
            start = i + 1
        # current_sum = max(current_sum+num, num)
        
        if current_sum > max_sum:
            max_sum = current_sum
            last = i + 1
            first = start
        # max_sum = max(current_sum, max_sum)
    
    print(arr[first: (last+1)])
    return max_sum

"""
The algorithm is, we start summing up the numbers and store in a current sum 
variable. 

After adding each element, we check whether the current sum is larger than 
maximum sum encountered so far. 

If it is, we update the maximum sum. As long as the current sum is positive, 
we keep adding the numbers. 

When the current sum becomes negative, we start with a new current sum. 

Because negative current sum will only decrease the sum of a future sequence. 

Note that we don't reset the current sum to 0 because the array can contain all 
negative integers. Then, the result would be the largest negative number.  
"""


if __name__ == "__main__":
    
    print("ALL negative array")
    print(large_cont_sum2([-1,-2,-3,-4]))
    print(large_cont_sum2([-4,-3,-1,-2]))
    
    print("Testing results of Udemy")
    from nose.tools import assert_equal

    class LargeContTest(object):
        def test(self,sol):
            assert_equal(sol([1,2,-1,3,4,-1]), 9)  
            assert_equal(sol([1,2,-1,3,4,10,10,-10,-1]), 29)
            assert_equal(sol([-1,1]), 1)
            print ('ALL TEST CASES PASSED')
        
    #Run Test
    t = LargeContTest()
    t.test(large_cont_sum)
