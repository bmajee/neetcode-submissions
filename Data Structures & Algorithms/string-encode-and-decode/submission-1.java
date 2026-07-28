class Solution {

    public String encode(List<String> strs) {
        String encoded ="";
        for(String s:strs){
            encoded = encoded+s.length()+"#"+s;
        }
        return encoded;

    }

    public List<String> decode(String str) {
        System.out.println("str::::"+str);
        List<String>  decoded = new ArrayList<String>();
        int j = 0;
        int i = 0;
        for(;i<str.length();i++){
            System.out.println(i+"::::"+j);
            int chunkln = 0;
            if(str.charAt(i) == '#'){
                chunkln = Integer.parseInt(str.substring(j,i));
                System.out.println("chunkln::::"+chunkln);
                System.out.println("chunkstr::::"+str.substring(i+1,i+1+chunkln));
                decoded.add(str.substring(i+1,i+1+chunkln));
                i=i+chunkln;
                j=i+1;
            }
            
           
        }
       
        // System.out.println("chararray::::"+charArr[i]);
        return decoded;
    }
}
