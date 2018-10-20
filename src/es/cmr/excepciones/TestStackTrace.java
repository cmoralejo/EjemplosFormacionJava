package es.cmr.excepciones;

class TestStackTrace{    
	   
	TestStackTrace()
	   {
		   
		  try{ 
	       divideByZero();
		  } catch (ArithmeticException e){
			  System.out.println("Dear friend, don't divide by zero!");
		  }
	   }

	    int divideByZero()
	    {
	        return 25/0;
	    }

	    public static void main(String[]args)
	    {
	           new TestStackTrace();

	    }
	}
