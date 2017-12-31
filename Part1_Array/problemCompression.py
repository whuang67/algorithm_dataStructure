# -*- coding: utf-8 -*-
"""
Created on Sun Dec 31 13:16:27 2017

@author: whuang67
"""

###### String Compression ######
"""
Given a string in the form "AAAABBBBCCCCCDDEEEE", compress it to become 
"A4B4C5D2E4". 

For this problem, you can falsely "compress" strings of single or double 
letters. For instance, it is Okay for "AAB" to return "A2B1" even though this 
technically takes more space.

The function should also be case sensitive, so that a string "AAAaaa" returns 
"A3a3"
"""

def compress(string):
    
    length = len(string)
    
    if length == 0:
        return ""
    
    elif length == 1:
        return string + "1"
    
    else:
        result = ""
        count = 1
        i = 1
        while i < length:
            if string[i] == string[i-1]:
                count += 1
            else:
                result += string[i-1] + str(count)
                count = 1
            i += 1
        
        return result + string[i-1] + str(count)

if __name__ == "__main__":
    print(compress("AAAABBBBCCCCCDDEEEE"))
    print(compress("AAAaaa"))
print(compress("AAB"))        