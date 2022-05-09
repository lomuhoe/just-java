package Day_0404;

public class Card {
    private int number[] = new int[52];

    public Card(String[] args) {
        boolean swit[] = new boolean[52];
        int r, w = 0;

        for(int i=0 ; i<swit.length ; i++){
            swit[i]=false;
        }

        while (w<52) {
            r = (int)(Math.random()*52);
            if(swit[r]==false){
                swit[r]=true;
                number[w]=r;
                w++;
            }
        }
    }

    public void play(){
        int cardNum = 0;
        int dealerCards[] = new int[10];
        int dealerCardSum = 0;
        int watasiCards[] = new int[10];
        int watasiCardSum = 0;
        int drawCard = -1;

        for(int i=0; i<4 ; i++, cardNum++){
            drawCard = this.drawCard(cardNum);
            if(i%2==0){
                watasiCards[i/2]=drawCard;
            }else {
                dealerCards[i/2]=drawCard;
            }
        }
    }

    
    // int cardNum;
    // int cardPic;

    // for(int i=0 ; i<number.length ; i++){
    //     cardNum = number[i] % 13 + 1;

    //     if(cardNum==1){
    //         System.out.print("card number : " + number[i] + ", " + "A");
    //     } else if(cardNum==11){
    //         System.out.print("card number : " + number[i] + ", " + "J");
    //     } else if(cardNum==12){
    //         System.out.print("card number : " + number[i] + ", " + "Q");
    //     } else if(cardNum==13){
    //         System.out.print("card number : " + number[i] + ", " + "K");
    //     } else {
    //         System.out.print("card number : " + number[i] + ", " + cardNum);
    //     }

    //     cardPic = number[i] / 13;
    //     switch (cardPic) {
    //         case 0:
    //             System.out.println(", 스페이드");
    //             break;
    //         case 1:
    //             System.out.println(", 클로버");
    //             break;
    //         case 2:
    //             System.out.println(", 다이아");
    //             break;
    //         case 3:
    //             System.out.println(", 하트");
    //             break;
    //     }
    // }
    private int drawCard(int num){
        return 0;
    }
}
