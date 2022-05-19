package printingstudentname;

public class Main {

    public static void main(String[] args) 
    {
        // array of object
        
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("Jhon");
        s1.setAge(19);
        Student s2 = new Student();
        s2.setName("peter");
        s2.setAge(20);
        Student s3 = new Student();
        s3.setName("harman");
        s3.setAge(21);
       
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i =0; i<list.length; i++){
            System.out.println(list[i].getName() + list[i].getAge());
        }
    }
    
}
