class Solution {
    public String decodeString(String s) {
        Stack<String> strstack=new Stack<>();
        Stack<Integer> countstack=new Stack<>();
        int count=0;
        String current="";
        for(char ch:s.toCharArray()){
           if(Character.isDigit(ch)){
            count=count*10+(ch-'0');
           }else if(ch=='['){
            strstack.push(current);
            countstack.push(count);
            current="";
            count=0;
           }else if(ch==']'){
            int repeat=countstack.pop();
            String previous=strstack.pop();
            current=previous+current.repeat(repeat);
           }else{
            current+=ch;
           }
        }
        return current;
    }
}
