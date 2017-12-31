# -*- coding: utf-8 -*-
"""
Created on Sun Dec 31 12:43:56 2017

@author: whuang67
"""
###### Sentence Reversal ######
"""
Given a string of words, reverse all words. (Remove all leading and trailing 
whitespace)

Given: 'This is the best'
Return: 'best the is This'
"""

## Method 1 (Built-in function)
def rev_word1(string):
    return " ".join(reversed(string.split()))

## Method 2 (Built-in function)
def rev_word2(string):
    return " ".join(string.split()[::-1])

## Method 3 (Manually)
def rev_word3(string):
    words = []
    length = len(string)
    i = 0
    
    ## 1. Starting from the first letter
    ## 2. If it's a whitespace, move to the next one; if not, mark the position 
    ##    as the starting point of a word
    ## 3. Keep going until another whitespace which indicates the end of the word
    ## 4. Insert the word to the front of the output list (words)
    ## 5. Repeating 2 and 3 until the end of the string
    while i < length:
        if string[i] != " ":
            word_start = i
            while i < length and string[i] != " ":
                i += 1
            words.insert(0, string[word_start: i])
        i += 1

    return " ".join(words)

if __name__ == "__main__":
    print("Testing results of Method 1")
    print(rev_word1(" This is the best!   "))
    print("Testing results of Method 2")
    print(rev_word2(" This is the best!   "))
    print("Testing results of Method 3")
    print(rev_word3(" This is the best!   "))