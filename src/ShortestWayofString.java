public class ShortestWayofString {

    public int getShortestWay(String source,String target){

        //String source = "abc"
        //String target = "abcbc"



        int subSequence=0;
        String remaining = target;

        while (remaining.length()>0){

            StringBuilder sb = new StringBuilder();
            int i=0;
            int j=0;
            while(i<source.length() && j<remaining.length()){
                if (source.charAt(i++)==remaining.charAt(j)){
                    sb.append(remaining.charAt(j++));
                }
            }
            if (sb.length()==0){
                return -1;
            }
            subSequence++;
            remaining = remaining.substring(sb.length());
        }

        return subSequence;
    }
}
