public class Pallindrome {

    public boolean checkPallindrome(String str){



        char[]ch = str.toCharArray();
        int i=0;
        int j= ch.length-1;
        while (i<j){
            if (ch[i]!=ch[j]){
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

    public static void main(String[] args) {
        Pallindrome pt  = new Pallindrome();
       String st = "madam";
        String ts = "run";
        System.out.println(pt.checkPallindrome(st));
        System.out.println(pt.checkPallindrome(ts));


    }
}
