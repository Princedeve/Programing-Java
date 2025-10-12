public class palindromString {
    public static void main(String args[]){
        String orignalName = "ama";
        String name = orignalName;
        String reversName = "";
        for(int i = name.length()-1; i>=0; i-- ){
            reversName += name.charAt(i);
        }
        boolean isPalindrom = false;
        for(int i = 0 ; i<name.length(); i++){
            if(name.charAt(i) == reversName.charAt(i)){
                isPalindrom = true;
            }
        }
        if(isPalindrom){
            System.out.println((orignalName)+" is a palindrom string.");
        }else{
           
            System.out.println((orignalName)+" is not a palindrom string.");
        }
    }
}
