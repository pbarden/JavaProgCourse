class ArrayCopyDemo 
{ 
    public static void main(String[] args) 
    { 
        char[] copyFrom = 
        { 
            'd', //0
            'e', //1
            'c', //2
            'a', //3
            'f', //4
            'f', //5
            'e', //6
            'i', //7
            'n', //8
            'a', //9
            't', //10
            'e', //11
            'd' //12
        }; 
        char[] copyTo = new char[7]; 
        System.arraycopy(copyFrom, 2, copyTo, 0, 7); 
        System.out.println(new String(copyTo)); 

        String myString = "decaffeinated";
        String newString = myString.substring(2, 9);
        System.out.println(newString);
    } 
} 