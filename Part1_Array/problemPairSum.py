# -*- coding: utf-8 -*-
"""
Created on Sat Dec 30 22:19:57 2017

@author: whuang67
"""

###### Array Pair Sum ######
"""
Given an integer array, output all unique pairs that sum up to a specfic value k
"""
def pair_sum(arr, k):
    if len(arr) < 2:       ## 1. Check if the array length first
        return
    
    seen = set()           ## 2. Set two empty sets for tracking
    output = set()
    
    for num in arr:        ## Only scan array once, O(n)
        target = k - num
        if target not in seen:
            seen.add(num)
        else:
            output.add( ((min(num, target)), max(num, target)) )
    
    print("\n".join(map(str, list(output))))
    return len(output)

if __name__ == "__main__":
    print(pair_sum([1, 3, 2, 2], 4))
    
    from nose.tools import assert_equal
    class TestPair(object):
        def test(self,sol):
            assert_equal(sol([1,9,2,8,3,7,4,6,5,5,13,14,11,13,-1],10), 6)
            assert_equal(sol([1,2,3,1],3), 1)
            assert_equal(sol([1,3,2,2],4), 2)
            print('ALL TEST CASES PASSED')
    
    #Run tests
    print("Testing results of Udemy")
    t = TestPair()
    t.test(pair_sum)