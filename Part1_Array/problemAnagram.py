# -*- coding: utf-8 -*-
"""
Created on Sat Dec 30 22:13:11 2017

@author: whuang67
"""

###### Anagram Problem ######
"""
Given two strings, check to see if they are anagrams. An anagram is when the
two strings can be written using exact the same letters (so you can just
rearrange the letters to get a different phrase or word)
"""
## Method 1
def anagram(s1, s2):
    s1 = s1.replace(" ", "").lower()  ## 1. Remove the space
    s2 = s2.replace(" ", "").lower()  ## 2. Sort two strings
    return sorted(s1) == sorted(s2)   ## 3. Find out if they are identical

## Method 2
def anagram2(s1, s2):
    s1 = s1.replace(" ", "").lower()  ## 1. Remove the space
    s2 = s2.replace(" ", "").lower()
    if len(s1) != len(s2):            ## 2. If lengths of two strings are not equal, return False
        return False
    
    count = {}                        ## 3. If letter in s1, add 1; if in s2, minus 1
    for letter in s1:
        count[letter] = count.get(letter, 0) + 1
    for letter in s2:
        count[letter] = count.get(letter, 0) - 1
    
    if any(count.values()):            ## 4. If there is a non-zero value, return False;
        return False
    # for val in count.values():
    #     if val != 0:
    #         return False
    return True 

if __name__ == "__main__":
    print("Testing results of Method 1")
    print(anagram("dog", "god"))
    print(anagram("public relations", "crap built on lies"))
    print(anagram("clint eastwood", "old west action"))
    
    print("Testing results of Method 2")
    print(anagram2("dog", "god"))
    print(anagram2("public relations", "crap built on lies"))
    print(anagram2("clint eastwood", "old west action"))
    
    from nose.tools import assert_equal
    class AnagramTest(object):
        def test(self, sol):
            assert_equal(sol('go go go','gggooo'), True)
            assert_equal(sol('abc','cba'), True)
            assert_equal(sol('hi man','hi     man'), True)
            assert_equal(sol('aabbcc','aabbc'), False)
            assert_equal(sol('123','1 2'), False)
            print('ALL TEST CASES PASSED')
        
    # Run Tests
    print("Testing resuts of Udemy")
    t = AnagramTest()
    t.test(anagram)
