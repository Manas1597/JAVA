
Class Pratical4{
public byte getByte(int number){
       
        byte result;
        
        int var = number/128;
        if(var%2==0){
            result = (byte)(number%128);
        } else {
            result = (byte)((number%128)-128);
        }
        
        return result;
        
    }
   
   
   
   public short getshort(int number){
        
        short result1;
         int var1= number/32767;
        if (var1%2==0){
            result1 = (short)(number % 32767);
        }else {
            result1= (short)((number % 32767)-32767);
        }
        
        return result1;
    }

public static int getNumber(int number,String type){
        
        int r=number;
        
        if("byte".equals(type)){
             byte result;
            
            int var = number/128;
            if(var%2==0){
                result = (byte)(number%128);
            } else {
                result = (byte)((number%128)-128);
            }
            
            return result;
    }else if ("short".equals(type)){
            
            short result1;
             int var1= number/32767;
            if (var1%2==0){
                result1 = (short)(number % 32767);
            }else {
                result1= (short)((number % 32767)-32767);
            }
            
           return result1;
    }
        return r;
    }



static int BinarytoDecimal(String number) {
    int num = 0;
    for (int i = 2; i < number.length(); i++) {
        num = num * 2 + (number.charAt(i) - '0');
    }
    return num;
}


static int HexadecimaltoDecimal(String number) {
    int num = 0;
    for (int i = 2; i < number.length(); i++) {
        char ch = number.charAt(i);
        int digit = 0;
        if (ch >= '0' && ch <= '9') {
            digit = ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            digit = ch - 'A' + 10;
        } else if (ch >= 'a' && ch <= 'f') {
            digit = ch - 'a' + 10;
        }
        num = num * 16 + digit;
    }
    return num;
}


static int OctaltoDecimal(String number) {
    int num = 0;
    for (int i = 1; i < number.length(); i++) {
        num = num * 8 + (number.charAt(i) - '0');
    }
    return num;
}


static String toBinary(int num) {
    if (num == 0) {
        return "0";
    }
    String result = "";
    while (num > 0) {
        result = (num % 2) + result;
        num = num / 2;
    }
    return result;
}


static String toOctal(int num) {
    if (num == 0) {
        return "0";
    }
    String result = "";
    while (num > 0) {
        result = (num % 8) + result;
        num = num / 8;
    }
    return result;
}


static String toHexa(int num) {
    if (num == 0) {
        return "0";
    }
    String result = "";
    String hexChars = "0123456789ABCDEF";
    while (num > 0) {
        result = hexChars.charAt(num % 16) + result;
        num = num / 16;
    }
    return result;
}


static String toXXString(String number, String XX) {
    int num = 0;

    
    if (number.startsWith("0b") || number.startsWith("0B")) {
        num = BinarytoDecimal(number);
    } else if (number.startsWith("0x") || number.startsWith("0X")) {
        num = HexadecimaltoDecimal(number);
    } else if (number.startsWith("0")) {
        num = OctaltoDecimal(number);
    } else {
        num = Integer.parseInt(number);
    }

    if (XX.equalsIgnoreCase("binary") || XX.equalsIgnoreCase("B")) {
        return "0b" + toBinary(num);  
    } else if (XX.equalsIgnoreCase("octal") || XX.equalsIgnoreCase("O")) {
        return "0" + toOctal(num);  
    } else if (XX.equalsIgnoreCase("decimal") || XX.equalsIgnoreCase("D")) {
        return Integer.toString(num); 
    } else if (XX.equalsIgnoreCase("hexadecimal") || XX.equalsIgnoreCase("H")) {
        return "0x" + toHexa(num);  
    } else {
        return "Invalid conversion type.";  
    }
}

 }
 
