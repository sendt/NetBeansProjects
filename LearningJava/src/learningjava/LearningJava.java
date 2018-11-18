
package learningjava;

import java.util.Scanner;

public class LearningJava {
static int y=returnvalue();
static int x;
    public static void main(String[] args) {
        
        System.out.println("y: "+y);
        
        y=5;
        
        System.out.println("y: "+y);
        
        System.out.println("x: "+x);
        Students.calculater();
        Scanner sc=new Scanner(System.in);
        System.out.println("how much student will be in database?");
        short number_of_student=sc.nextShort();
        Students[] studens=new Students[number_of_student];
        for (int i = 0; i < number_of_student; i++) {
            System.out.println("for the "+(i+1)+". student: ");
            System.out.println("Name : ?");String name=sc.next();
            System.out.println("SurName : ?");String sur_name=sc.next();
            System.out.println("Age : ?");byte age=sc.nextByte();
            System.out.println("Mark : ?");byte mark=sc.nextByte();
            System.out.println("Number : ?");int number=sc.nextInt();
            studens[i]=new Students(name, sur_name, age, mark, number);
            System.out.println("Succesful added informs for "+(i+1)+". student");
        }
        System.out.println("here is students and their inform: ");
        for(Students s: studens){
            System.out.println("Name:"+s.name+"\t Surname:"+s.sur_name+"\t Age:"+s.age+"\t Mark:"+s.mark+"\t Number:"+s.number);
        }
        
        
    }
    public static  int returnvalue(){
        return 15;
    }
     
}
class Students{
    String name,sur_name;
    byte age,mark;
    int  number;
    public Students() {
    name="no enrty name";
    sur_name="no enrty sur name";
    number=000000;
    age=-1;
    mark=-1;
    }

    public Students(String name, String sur_name, byte age, byte mark, int number) {
        this.name = name;
        this.sur_name = sur_name;
        this.age = age;
        this.mark = mark;
        this.number = number;
    }
    public static void calculater(){
        System.out.println("student class's calculater method");
    }
    
    
}
