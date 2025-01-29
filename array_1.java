class array_1 {
 public static void main(String[] args) {
  
  int[] arr1 = {11,23,34,45,56,67,78}; //Declaration of an array 

  // System.out.println("Accessing Elements of Array:");
  // System.out.println("First Element: " + arr1[0]);
  // System.out.println("Second Element: " + arr1[1]);
  // System.out.println("Third Element: " + arr1[2]);
  // System.out.println("Fourth Element: " + arr1[3]);
  // System.out.println("Fifth Element: " + arr1[4]);
  // System.out.println("Sixth Element: " + arr1[5]);
  // System.out.println("Seventh Element: " + arr1[6]);

  // // length of an array 
  // System.out.println("Length of an Array : " + arr1.length);


  //  // using for loop print element of an array 
  //  for(int i = 0; i < arr1.length; i++) {
  //    System.out.println(arr1[i]);
  //  }

  System.out.println("Using for-each Loop:");
   for(int a : arr1) {
     System.out.println(a);
   }


 }
}