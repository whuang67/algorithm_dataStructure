"
Given a target amount n and a list (array) of distinct coin values, what's the 
fewest coins needed to make the change amount.
For example,
If n = 10 and coins = [1, 5, 10], there are four possible ways.
- 1*10
- 5 + 1*5
- 5 + 5
- 10
Hence, return 1
"

rec_coin <- function(target, coins) {
  if(target %in% coins) {
    return(1)
  }
  
  minimumCoins = target
  for(coin in coins) {
    if(coin < target){
      possibleCoins = rec_coin(target-coin, coins) + 1
      minimumCoins = min(c(possibleCoins, minimumCoins))
    }
  }
  return(minimumCoins)
}

rec_coin(10, c(1, 5, 10))
rec_coin(45, c(1, 5, 10, 25))
rec_coin(23, c(1, 5, 10, 25))
rec_coin(74, c(1, 5, 10, 25))
