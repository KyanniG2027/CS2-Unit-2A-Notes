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

                  // 2. ELSE IF BLOCKS (chained cinditionals)
                  //when you are accounting for multiple possible answers 
                  int battery = 19;
                  // Always start the block with an IF statement 
                  if ( battery >= 95) {
                     System.out.println("Unplug you're phone!🔋");
                     
                  }
                  else if (battery < 20) {
                     System.out.println("LOW POWER MODE");
                     //order matters for else if blocks
                     //as soon as a condition is met, the rest of the chain is SKIPPED!

                  }
                  else if (battery <= 50 ) {
                     System.out.println("Plug in your're phone soon..🪫");

                  }
                  else {
                     System.out.println("otherwise");
                  }

                   //COMPOUND BOOLEAN EXPRESSION
                // to TWO conditions in an if statement 
                    boolean cleanedRoom = true;
                      boolean didHomework = false;

      //The AND (&&) operator joins twwo espressions
      //only c0ome sout to TRUE if both expressions are TRUE! 

      if (cleanedRoom == true && didHomework == true)  {
         System.out.println("Go have fun!");
      }

      // The OR (||) operater joins two expressions
      //comes out to TRUE if AT LEAST ONE is TRUE!
      //(less restriction condition than AND)
      if ((cleanedRoom == true ) || (didHomework == true) ) {
         System.out.println("The less strict parent are fine with you going out");

      }
         //The NOT (!) operater can be used to NEGATE
         // a booleab expression 
         if ( ! (didHomework == true)) {
            System.out.println("Do your CodeCollab! The class is depending on you!");

         }
         //REMINDER: boolean VARIABLES can be used 
         //instead of full EXPRESSIONS (with relational operators)
         if (!didHomework){
            System.out.println("You did NOT do your HW...");

         }

         //IMPORTANT NOTE ABOUT STRINGS: 
         //(and other Object data types)
         //instead, use a String Method called .equals()
         String course = "AP CS";
         if (course.equals("AP CS")) {
            System.out.println("Time to learn Java!");
         }
         //.equals in CASE_SENSITIVE 
         // it checks every single character in order between the 2 Strings 

         String message1 = "Hello World";
         String message2 = "Hello World";
         if (message1.equals(message2) ) {
            System.out.println("The messages match perfectly");
            // You can mix String VARIABLES with String LITERALS
            // ex) both are string LITERALS BELOW 
            if ("hi".equals ("hi")){
               System.out.println("hi :)");

            }

         }
            

          } // this closes the Main METHOD
      } // this closes the Main CLASS


   



   

