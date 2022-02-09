package skTest;

import java.util.*;


public class Hobbies {
    
    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();
    
    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }
    
    public List<String> findAllHobbyists(String hobby) {
    	List<String> list=new ArrayList<>();
    	for(int i=0;i<hobbies.size();i++) {
        for(String key : hobbies.keySet()){
             String[] value = hobbies.get(key);
             for(String k : value) {
            	 if(k.equals(hobby))
            		 
            		 list.add(key);
             }
        }
           return list;
        }
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }
}