import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rock Paper Scissors!");

        Scanner scanner = new Scanner(System.in);

        String[] optionsR = {
            "rock",
            "paper",
            "scissors"
        };

        boolean flag = false;

        while (!flag) {
            int selectopt = (int)(Math.random() * optionsR.length);

        System.out.println("Introduce the number 0:rock 1:paper 2:scissors 3:exit");
        int num = scanner.nextInt();
        System.out.println("-------------");

        switch(num) {
            case 0:
              if (selectopt == 0) {
                System.out.println("TIED");
                System.out.println("You SELECTED: " + optionsR[0]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }else if(selectopt == 1){
                System.out.println("YOU LOSE :(");
                System.out.println("You SELECTED: " + optionsR[0]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }else if(selectopt == 2){
                System.out.println("YOU WIN!!!");
                System.out.println("You SELECTED: " + optionsR[0]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }
              break;
            case 1:
            if (selectopt == 0) {
                System.out.println("YOU WIN!!!");
                System.out.println("You SELECTED: " + optionsR[1]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }else if(selectopt == 1){
                System.out.println("TIED");
                System.out.println("You SELECTED: " + optionsR[1]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }else if(selectopt == 2){
                System.out.println("YOU LOSE :(");
                System.out.println("You SELECTED: " + optionsR[1]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }
              break;
            case 2:
            if (selectopt == 0) {
                System.out.println("YOU LOSE :( ");
                System.out.println("You SELECTED: " + optionsR[2]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }else if(selectopt == 1){
                System.out.println("YOU WIN!!!");
                System.out.println("You SELECTED: " + optionsR[2]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }else if(selectopt == 2){
                System.out.println("TIED");
                System.out.println("You SELECTED: " + optionsR[2]);
                System.out.println("PC SELECTED: " + optionsR[selectopt]);
              }
              break;
            case 3:
              flag = true;
              selectopt = 0;
              break;
            default:
              System.out.println("Wrong number");
              
          }

        }
        
        scanner.close();
    }
}
