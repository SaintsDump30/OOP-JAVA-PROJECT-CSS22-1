//CHAPTER-3- OBJECT AND CLASSES

//A. CLASSES- INTRODUCTION
class Cats{

  static int legs = 4;
  static int eyes = 2;
  String color;
  String name;

  public void voice(){
    System.out.println("Meow");
  }
}

class Main {
  public static void main(String[] args) {
  //B. OBJECTS- INTRODUCTION- RN
    
  //C. LIFECYCLE OF AN OBJECT
  
    //I. Object Creation
    Cats snowbell = new Cats();
    /* Note: Here using new keyword we created a Cat DataType Object in the heap 
       memory. The object returned its address of heap to the variable name(snowbell)
       as value in stack memory. Here the default constructor initialised the values 
       of the fields inside the object(To be discussed in Constructor Chapter). */


    //II. Object Accessing
    snowbell.color = "white";
    snowbell.name = "Snow Bell Whites";
    snowbell.voice();

    System.out.println(snowbell.color);
    System.out.println(snowbell.name);
    System.out.println(Cats.legs);
    System.out.println(Cats.eyes);
    //Note: The dot opeartor fields and methods are being accessed.


    //III. Object Unreferred
    snowbell = new Cats();
    snowbell.color = "Grey";
    System.out.println(snowbell.color);
    System.out.println(snowbell.name);
    System.out.println(Cats.legs);
    System.out.println(Cats.eyes);
    /* Note: Here a new object got created and the reference of the newly created
       object gets returned to snowbell, so the above created object becomes 
       unreferred. Now the GC will take it off. As we can see we have not changed the 
       value of name it remains as it was initiated by the constructor as default 
       value. */

    snowbell = null;
    System.out.println(snowbell.color);
    System.out.println(snowbell.name);
    System.out.println(Cats.legs);
    System.out.println(Cats.eyes);
    /* Note: Here there will be error as snowbell variable's value is null, no 
       reference of any object given to it. So we can't access to its field. */

    //IV. Garbage Collector  
  }
}