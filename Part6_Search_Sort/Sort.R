## Bubble Sort ####################
bubble_sort <- function(arr) {
  for(i in length(arr):2) {
    for(j in 1:i) {
      if(arr[i] < arr[j]) {
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
      }
    }
  }
  return(arr)
}

## Selection Sort ####################
selection_sort <- function(arr) {
  
  for(i in length(arr):2) {
    positionOfMax = 1
    for(j in 2:i) {
      
      if(arr[positionOfMax] < arr[j]) {
        positionOfMax = j
      }
    }
    
    temp = arr[i]
    arr[i] = arr[positionOfMax]
    arr[positionOfMax] = temp
  }
  
  return(arr)
}

## Insertation Sort ####################
insertation_sort <- function(arr) {
  
  for(i in 2:length(arr)) {
    currentValue = arr[i]
    position = i
    
    while(position > 1 && currentValue < arr[position-1]) {
      arr[position] = arr[position-1]
      position = position - 1
    }
    arr[position] = currentValue
  }
  
  return(arr)
}



arr = c(2,1,3,4,0,10)
bubble_sort(arr)
selection_sort(arr)
insertation_sort(arr)
