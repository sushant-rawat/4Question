package com.example.Question.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "studentData")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int Phy;
    int Chem;
    int Maths;
    int Biology;

}
