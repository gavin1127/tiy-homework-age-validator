/**
 * Created by Gavin on 3/20/17.
 */
public class Validator {
    public boolean validateAge(String string)throws Exception{
       int  age = 0;
         age = Integer.parseInt(string);
         if (string.contains(".")){
             throw new Exception("age must be an Integer");
         }
        if (age <  18){
            throw new Exception("Not Today Kiddo");
        }
        if (age > 114){
            throw new Exception("BullShit!");
        }
        else {
            return true;
        }
    }
}
