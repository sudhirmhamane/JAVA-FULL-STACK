public class CustomString {

    private char[] value;

    // 1
    public CustomString(){
        value = new char[0];
    }

    // 2
    public CustomString(String s){
        value = new char[s.length()];
        for(int i=0; i<value.length; i++){
            value[i] = s.charAt(i);
        }
    }

    // 3
    public CustomString(StringBuilder sb){
        value = new char[sb.length()];
        for(int i=0; i<sb.length(); i++){
            value[i] = sb.charAt(i);
        }
    }

    // 4
    public CustomString(StringBuffer sb){
        value = new char[sb.length()];
        for(int i=0; i<sb.length(); i++){
            value[i] = sb.charAt(i);
        }
    }

    // 5
    public CustomString(char[] ch){
        value = new char[ch.length];
        for(int i=0; i<ch.length; i++){
            value[i] = ch[i];
        }
    }

    // 6. length():
    public int length(){
        return value.length;
    }

    // 7 charAt():
    public char charAt(int index){
        if(index >= value.length || index < 0){
            throw new StringIndexOutOfBoundsException("Index"+ index + " out of bounds for length"+ value.length);
        }
        return value[index];
    }

    // 8 concat():
    public CustomString concat(String s){
        if(s.isEmpty()){
            return this;
        }
        char[] data = new char[s.length()+value.length];
        int index = 0;
        for(int i=0; i<value.length; i++){
            data[index++] = value[i];
        }

        for(int i=0; i<s.length(); i++){
            data[index++] = s.charAt(i);
        }

        return new CustomString(data);
    }

    // 9. isEmpty():
    public boolean isEmpty(String s){
        return value.length == 0;
    }

    // 10. toCharArray():
    public char[] toCharArray(){
        return value;
    }

    // 11. replace():
    public CustomString replace(char oldChar, char newChar){
        char[] data = new char[value.length];
        for(int i=0; i<value.length; i++){
            if(oldChar == value[i]){
                data[i] = newChar;
            } else{
                data[i] = value[i];
            }
        }
        return new CustomString(data);
    }

    // 12. toString():
    @Override 
    public String toString(){
        String res = "";
        for(int i=0; i<value.length; i++){
            res += value[i];
        }
        return res;
    }

    // 13. toUpperCase():
    public CustomString toLowerCase(String s){
        char[] data = new char[value.length];
        for(int i=0; i<value.length;i++){
            if(value[i]>= 'A' && value[i]<= 'B'){
                data[i] = (char) (value[i] + 32);
            } else{
                data[i] = value[i];
            }
        }
        return new CustomString(data);
    }

    // 14. toLowerCase():
    public CustomString toUpperCase(String s){
        char[] data = new char[value.length];
        for(int i=0; i<value.length; i++){
            if(value[i]>= 'a' && value[i]<= 'z'){
                data[i] = (char)(value[i] - 32);
            }else{
                data[i] = value[i];
            }
        }
        return new CustomString(data);

    }

    public static void main(String[] args) {
        CustomString cs = new CustomString("Java");
        System.out.println(cs.length());
    }
}