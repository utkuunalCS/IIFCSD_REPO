package com.edu.iifcsd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

enum GENDER {FEMALE, MALE, OTHER}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

/**
 * @Author uunal
 */
public class User {
    @Id
    public String id;

    private String userName;
    private String firstName;
    private String lastName;
    private int age;
    private GENDER gender;

}
