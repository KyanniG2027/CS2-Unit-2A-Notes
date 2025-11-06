public class Main {

   public static void main(String []args) {
     
      //BOOLEAN VARIABLES can only hold true or false 
      boolean lightsOn = false;
      boolean dannyPresent= true;

      //Boolean EXPRESSION are like questions (or comparisons)
      //where the only possible answers are true or false 

      boolean exp1 = (dannyPresent == true); //is Danny here?
      boolean exp2 = (lightsOn != true); // are the lights NOT on? (off)

      //Comparing numerical values 
      int x = 6;
      int y = 7; 

      //Check for EQUALITY using the == operator 
      System.out.println(x == y); // you can print boolean expressions directly
      // Check for NOT equal using the != operator
      boolean exp3 = (x != y ); // store the boolean exp result in a variable 
      System.out.println(exp3);

      //Compare numeric values (int, doubles) using RELATIONAL Operations 
      System.out.println( x < y); // true 6 is LESS THAN 7 )
      System.out.println( x > y); // false 6 is not GREATER THAN 7
      System.out.print ( x<= y); // true 
      System.out .println( x );
      System.out .println( x >= y); // false
      System.out .println( y >= x); // true (ORDER MATTERS w/operators)
      System.out .println( y == y ); //true
      // VCan you coompare ints and doubles 

      double z = 6.0;
      System.out.println(x == 6.0); //true (6 and 6.0 are the same value); 

      //IF STATEMENTS: use the boolean expressions to make 
      //DECISIONS about which code to execute

      //Determine what value or condition your choice rests on 
      //EX: Using the elevator at BWL depends on TIME
      double time = 8.5; //means 8:30 am
      time = 7.75; // means 7:45am
      time = 8.25; // means 8:15am 

      //put the CONDITION to test in paranthesis 
         if (time < 8) {
      System.out.println("You can take the elevator!"); 

        // if the statemnts BODY
         // if (condition) {
         //} code to run it
          }
      //Statemnet below is the outside of the if statement, so it'll run away
      System.out.println("The elevator is only available before 8 AM!");

      // TWO-WAY SELECTION: if block + else block 
      time = 8.0;
      if (time < 8 ) {
         System.out.println("Eligable for elevator!");
      }
      else {
         // Statement in ELSE block runs when IF block is false 
         System.out.println("take the stairs.."); 

         //Another example of the TWO-Way SELECTION
         // in this case, using just a boolean VALUE (not an EXPRESSION)
         boolean heads = false; //flipped tails
         //if (true)
         if (heads ) {
            System.out.println("flipped heads! Wear white");

         }
         else{
            System.out.println( "Flipped tails! Weear black"); 
         }
        

   
      }
               //MULTI-WAY SELECTION
               //1. NESTING if statements is like asking "follow-up questions"
         int age = 6;
         boolean havePermit = true;
         System.out.println("Lets see if you can take this road test..");
                  if (age >= 16 ){   
                  System.out.println("Alright, I guess you're old enough.."); 
                     // After passing the first condition (age >= 16)
                     //you ask a FOLLOW-UP (another if statement)
                     if (havePermit == true) {
                     System.out.println("Fine get in the car.");
                     }
                  
                  }
                  else { 
                     System.out.println("You're too young. Grow up");
                     

                  }
      

         }
      


  }


   



   

