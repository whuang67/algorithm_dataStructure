# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 14:28:41 2018

@author: whuang67
"""

###### Recursion ######
## Factorial Example
def factorial_LOOP(n):       ### Loop
    result = 1
    while n > 0:
        result = result * n
        n -= 1
    return result

def factorial_RECURSION(n):  ### Recursion
    if n in [0, 1]:
        return 1
    else:
        return n*factorial_RECURSION(n-1)


## Problem 1
"""
Write a recursive function which takes a non-negative integer and computes the 
cumulative sum of 0 to that integer. 
"""
def rec_sum(n):
    if n in [0, 1]:
        return n
    else:
        return n + rec_sum(n-1)

## Problem 2
"""
Given an integer, create a function that returns the sum of all individual digits 
in that integer. For example: if n = 4321, return 4+3+2+1=10
"""
def sum_func(n):
    if n < 10:
        return n
    else:
        return n%10 + sum_func(n/10)
        ##  return n%10 + sum_func(n//10)  ## Python 3

## Problem 3
"""
Create a function called word_split() which takes in a string phrase and a set 
list_of_words. The function will then determine if it is possible to split the 
string in a way words can be made from the list of words. 

You can assume the phrase will only contain words found in the dictionary if it
is splittable
"""
def word_split(phrase, list_of_words, output = None):
    ## If the default output = [], it would be overwritten for every recursion.
    if output is None:
        output = []
    
    for word in list_of_words:
        if phrase.startswith(word):
            output.append(word)
            word_split(phrase[len(word):], list_of_words, output)
    return output


if __name__ == "__main__":
    print(factorial_LOOP(4))
    print(factorial_RECURSION(4))
    
    print(rec_sum(4))
    print(sum_func(4321))
    
    print(word_split('themanran', ['the','ran','man']))
    print(word_split('ilovedogsJohn',
                     ['i','am','a','dogs','lover','love','John']))
    print(word_split('themanran',['clown','ran','man']))
