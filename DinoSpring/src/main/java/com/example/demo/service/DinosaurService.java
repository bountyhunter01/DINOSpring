package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Dinosaur;

@Service
public class DinosaurService {
    // Dinosaur 객체를 저장하기 위한 리스트
    private List<Dinosaur> dinosaurs;

    // 생성자
    public DinosaurService() {
        this.dinosaurs = new ArrayList<>();
        initializeDinosaurs(); // 공룡 데이터 초기화
    }

    // 공룡 데이터 초기화 메소드
    private void initializeDinosaurs() {
    	List<Dinosaur> tyrannosaurs = new ArrayList<>();

        tyrannosaurs.add(new Dinosaur("렉스", "티라노사우르스", 12.3, 8000));
        tyrannosaurs.add(new Dinosaur("티나", "티라노사우르스", 11.5, 7000));
        tyrannosaurs.add(new Dinosaur("톰", "티라노사우르스", 12.0, 7500));
        tyrannosaurs.add(new Dinosaur("테리", "티라노사우르스", 13.0, 8100));

        List<Dinosaur> velociraptors = new ArrayList<>();// 벨로키랍토르
        velociraptors.add(new Dinosaur("비키", "벨로키랍토르", 2.0, 15));
        velociraptors.add(new Dinosaur("바이올렛", "벨로키랍토르", 2.1, 17));
        velociraptors.add(new Dinosaur("빅토리아", "벨로키랍토르", 2.2, 16));
        velociraptors.add(new Dinosaur("빅터", "벨로키랍토르", 2.3, 18));

        List<Dinosaur> spinosaurus = new ArrayList<>();// 스피노사우르스
        spinosaurus.add(new Dinosaur("스파이크", "스피노사우르스", 6.7, 99));
        spinosaurus.add(new Dinosaur("렉시", "스피노사우르스", 6.5, 87));
        spinosaurus.add(new Dinosaur("로라", "스피노사우르스", 3.4, 43));
        spinosaurus.add(new Dinosaur("촘피", "스피노사우르스", 2.3, 22));

        List<Dinosaur> pteranodon = new ArrayList<>(); // 프테라노돈
        pteranodon.add(new Dinosaur("뽀삐", "프테라노돈", 9.1, 66));
        pteranodon.add(new Dinosaur("삐삐", "프테라노돈", 29.1, 236));
        pteranodon.add(new Dinosaur("쵸비", "프테라노돈", 19.1, 141));
        pteranodon.add(new Dinosaur("케리아", "프테라노돈", 8.1, 59));

        List<Dinosaur> triceratops = new ArrayList<>(); // 트리케라톱스
        triceratops.add(new Dinosaur("제우스", "트리케라톱스", 42, 119));
        triceratops.add(new Dinosaur("오너", "트리케라톱스", 37, 122));
        triceratops.add(new Dinosaur("페이커", "트리케라톱스", 41, 112));
        triceratops.add(new Dinosaur("구마유시", "트리케라톱스", 59, 99));

        dinosaurs.addAll(tyrannosaurs);
        dinosaurs.addAll(velociraptors);
        dinosaurs.addAll(triceratops);
        dinosaurs.addAll(spinosaurus);
        dinosaurs.addAll(pteranodon);
    }

    // 공룡을 리스트에 추가하는 메소드
    public void addDinosaur(Dinosaur dinosaur) {
        dinosaurs.add(dinosaur);
    }

    // 종(species)으로 공룡을 검색하는 메소드, Stream API 사용
    public List<Dinosaur> getDinosaursBySpecies(String species) {
        return dinosaurs.stream().filter(dinosaur -> dinosaur.getSpecies().equalsIgnoreCase(species))
                .collect(Collectors.toList());
    }

    // 저장된 모든 공룡 정보를 조회하는 메소드
    public List<Dinosaur> getAllDinosaurs() {
        return new ArrayList<>(dinosaurs); // 기존 리스트의 복사본을 반환하여 불필요한 수정 방지
    }

    // 선택한 공룡의 프로필을 보여주는 메소드
    public void showDinosaurProfile(String name) {
        dinosaurs.stream().filter(dinosaur -> dinosaur.getName().equalsIgnoreCase(name)).findFirst()
                .ifPresent(dinosaur -> {
                    System.out.println("이름: " + dinosaur.getName());
                    System.out.println("종: " + dinosaur.getSpecies());
                    System.out.println("크기: " + dinosaur.getSize() + "m");
                    System.out.println("몸무게: " + dinosaur.getWeight() + "kg");
                });
    }

    // 이름으로 공룡을 검색하는 메소드
 // 이름으로 공룡을 검색하는 메소드
    public List<Dinosaur> findDinosaurByName(String name) {
        // Stream API를 사용하여 이름으로 공룡을 검색하고 일치하는 모든 공룡을 반환합니다.
        return dinosaurs.stream()
                        .filter(dinosaur -> dinosaur.getName().equalsIgnoreCase(name))
                        .collect(Collectors.toList());
    }

}
