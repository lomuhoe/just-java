package Day_0429;

public enum Weather {
    맑음("Sunny"), 흐림("Cloudy"), 눈("Snowing"), 비("Rainy"), 안개("Fog");

    private String temp;

    private Weather(String temp) {
        this.temp = temp;
    }

    public String getTemp() {
        return temp;
    }
}
