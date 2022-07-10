package C10_ObjectOrientedThink;

/**
 * my string
 */
public class P22_MyString {
    char[] chars;

    public P22_MyString(char[] chars){
        this.chars=new char[chars.length];
        for(int i=0;i<chars.length;i++){
            this.chars[i]=chars[i];
        }
    }

    public char charAt(int index){
        return chars[index];
    }

    public int length(){
        return chars.length;
    }

    public P22_MyString substring(int begin,int end){
        char[] chars=new char[end-begin];
        for(int i=0;i<end-begin;i++){
            chars[i]=this.chars[begin+i];
        }
        return new P22_MyString(chars);
    }

    public P22_MyString toLowerCase(){
        char[] chars=new char[this.chars.length];
        for(int i=0;i<this.chars.length;i++){
            char c=this.chars[i];
            if(c>='A'&&c<='Z'){
                chars[i]=(char)(c-'A'+'a');
            }else{
                chars[i]=c;
            }
        }
        return new P22_MyString(chars);
    }

    public boolean equals(P22_MyString str){
        if(str.length()!=chars.length)
            return false;
        for(int i=0;i<chars.length;i++){
            if(str.charAt(i)!=charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static P22_MyString valueOf(int i){
        if(i==0){
            char[] chars={'0'};
            return new P22_MyString(chars);
        }
        char[] chars=new char[11];
        boolean flag= i>=0 ? true : false;

        int pos=0;
        while(i!=0){
            chars[pos++]=(char)(i%10+'0');
            i/=10;
        }
        if(!flag){
            chars[pos++]='-';
        }
        char[] charsReturn=new char[pos];
        for(int j=0;j<pos;j++){
            charsReturn[j]=chars[pos-1-j];
        }
        return new P22_MyString(charsReturn);
    }
}
