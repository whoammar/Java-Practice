public class Student {
   public int rollNo;
   public String name;
   public  int age;
   public String address;

//Default
   public  void Student(){
      this.rollNo =12;
      this.age = 22;
      this.name = "Ammar";
      this.address = "74-B, Bankers Colony, Bahawalpur";
   }

   // Getter method
   public int getRollNo() {
      return rollNo;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public String getAddress() {
      return address;
   }
   //setter method
   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   //Parameterized Constructor
   public  void Student(int rollNo,int age, String name, String address){
      this.rollNo =rollNo;
      this.age = age;
      this.name = name;
      this.address = address;
   }

public void PrintDetails(int rollNo){
      System.out.println("Roll No:" + rollNo);
      System.out.println("Name:" + name);

}
public void PrintData(){
   System.out.println("Roll No:" + rollNo);
   System.out.println("Name:" + name);
   System.out.println("Address" + address);
   System.out.println("Age:" + age);
}

}


