class array_2 {
  public static void main(String[] args) {
     // create a 2d array
        int[][] arr2 = {
            {1, 21, 3}, 
            {4, 51, 6, 9}, 
            {71}, 
        };
      
        // calculate the length of each row
        // System.out.println("Length of row 1: " + arr2[0].length);
        // System.out.println("Length of row 2: " + arr2[1].length);
        // System.out.println("Length of row 3: " + arr2[2].length);
        
      // inside the 2d array
        for (int[] innerArray: arr2) {
            for(int data: innerArray) {
                System.out.println(data);
            }
        }


    }
    
  }
