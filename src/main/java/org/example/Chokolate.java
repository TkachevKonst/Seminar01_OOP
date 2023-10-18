package org.example;

public class Chokolate extends Product{
    private double kakao;

    public double getKakao() {
        return kakao;
    }

    public void setKakao(double kakao) {
        checkKakao(kakao);
    }

    public Chokolate(String brand, String name, double price, double kakao) {
        super(brand, name, price);
        this.kakao = kakao;
    }

    public String displayInfo() {
        return String.format("[Шоколад]\n%s - %s - %.2f;\nСодержание какао: %.1f",
                brand, name, price, kakao);
    }
    private void checkKakao(double kakao){
        if (kakao < 45){
            this.kakao = 45;
        }
        else{
            this.kakao = kakao;
        }
    }
}
