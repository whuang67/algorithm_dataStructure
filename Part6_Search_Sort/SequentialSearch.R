## Unordered
seq_search <- function(arr, target){
  Found = FALSE
  i = 1
  
  while(i <= length(arr) && Found == FALSE){
    if(arr[i] == target){
      Found = TRUE
    }
    i = i+1
  }
  
  return(Found)
}

## Ordered
ordered_seq_search <- function(arr, target){
  Found = FALSE
  Stop = FALSE
  i = 1
  
  while(i <= length(arr) && Found == FALSE && Stop == FALSE) {
    if(arr[i] == target) {
      Found = TRUE
    } else if (arr[i] > target) {
      Stop = TRUE
    }
    i = i + 1
  }
  
  return(Found)
}


arr1 = c(1,2,3,4,5,6,7)
arr2 = c(7,6,5,4,3,2,1)

seq_search(arr2, 10)
ordered_seq_search(arr1, 5)

