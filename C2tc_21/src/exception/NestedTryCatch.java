package exception;

public class NestedTryCatch {
  public static void check() {
	  String str="TNS";
	  int slength=str.length();
	  System.out.println("String length"+slength);}
      String anotherstring=null;
      int y=6;
      try 
    	  {try {
    		  String str;
			System.out.println(str.charAt(y));
    	  }
    	  catch(StringIndexOutOfBoundsException ex)
    	  {
    		  System.out.println("indexoutofound"+ex.getMessage());
    		  
    	  }
    	  System.out.println("string length"+anotherstring.length());
    	  }
      catch(NullPointerException npe)
      {
    	  System.out.println("Exception is thrown"+npe);
    	  
      }

