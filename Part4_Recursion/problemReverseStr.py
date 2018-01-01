# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 15:19:22 2018

@author: whuang67
"""

###### Reverse a String ######
## NO string[::-1] here!

def reverse(s):
    l = len(s)
    if l <= 1:
        return s        
    return s[l-1] + reverse(s[:(l-1)])

def reverse2(s):
    l = len(s)
    if l <= 1:
        return s
    return reverse(s[1:]) + s[0]

if __name__ == "__main__":
    print(reverse("hello"))
    print(reverse("hello world"))
    print(reverse("123456789"))
    
    print(reverse2("hello"))
    print(reverse2("hello world"))
    print(reverse2("123456789"))