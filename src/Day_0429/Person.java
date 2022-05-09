package Day_0429;

public enum Person {
    손오공("원숭이"){
        public String work(){
            return "나쁜 놈들을 잡는다.";
        }
    }, 사오정("괴수"), 저팔계("돼지"), 삼장법사("인간");

    private String temp;

    private Person(String temp){
        this.temp = temp;
    }
    public String getTemp() {
        return temp;
    }
    public String work(){
        return "하는 일 없음";
    }
}