# -*- coding: utf-8 -*-
"""
Created on Mon Jan 01 15:57:17 2018

@author: whuang67
"""

###### Coin Change ######
"""
Given a target amount n and a list (array) of distinct coin values, what's the 
fewest coins needed to make the change amount.

For example,
If n = 10 and coins = [1, 5, 10], there are four possible ways.
- 1*10
- 5 + 1*5
- 5 + 5
- 10
Hence, return 1
"""

def rec_coin(target, coins):
    min_coins = target
    
    if target in coins:
        return 1
    else:
        for coin in [c for c in coins if c < target]: ## if c == target, return 1
            num_coins = rec_coin(target - coin, coins) + 1
            min_coins = min(min_coins, num_coins)
    
    return min_coins


if __name__ == "__main__":
    print(rec_coin(10, [1, 5, 10]))
    print(rec_coin(45, [1, 5, 10, 25]))
    print(rec_coin(23, [1, 5, 10, 25]))
    print(rec_coin(74, [1, 5, 10, 25]))