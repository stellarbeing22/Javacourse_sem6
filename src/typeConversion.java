public class typeConversion 
{
    public static void main(String[] args)
    {
        byte b = 23;
        int i = 42;

        int d;
        byte b1;

        d = b; //no issue  int <- byte: 4 byte <- 1 byte  

        System.out.println(d);

        //b1 = i; //issue byte <- int: 1 byte <- 4 byte
        //this will cause loss of data
        // if int < 255 then no loss otherwise int%256 will be stored  
        b1 = (byte)i; // this is forcefull conversion

        System.out.println(b1);
    }
}
