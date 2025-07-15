package model;

import java.util.ArrayList;
import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student extends Person {
    String mbti;
    ArrayList<String> hates;
    ArrayList<String> favorites;
    ArrayList<String> study;
    ArrayList<String> jobs;
    ArrayList<String> food;

    public Student(String name, int age, String mbti, String[] hates, String[] favorites, String[] study, String[] jobs, String[] food) {
        super(name, age);
        this.mbti = mbti;
        this.hates = new ArrayList<>(Arrays.asList(hates));
        this.favorites = new ArrayList<>(Arrays.asList(favorites));
        this.study = new ArrayList<>(Arrays.asList(study));
        this.jobs = new ArrayList<>(Arrays.asList(jobs));
        this.food = new ArrayList<>(Arrays.asList(food));
    }
}
