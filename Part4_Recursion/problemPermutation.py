# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 15:26:46 2018

@author: whuang67
"""

###### String Permutation ######
"""
Given a string, write a function that uses the recursion to output a list of 
all the permutations of that string. 

Input: 'abc'
Output: ['abc', 'acb', 'bac', 'bca', 'cab', 'cba']

Input: 'xxx'
Output: ['xxx'] * 6
"""

def permutate(s):
    output = []
    
    if len(s) == 1:
        return s
    
    for i, letter in enumerate(s):
        for perm in permutate(s[:i] + s[(i+1):]):
                    ## using replace() will result in losing all duplicate items
            output += [letter+perm]
    
    return output

if __name__ == "__main__":
    print(permutate("abc"))
    print(permutate("dog"))
    print(permutate("xxx"))