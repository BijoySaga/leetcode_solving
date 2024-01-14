// Function to swap values of two integer pointers
void
swap (int *a, int *b)
{
  
int temporary = *a;		// Temporary variable to hold value during swap
  *a = *b;			// Assign value at b to a
  *b = temporary;		// Assign original value of a (stored in temporary) to b
} 
 

// Function to move all zeros to the end of an integer array
  void
moveZeroes (int *numbers, int array_size)
{
  
int next_nonzero_index = 0;	// Tracks the index where the next non-zero element should be placed
  
    // Iterate through the array
    for (size_t current_index = 0; current_index < array_size;
	 current_index++)
    {
      
if (numbers[current_index] != 0)
	{			// If current element is not zero
	  swap (&numbers[current_index], &numbers[next_nonzero_index]);	// Swap with the element at the next_nonzero_index
	  next_nonzero_index++;	// Move the index for the next non-zero element
	}
    
}

}


