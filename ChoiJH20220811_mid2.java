package web.wok; 

public class ChoiJH20220811_mid2 {
    public static void main(String[] args) throws Exception {
        
        int com = (int)(Math.random() * 3);  

        
        System.out.print("가위(0), 바위(1), 보(2)을 입력하세요: ");
        int user = System.in.read() - '0';  

        
        if (user < 0 || user > 2) {
            System.out.println(" 잘못된 입력입니다. 0, 1, 2 중 하나를 입력해주세요.");
            return;
        }

        
        System.out.print("나: ");
        if (user == 0) {
            System.out.println("가위");
        } else if (user == 1) {
            System.out.println("바위");
        } else {
            System.out.println("보");
        }

        System.out.print("컴퓨터: ");
        if (com == 0) {
            System.out.println("가위");
        } else if (com == 1) {
            System.out.println("바위");
        } else {
            System.out.println("보");
        }

    
        if (user == com) {
            System.out.println("무승부입니다!");
        } else if ((user == 0 && com == 2) || 
                   (user == 1 && com == 0) ||  
                   (user == 2 && com == 1)) {  
            System.out.println("내가 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
    }
}
