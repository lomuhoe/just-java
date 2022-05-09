package Day_0429;

class Friend {
    String name;   
    Season favoriteSeason;
    MyColor favoriteColor;

    public Friend(String name, Season favoriteSeason, MyColor favoriteColor) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
        this.favoriteColor = favoriteColor;
    }
    
    @Override
    public String toString() {
        return "이름 : " + name + ", favoriteSeason : " + favoriteSeason + ", favoriteColor : " + favoriteColor;
    }
}

public class EnumTest3 {
    public static void main(String[] args) {
        Friend f1 = new Friend("최인회", Season.가을, MyColor.파랑);

        System.out.println(f1);
    }
}
