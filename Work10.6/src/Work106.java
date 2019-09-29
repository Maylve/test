
public class Work106
{
	public static boolean Exists(String[] arr, String targetString)
    {
        boolean returnValue = false;
       for (int i = 0; i < arr.length; i++)
       {
           if (arr[i].equals(targetString))
           {
               returnValue = true;
               break;
          }
       }
       return returnValue;
   }
}
