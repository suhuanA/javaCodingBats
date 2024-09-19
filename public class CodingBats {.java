public class CodingBats {
    public static void Arrays2() {
       /* countEvens
        int count = 0;
	    for(int i = 0; i < nums.length; i++)
	    {
		if(nums[i] % 2 == 0)
			count++;
	    }
	    return count;
        */

        /*  bigDiff
        int max = nums[0];
	    int min = nums[0];
	    for(int i = 1; i < nums.length; i++)
	    {
		    if(nums[i] > max)
			    max = nums[i];
		    else if(nums[i] < min)
			    min = nums[i];
	    }
	    return (max-min);
         */

        /* centeredAverage
        int max = nums[0];
	    int min = nums[0];
	    int sum = nums[0];
	    for(int i = 1; i < nums.length; i++)
	    {
		    sum  += nums[i];
		    if(nums[i] > max)
			    max = nums[i];
		    else if(nums[i] < min)
			    min = nums[i];
	    }
	    return (sum-max-min) / (nums.length - 2);
         */

        /*  sum13
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 13)
                i++;
            else
                sum += nums[i];
        }
        return sum;
         */

        /* sum67
        int sum = 0;
        boolean f = false;
        
        for (int i = 0; i < nums.length; i++)
        {
            if (f)
            {
                if (nums[i] == 7)
                {
                f = false;
                }
            }
            
            else if (nums [i] == 6)
                f = true;
            
            else 
                sum += nums[i];
            
         */
        
        
         /* has22
         for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == 2 && nums[i+1] == 2)
                return true;
        }
        return false;
          */

        /* lucky13
        for(int i = 0; i < nums.length; i++)
        {
  	        if(nums[i] == 1 || nums[i] == 3)
  		        return false;
        }
        return true; 
         */

         /* sum28
        int sum = 0;
	    for(int i = 0; i < nums.length; i++)
	    {
		    if(nums[i] == 2)
			    sum += 2;
	    }
	    return (sum == 8);
          */

        /* more14
        int balance = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
                balance++;
            else if(nums[i] == 4)
                balance--;
        }
        return (balance > 0);
         */

        /*fizzArray
        int[] arr = new int[n];
    
        for(int i = 0; i < n; i++)
            arr[i] = i;
                
        return arr;
         */

        /* only14
        for(int i = 0; i < nums.length; i++)
	    {
		    if(nums[i] != 1 && nums[i] != 4)
			    return false;
	    }
	    return true;
         */

        /* fizzArray2
        String[] arr = new String[n];
    
        for(int i = 0; i < n; i++)
            arr[i] = String.valueOf(i);
              
        return arr;
         */

        /* no14
        boolean noOne = true, noFour = true;
        for(int i = 0; i < nums.length && (noOne || noFour); i++)
            {
                if(nums[i] == 1)
                    noOne = false;
                else if(nums[i] == 4)
                    noFour = false;
            }	
            return (noOne || noFour);
         */

         /* isEverywhere
        for(int i = 0; i < nums.length-1; i++)
	    {
		    if(nums[i] != val && nums[i+1] != val)
			    return false;
	    }  
	    return true;
          */

        /*either24
        int two = 1, four = 1;
        for(int i = 0; i < nums.length - 1 && (two + four != 0); i++)
            {
                if(nums[i] == 2 && nums[i+1] == 2)
                    two = 0;
                else if(nums[i] == 4 && nums[i+1] == 4)
                    four = 0;
            }
        return ((two ^ four) == 1);
         */

        /* matchUp
        int count = 0;
        int differ;
        for(int i = 0; i < nums1.length; i++)
        {
            differ = Math.abs(nums1[i] - nums2[i]);
            if(differ <= 2 && differ != 0)
                count++;			
        }
        return count;
         */

        /* has77
        for(int i = 0; i < nums.length - 1; i++)
        {
  	        if(nums[i] == 7)
  	        {
			    if(nums[i+1] == 7)
				    return true;
			    else if(i < nums.length - 2 && nums[i+2] == 7)
				    return true;
		    }
	    }
	    return false;
         */

        /* has12
        boolean oneSpotted = false;
        for(int i = 0; i < nums.length; i++)
        {
  	        if(oneSpotted)
  	        {
  		        if(nums[i] == 2)
  			        return true;
  	        }
  	        else if(nums[i] == 1)
  		        oneSpotted = true;
        }
        return false;
         */

        /* modThree
        for(int i = 0; i < nums.length - 2; i++)
	    {
	  	    if(nums[i] % 2 == nums[i+1] % 2 && nums[i] % 2 == nums[i+2] % 2)
	  		    return true;
	    }
	    return false;
         */

        /* haveThree
        int count = 0;
        boolean is3 = false;
        for(int i = 0 ; i < nums.length && count <= 3; i++)
        {
            if(nums[i] == 3)
            {
                if(is3)
                    return false;
                else
                {
                    count++;
                    is3 = true;
                }
            }
            else
                is3 = false;
        }
    return (count == 3);
         */

        /* twoTwo -----------------------------------------------------------------------
        if(nums.length == 1 && nums[0] == 2)
            return false;
          
        if(nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) ||
            (nums[nums.length-1] == 2 && nums[nums.length-2] != 2)))
            return false;
                            
        for(int i = 1; i <= nums.length - 2; i++) {
            if(nums[i] == 2 && nums[i-1] != 2 && nums[i+1] != 2)
                return false;
        }
                                            
        return true;
         */

        /* sameEnds
        int start = 0;
	    int end = nums.length-len;
	    for(; len > 0; len--)
	    {
		    if(nums[start] != nums[end])
			    return false;
		    else
		    {
			    start++;
			    end++;
		    }
	    }
	    return true;
         */

        /* tripleUp
        boolean prevUp = false;
        for(int i = 0; i < nums.length - 1; i++)
        {
  	        if(nums[i+1] - nums[i] == 1)
  	        {
  		        if(prevUp)
  			        return true;
  		        else
  			        prevUp = true;
  	        }
  	        else
  		        prevUp = false;
        }
        return false;
         */

        /* fizzArray3
        int[] arr = new int[end - start];
    
        for(int i = start; i < end; i++)
            arr[i - start] = i;
              
        return arr;
         */

        /* shiftLeft
        if(nums.length >= 2)
	    {
		    int temp = nums[0];
		    for(int i = 0; i < nums.length - 1; i++)
			    nums[i] = nums[i+1];
		    nums[nums.length-1] = temp;
	    }
	    return nums;
         */

        /* tenRun
        int tenMode = -1;
	    for(int i = 0; i < nums.length; i++)
	    {
		    if(nums[i] % 10 == 0)
			    tenMode = nums[i];
		    else if(tenMode != -1)
			    nums[i] = tenMode;
	    }
	    return nums;
         */

        /* pre4 
        int p = 0;
	    int[] arr;
	    while(nums[p] != 4)
		    p++;
	    arr = new int[p];
	    for(int i = 0; i < p; i++)
		    arr[i] = nums[i];
	    return arr;
        */

        /* post4
        int p = nums.length - 1;
	    int[] arr;
	    while(nums[p] != 4)
		    p--;
	    arr = new int[nums.length - 1 - p];
	    for(int i = p + 1; i < nums.length; i++)
		    arr[i - p - 1] = nums[i];
	    return arr;
         */

        /* notAlone
        for(int i = 1; i < nums.length - 1; i++)
		    if(nums[i] == val)
		    {
		        if(nums[i-1] != val && nums[i+1] != val)
				    nums[i] = (nums[i-1] > nums[i+1]) ? nums[i-1] : nums[i+1];
		    }
        }
        return nums;
         */

        /* zeroFront
        int zeroIndex = 0;
	    for(int i = 0; i < nums.length; i++)
	    {
		    if(nums[i] == 0)
		    {
			    nums[i] = nums[zeroIndex];
			    nums[zeroIndex] = 0;
			    zeroIndex++;
		    }
	    }
	    return nums;
         */

        /* withoutTen
        int[] arr = new int[nums.length];
	    int p = 0;
	    for(int i = 0; i < nums.length; i++)
	    {
		    if(nums[i] != 10)
		    {
			    arr[p] = nums[i];
			    p++;
		    }
	    }

	    return arr;
         */

        /* zeroMax
        int max;
	    for(int i = 0; i < nums.length - 1; i++)
	    {
		    if(nums[i] == 0)
		    {
			    max = 0;
			    for(int k = i + 1; k < nums.length; k++)
			    {
				    if(nums[k] > max && nums[k] % 2 == 1)
					    max = nums[k];
			    }
			    if(max != 0)
				    nums[i] = max;
		    }
	    }
	    return nums;
         */

        /* evenOdd
        int temp;
        int evenIndex = 0;
	    for(int i = 0; i < nums.length; i++)
	    {
		    if(nums[i] % 2 == 0)
		    {
			    temp = nums[i];
			    nums[i] = nums[evenIndex];
			    nums[evenIndex] = temp;
			    evenIndex++;
		    }
	    }
	    return nums;
         */

        /* fizzBuzz
        String[] arr = new String[end - start];
    
        for(int i = start; i < end; i++) {
            if(i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if(i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else if(i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else {
                arr[i - start] = String.valueOf(i);
            }
        }
                                                      
        return arr;
         */

        

        
    }
}