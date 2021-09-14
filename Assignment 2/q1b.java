public class MyClass {
    public static int stringCompare(String str1,String str2)
    {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int)str1.charAt(i) == (int)str2.charAt(i)) {
                continue;
            } 
            else {
                return (int)str1.charAt(i) - (int)str2.charAt(i);
            }
        }
  
        if (str1.length() < str2.length()) {
            return (str1.length()-str2.length());
        } 
        else if (str1.length() > str2.length()) {
            return (str1.length()-str2.length());
        }
        else {
            return 0;
        }
    }

    public static void main(String args[])
    {
        String string1 = new String("Harsh");
        String string2 = new String("Pundir");
      
        System.out.println(stringCompare(string1,string2));
        if(stringCompare(string1,string2)<0){
            System.out.println(string1);
        }
        else{
            System.out.println(string2);
        }
    }
}