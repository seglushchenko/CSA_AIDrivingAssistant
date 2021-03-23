import java.util.Scanner;

public class DrivingAssistant {
    public static void main(String[] args) {
        System.out.println("Welcome, I am your driving assistance. Type \"power off\" to turn me off. I can also have a discussion about driving ethics with you if you type \"talk\". Lastly, if you need to call your emergency contact, simply type \"not okay\". How may I help?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase();
        input = input.replaceAll("[?!.]", "");

    
        while(!input.equals("power off")){
            int frontDistance = DrivingAssistant.frontRadar()
            int rearDistance = DrivingAssistant.rearRadar();


            if(input.indexOf("right") >= 0 && input.indexOf("turn") >= 0){
                System.out.println(rightTurn(frontDistance));
                //insert followup method here
            }
            else if(input.indexOf("left") >= 0 && input.indexOf("turn") >= 0){
                System.out.println(leftTurn(frontDistance));
                //insert followup method here
            }
            else if(input.indexOf("intersection") >= 0 || input.indexOf("traffic light") >= 0 || input.indexOf("light") >= 0){
                System.out.println(intersection(frontDistance));
                //insert followup method here
            }
            else if(input.indexOf("back") >= 0 && input.indexOf("up") >= 0 || input.indexOf("enough space") >= 0 || input.indexOf("space") >= 0){
                System.out.println(backUp(rearDistance));
                //insert followup method here
            }

            else if (input.indexOf("hello") >= 0){
                System.out.println("Hi, how may I help you?");
            }

            else if (input.indexOf("hi")>=0){
                System.out.println("Hi, how may I help you?");
            }

            else if (input.indexOf("how are you")>=0){
                System.out.println("I am doing well! Where should we go?");
            }

            else if (input.indexOf("what do you do")>=0){
                System.out.println("I am a driving assistant that helps you make quick decisions on the road. You can ask me questions about making turns, backing up, or crossing the intersection.");
            }

            else if (input.indexOf("i do not need help")>=0){
                System.out.println("If you do not need help, go ahead and type \"power off\" to turn off.");
            }

            else if (input.indexOf("name")>=0){
                System.out.println("My name is DJ, your driving assistant. You can ask me questions about making turns, backing up, or crossing the intersection.");
            }

            else if (input.indexOf("goodbye")>=0){
                System.out.println("Thanks for talking to me!");
            }

            else if (input.equals("okay")){
                System.out.println("Alright!");
            }

            else if (input.indexOf("not okay") >= 0){
                System.out.println("I will be calling your emergency contact.");
            }

            else if (input.indexOf("who") >= 0){
                System.out.println("My name is DJ, your driving assistant. You can ask me questions about making turns, backing up, or crossing the intersection.");
            }

            else if (input.indexOf("talk") >= 0){
                System.out.println("Since I am just an assistant, the driver has complete control of the car, eliminating ethical concerns. You can always tell me to power off, but ultimately I am here for advice and help!");
            }
            
            else{
                System.out.println("I do not understand, please repeat: what do you need help with? ");
                
            }
           

            //continuously asking commands
            input = scanner.nextLine();
            input = input.toLowerCase();
            input = input.replaceAll("[?!.]", "");
        }
        System.out.println("Powering Off...");

    }

    public static int frontRadar() {
        int distance1 = (int) (Math.random() * 10 + 1);
        return distance1;
     }
 
     public static int rearRadar() {
         int distance = (int) (Math.random() * 10 + 1);
         return distance;
      }  
     public static int frontCam(){
         int responseNum = (int) (Math.random() * 3 + 1);
         return responseNum;
     }

     public static int rearCam(){
        int responseNum = (int) (Math.random() * 3 + 1);
        return responseNum;
    }

     public static String rightTurn(int RTD){
        int RRN = frontCam();
        if(RTD >= 8){
            return "Please get closer, you have " + RTD + " meters left.";
        }
        else if(RTD >= 5){
            return "Please get to the right most lane, you have " + RTD + " meters left.";
        }
       else{
            if(RRN == 1){
                return "You may go but proceed with caution.";
            }
            else if(RRN == 2){
                return "Do not go, there is a pedestrian crossing.";
            }
            else{
                return "Do not go, the light is yellow.";
            }
        }
     }

     public static String leftTurn(int LTD){
        int LRN = frontCam();
        if(LTD >= 8){
            return "Please get closer, you have " + LTD + " meters left.";
        }
        else if(LTD >= 5){
            return "Please get to the left most lane, you have " + LTD + " meters left.";
        }
       else{
            if(LRN == 1){
                return "You may go but proceed with caution.";
            }
            else if(LRN == 2){
                return "Do not go, there is a pedestrian crossing.";
            }
            else{
                return "Do not go, the light is yellow.";
            }
        }
     }
   
     public static String intersection(int ID){
        int IRN = frontCam();
        if(ID >= 5){
            return "Please get closer, you have " + ID + " meters left.";
        }
       else{
            if(IRN == 1){
                return "You may go but proceed with caution.";
            }
            else if(IRN == 2){
                return "Do not go, there is a pedestrian crossing.";
            }
            else{
                return "Do not go, the light is yellow.";
            }
        }
     }

     public static String backUp(int BUD){
        int BRN = rearCam();
        if(BUD >= 2){
            return "You may continue to back up, there is enough space. Please say \"okay\" once you are done. Otherwise, say \"not okay\"";
        }
       else{
            if(BRN == 1){
                return "Hold, there is a car passing by.";
            }
            else if(BRN == 2){
                return "Hold, there is a pedestrian behind you.";
            }
            else{
                return "Hold, there is a biker passing by.";
            }
        }
     }

}