 class throwobject{
   
    public static void main(String args[]) {
      //  System.out.println(10/0);
	  try{
       throw new ArithmeticException();
        //System.out.println("hello");
	  }
	  catch(ArithmeticException e)
	  {
		  e.printStackTrace();
	  }	
    }
}