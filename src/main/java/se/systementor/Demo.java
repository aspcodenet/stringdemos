package se.systementor;

public class Demo {


    public void runDemo8(){
        String email = "hej@hej.se";
        if(email.endsWith(".se") == false){

        }

    }


    public void runDemo7(){
        String mening = "Hej jag heter Stefan";
        String []words = mening.split(" ");
        
        for(int i = 0; i < words.length;i++){
            System.out.println(words[i]);
        }

        for(String word : words){
            System.out.println(word);
        }
    }

    public void runDemo6(){
        String rad = "A123;Penna;123";
        String []parts = rad.split(";");
        String productid  = parts[0];
        String productName  = parts[1];
        int stockLevel = Integer.parseInt(parts[2]);


    }

    public void runDemo5(){
        
        String email = "hejsan@hoppsan.se";
        //int position = email.indexOf('h');
        int position = email.indexOf("h");
        
        int position2 = email.indexOf("hoppsansa");
        if(position2 == -1){
            System.out.println("Hittade inte hoppsansa");
        }
    }


    public void runDemo4(){
        String email = "hejsan@hoppsan.se";

       // @
       int antalAtTecken = 0;
        for(int i = 0; i < email.length(); i++){
            char ch = email.charAt(i);
            if( ch == '@')
                antalAtTecken++;
        }
        if(antalAtTecken != 1){
            System.out.println("Inte en valid epostadress");
        }
    }


    public void runDemo3(){
        String chatText = "";
        while(true){
            System.out.println("Meddelande:");
            chatText = System.console().readLine();

            // dumskalle
            // *********
            chatText = chatText.replace("dumskalle", "*********");
            System.out.println(chatText);

        }        
    }



    public void runDemo2(){
        String namn = "";
        while(true){
            namn = System.console().readLine();
            
            if ( namn.isEmpty() )
            //if ( namn.length() == 0 )
                System.out.println("Field is mandatory.Try again");
            else if ( namn.length() > 20 )
                System.out.println("Max 20 chars.Try again");
            else
                break;
        }        
    }


    public void run(){
        while(true){
            //Byt till S = Start
            // byt till exit = Exit
            System.out.println("*** WELCOME ***");
            System.out.println("START Kör ngt");
            System.out.println("EXIT Exit");
            System.out.println("select:");
            // String sel = System.console().readLine();
            String sel = System.console().readLine();

            if(sel.equalsIgnoreCase("START")){
                System.out.println("Nu köäs ngt");
            }
            else if(sel.equalsIgnoreCase("EXIT"))
                break;
        }
    }
}
