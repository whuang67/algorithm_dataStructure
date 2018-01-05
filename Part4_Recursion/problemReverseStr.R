"
Reverse a string
"

reverse <- function(string) {
  l = length(string)
  if(l == 1) {
    return(string)
  }
  
  return(substr(string, l, l) + reverse(substr(string, 1, l-1)))
  ## 
}

reverse2 <- function(string) {
  l = length(string)
  if(l == 1) {
    return(string)
  }
  
  return(reverse(substr(string, 2, l)) + substr(string, 1, 1))
}