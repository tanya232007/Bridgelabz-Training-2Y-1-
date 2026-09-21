package Arrays.Demo;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> studentAges=new HashMap<>();
        studentAges.put("vk",7);
        studentAges.put("Sachin",45);
        studentAges.put("Ayushi",21);
//        System.out.println("Ayushi age:" +studentAges.get("Ayushi"));
        System.out.println(studentAges);
        studentAges.remove("Ayushi");
    }


}
