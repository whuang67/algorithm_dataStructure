# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 15:49:44 2018

@author: whuang67
"""

###### Fibonacci Sequence ######
"""
Return the n-th number of the fibonacci sequence
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
"""

def fib(n):
    if n == 0:
        return 0
    elif n in [1, 2]:
        return 1
    else:
        return fib(n-1) + fib(n-2)

if __name__ == "__main__":
    for i in range(0, 11):
        print("{:d}-th Fibonacci number is {:d}".format(i, fib(i)))