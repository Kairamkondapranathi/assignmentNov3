package assignments;

public class SortSentense {
	public String sortSentence(String s) {
        List<String> words = new ArrayList<String>();
        String [] str = s.split(" ",0);
        for(String x : str)
        {
            words.add(x);
        }
        
        
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2)
            {
                if(s1.charAt(s1.length()-1) > s2.charAt(s2.length()-1))
                    return 1;
            return -1;
            }
        };
        
        Collections.sort(words,comp);
        
        String ans=new String();
        for(int i=0;i<words.size();i++)
        {
            ans+=words.get(i).substring(0,words.get(i).length()-1);
            if(i<words.size()-1)
                ans+=" ";
        }
        
        return ans;
    }

}
