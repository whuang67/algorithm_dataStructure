# -*- coding: utf-8 -*-
"""
Created on Sun Dec 31 13:48:09 2017

@author: whuang67
"""

###### Unique Characters in String ######

"""
Given a string, determine if it is compreised of all unique characters. For 
instance, the string 'abcde' has all unique characters and should return True. 
The string 'aabcde' contains duplicate characters and should return False.
"""

## Method 1: Use the set of Python which contains no duplicate values
def uni_char(string):
    return len(set(string)) == len(string)

def uni_char2(string):
    char = set()
    for letter in string:
        if letter in char:
            return False
        else:
            char.add(letter)
    return True


if __name__ == "__main__":
    print("Testing results of Method 1")
    print(uni_char("abcde"))
    print(uni_char("aabcde"))
    print("Testing results of Method 2")
    print(uni_char2("abcde"))
    print(uni_char2("aabcde"))