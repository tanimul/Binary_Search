# Binary Search
Add a Binary search using JAVA language.

# About Binary Search
Binary search is an efficient algorithm for finding an item from a sorted list of items. It is a fast search algorithm with run-time complexity of Ο(log n). 
This search algorithm works on the principle of divide and conquer.Binary search looks for a particular item by comparing the middle most item of the collection.
If a match occurs, then the index of item is returned. If the middle item is greater than the item, then the item is searched in the sub-array to the left of the
middle item. Otherwise, the item is searched for in the sub-array to the right of the middle item. This process continues on the sub-array as well until the size of the 
subarray reduces to zero.

![binary_search](https://user-images.githubusercontent.com/35636662/141840094-727d4504-636e-48b3-895d-8a17c94427e5.gif)
 
# Java
    
   #1st Step 
   
   Binary search works on sorted arrays. So, sorted the array if arrays will unsorted.
   
   #2nd Step
   
   We have to use the below formula to calculate the mid of the array -
    
     mid = (start + end) / 2;
  
   #3rd Step
   
         while (start <= end) {
            if (numbers[mid] < value) {
                start = mid + 1;
            } else if (numbers[mid] == value) {
                System.out.println(value + " is found at index: " + mid);
                break;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        if (start > end) {
            System.out.println("Element not found!");
        }
      
