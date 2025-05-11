import java.util.Scanner;

public class ChoiJH20220811_mid {
    public static void main(String[] args) {
        String[] choices = {"가위", "바위", "보"};

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2) 중 숫자를 입력하세요: ");
        int userChoice = scanner.nextInt();  

        
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("잘못된 입력입니다. 0, 1, 2 중 하나를 입력해주세요.");
            return;  
        }

        int computerChoice = (int)(Math.random() * 3);

        System.out.println("나: " + choices[userChoice]);
        System.out.println("컴퓨터: " + choices[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("무승부입니다!");
        } else if (userChoice == 0 && computerChoice == 2 || 
                   userChoice == 1 && computerChoice == 0 || 
                   userChoice == 2 && computerChoice == 1) {
            System.out.println("내가 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
    }
}


