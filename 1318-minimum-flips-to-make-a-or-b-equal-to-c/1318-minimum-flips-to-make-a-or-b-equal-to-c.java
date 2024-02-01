class Solution {
    public int minFlips(int a, int b, int c) {
        int res=0;
        int maxDecimal = Math.max(a, Math.max(b, c));
        String a1= Integer.toBinaryString(a);
        String b1= Integer.toBinaryString(b);
        String c1= Integer.toBinaryString(c);
        int maxBinaryLength = Integer.toBinaryString(maxDecimal).length();
        a1 = padWithLeadingZeros(a1, maxBinaryLength);
        b1 = padWithLeadingZeros(b1, maxBinaryLength);
        c1 = padWithLeadingZeros(c1, maxBinaryLength);
        for(int i=0;i<c1.toCharArray().length;i++){
            if(c1.toCharArray()[i]=='0'){
                if(a1.toCharArray()[i]!='0')
                  res+=1;
                if(b1.toCharArray()[i]!='0')
                res+=1;
            }
            else if(c1.toCharArray()[i]=='1'){
                if(a1.toCharArray()[i]=='0' && b1.toCharArray()[i]=='0')
                  res+=1;
            }
        }
        return res;
    }
     private static String padWithLeadingZeros(String binary, int length) {
        int paddingLength = length - binary.length();
        StringBuilder paddedBinary = new StringBuilder();

        for (int i = 0; i < paddingLength; i++) {
            paddedBinary.append('0');
        }

        paddedBinary.append(binary);
        return paddedBinary.toString();
    }
}