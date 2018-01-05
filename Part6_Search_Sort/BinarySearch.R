## Method 1 -- while
BinarySearch <- function(arr, target){
  Found = FALSE
  first = 0
  last = length(arr)
  
  while(Found == FALSE && first <= last) {
    midpoint = floor((first+last)/2)
    
    if(arr[midpoint] == target){
      Found = TRUE
    } else if(arr[midpoint] < target) {
      first = midpoint+1
    } else {
      last = midpoint-1
    }
  }
  
  return(Found)
}

## Method 2 -- recursive
BinarySearch2 <- function(arr, target) {
  if(length(arr) == 1) {
    
    if(arr[1] == target){
      return(TRUE)
    } else {
      return(FALSE)
    }
  }
  
  
  midpoint = floor(length(arr)/2)
  
  if(arr[midpoint] == target) {
    return(TRUE)
    
  } else if(arr[midpoint] < target) {
    return(BinarySearch2(arr[(midpoint+1): length(arr)], target))
    
  } else {
    return(BinarySearch2(arr[1: (midpoint-1)], target))
  }
}


arr = c(1,2,3,4,5,6,7,8,9,10)
BinarySearch(arr, 10)
BinarySearch(arr, 11)

BinarySearch2(arr, 5)
BinarySearch2(arr, 11)
