# -*- coding: utf-8 -*-
"""
Created on Sun Dec 31 16:06:23 2017

@author: whuang67
"""

###### Balanced Parentheses Check ######
"""
Give a string of opening and closing parantheses, check whether it's balanced. 
We have 3 types of parentheses: round brackets: (), square brackets: [], and 
curly brackets: {}. Assume that the string doesn't contain any other character 
than these, no spaces, words or numbers. 

As a reminder, balanced parentheses require every opening parentheses to be 
closed in the reverse order opened. For example, '([])' is balanced but '([)]' 
is not.
"""

## Method 1
def balance_check(string):
    
    if len(string) % 2 == 1:
        return False
    
    opening = set("([{")
    matches = set([ ("(", ")"), ("[", "]"), ("{", "}") ])
    stack = []
    
    for paren in string:
        if paren in opening:
            stack.append(paren)
        elif len(stack) == 0:
            return False
        else:
            last_open = stack.pop()
            if (last_open, paren) not in matches:
                return False
    return len(stack) == 0

## Method 2
def balance_check2(string):
    opening = ["(", "[", "{"]
    # closing = [")", "]", "}"]
    matching = {"(": ")", "[": "]", "{": "}"}
    stack = []
    length = len(string)
    i = 0
    
    while i < length:
        if string[i] in opening:
            stack.append(string[i])
            i += 1
            
        elif len(stack) == 0:
            return False
        
        else:
            for _ in range(len(stack)):
                if matching[stack.pop()] != string[i]:
                    return False

                i += 1
    return True

## These two methods are basically the same.


if __name__ == "__main__":
    print("Testing results from Method 1:")
    print(balance_check("([])"))
    print(balance_check("([)]"))
    print(balance_check("[](){([[[]]])}"))
    print(balance_check("]"))
    
    print("Testing results from Method 2:")
    print(balance_check2("([])"))
    print(balance_check2("([)]"))
    print(balance_check2("[](){([[[]]])}"))
    print(balance_check2("]"))