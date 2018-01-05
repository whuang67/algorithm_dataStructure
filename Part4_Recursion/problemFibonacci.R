"
Return the n-th number of the fibonacci sequence
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
"
fibonacci <- function(n) {
  if(n %in% c(1, 2)) {
    return(1)
  }
  
  return(fibonacci(n-1) + fibonacci(n-2))
}

for(i in 1:10){
  print(fibonacci(i))
}