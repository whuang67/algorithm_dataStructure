# -*- coding: utf-8 -*-
"""
Created on Sat Dec 30 14:47:07 2017

@author: whuang67
"""

###### First example ######
def sum1(n):
    total = 0;
    for i in range(n+1):  # There is no xrange() in Python 3
        total += i
    return total
print(sum1(100))

def sum2(n):
    return n*(n+1)/2
print(sum2(100))

%timeit sum1(100)
%timeit sum2(100)


###### Running time ######
import matplotlib.pyplot as plt
import numpy as np

n = np.linspace(1, 10, 1000)
labels = ["Constant", "Logarithmic", "Linear", "Log linear", "Quadratic",
         "Cubic", "Exponential"]
big_o = [np.ones(n.shape), np.log(n), n, n*np.log(n), n**2, n**3, 2**n]

plt.style.use("bmh")
plt.figure(figsize = (12, 10)); plt.ylim(0, 50)
for i in range(len(big_o)):
    plt.plot(n, big_o[i], label = labels[i])
plt.legend(loc=0)
plt.ylabel("Relative Runtime"); plt.xlabel("n")
plt.show()


###### Some examples ######
lst = [1, 2, 3, 4, 5, 6]
###### O(1) Constant example
def func_constant(values=lst):
    print(values[0])
func_constant()

###### O(n) Linear example
def func_linear(values=lst):
    for val in values:
        print(val)
func_linear()

###### O(n**2) Quadratic example
def func_quadratic(values=lst):
    for val1 in values:
        for val2 in values:
            print(val1, val2)
func_quadratic()

###### How to calculate O() example
def comp(values=lst):
    ## O(1)
    print(values[0])
    ## O(n/2)
    midpoint = len(values)//2
    for val in values[0:midpoint]:
        print(val)
    ## O(10)
    for _ in range(3):
        print("Hello World!")
comp()  ## O(1 + n/2 + 10) ==> O(n)


###### Worst-Best case ######
def matcher(values, matcher):
    for item in values:
        if item == matcher:
            return True
    return False
matcher(lst, 1)  ## The BEST case: O(1) 
matcher(lst, 10) ## The WORST case: O(n)


###### Space, Memory ######
def create_list(n):
    new_list = []
    for num in range(n):        ## Time Complexity O(n)
        new_list.append("new")  ## Space Complexity O(n)
    return new_list
create_list(5)

def printer(n):
    for i in range(n):       ## Time Complexity O(n)
        print("Hello World") ## Space Complexity O(1)
printer(10)


##### 4 Methods to generate a list [0, 1, 2, ..., 9999] ######
def method1():
    output = []
    for i in range(50000):
        output.append(i)
def method2():
    output = []
    for i in range(50000):
        output = output + [i]
def method3():
    output = [i for i in range(50000)]
def method4():
    output = range(50000)

%timeit method1()
%timeit method2()
%timeit method3()
%timeit method4() ## Built-in, most efficient
