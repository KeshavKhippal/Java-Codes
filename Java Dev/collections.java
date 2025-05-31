import java.util.*;
public class collections{
    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();
        fruits.add("AALO");
        fruits.add("tomato");
        System.out.println(fruits);
        for(String f: fruits)
        {
            System.out.println(f);
        }

        Set<Integer> ids=new HashSet<>();
        ids.add(102) ;
        ids.add(101);
        ids.add(103);
        ids.add(101);
        System.out.println(ids.size());
        for(Integer a: ids)
        {
            System.out.println(a);
        }

        Map<String,Long> phonebook= new HashMap<>();
        phonebook.put("Keshav",9891629112L);
        phonebook.put("Sunil Kumar Verma", 9015687598L);
        phonebook.put("Sunil Kumar Verma", 9015687598L);
        phonebook.put("Praveen Kumari Verma", 9540826662L);
        phonebook.rem
        System.out.println(phonebook.size());
        phonebook.forEach((name, number) -> System.out.println(name + ": " + number));
        

    }
}