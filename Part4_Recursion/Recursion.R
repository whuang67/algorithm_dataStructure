## Factorial Example ######################
factorial_LOOP <- function(n) {
  result = 1
  while(n > 1) {
    result = result * n
    n = n-1
  }
  return(result)
}

factorial_Recursive <- function(n) {
  if(n %in% c(0, 1)) {
    return(1)
  }
  return(n*factorial_Recursive(n-1))
}

factorial_LOOP(5)
factorial_Recursive(5)

## Write a recursive function which takes a non-negative integer and computes the 
## cumulative sum of 0 to that integer. 
rec_sum <- function(n) {
  if(n %in% c(0, 1)) {
    return(n)
  }
  return(n + rec_sum(n-1))
}
rec_sum(100)

## Given an integer, create a function that returns the sum of all individual digits 
## in that integer. For example: if n = 4321, return 4+3+2+1=10

sum_func <- function(n) {
  if(n>0 && n < 10) {
    return(n)
  }
  return(sum_func(floor(n/10)) + 10%%n)
}
sum_func(4321)
