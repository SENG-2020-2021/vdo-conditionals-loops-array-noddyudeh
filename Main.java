class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration

   //declare an array variable and assign the days of the month debtor defaulted,
   byte daysDefaulted [] = { 1,2,3,4}; 

   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
        float amounttoPayPerDay = 200f; 
        float amountPaid = 1200f;

      
   // declare all the variables needed for your calculations
  float totalAmount = 0f; 
  byte actualElement = 0;
  float temp =amountPaid;
  byte daysPaidFor=0;
  float leftToPay;
  float extra;

   // calculate and print total amount the debtor is to pay using for each loop
   for(byte i: daysDefaulted) {
   totalAmount += amounttoPayPerDay;  
   actualElement++; 
  }

  System.out.println("The number of the elements in the array is " + actualElement); 
   
  System.out.println("The total amount the debtor is to pay is #" + totalAmount);

   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
 
for(int i=0; i<actualElement; i++) {
  
  if(temp>=amounttoPayPerDay){
    temp = temp - amounttoPayPerDay; 
    daysPaidFor++;
    
  }
  else if(temp<amounttoPayPerDay){
    break;
  }
}  

for(int i=0; i<daysPaidFor;i++){
  System.out.println("The debtor paid for day " + daysDefaulted[i]);
}

if(amountPaid%amounttoPayPerDay>0 && amountPaid<totalAmount){
  System.out.println("The day that was not completely paid for is day " + daysDefaulted[daysPaidFor]);
  
  System.out.println("The amount left to complete the payment for day " + daysDefaulted[daysPaidFor] +" is #" + (amounttoPayPerDay - (amountPaid%amounttoPayPerDay)));
}




   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise

   if(amountPaid<totalAmount) {
     leftToPay= totalAmount-amountPaid;
     System.out.println("The amount left to pay is #" + leftToPay);
   }
  else if(amountPaid>totalAmount){
    extra = amountPaid-totalAmount;
    System.out.println("The amount being owed is #" + extra);
  }
  else if(amountPaid == totalAmount) {
    System.out.println("You have paid the exact amount!!");
  }

   //kindly remove the statement below when you are done with the assignment
    
  }
}