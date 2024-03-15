package com.example.demo.entity;

// Dinosaur 클래스 선언
public class Dinosaur {
    // 인스턴스 변수 선언
    private String name; // 공룡의 이름을 저장하는 문자열 변수
    private String species; // 공룡의 종을 저장하는 문자열 변수
    private double size; // 공룡의 크기를 저장하는 실수 변수
    private double weight; // 공룡의 몸무게를 저장하는 실수 변수

    // 생성자
    public Dinosaur(String name, String species, double size, double weight) {
        this.name = name;
        this.species = species;
        this.size = size;
        this.weight = weight;
    }

    // 공룡의 이름을 반환하는 메소드
    public String getName() {
        return name; // 공룡의 이름 반환
    }

    // 공룡의 종을 반환하는 메소드
    public String getSpecies() {
        return species; // 공룡의 종 반환
    }

    // 공룡의 크기를 반환하는 메소드
    public double getSize() {
        return size; // 공룡의 크기 반환
    }

    // 공룡의 몸무게를 반환하는 메소드
    public double getWeight() {
        return weight; // 공룡의 몸무게 반환
    }
}
