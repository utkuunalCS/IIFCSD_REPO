package com.edu.iifcsd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

enum GENDER {FEMALE, MALE, OTHER}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    public String id;

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private int birthDate;
    private GENDER gender;
    private String favCategory;

}
