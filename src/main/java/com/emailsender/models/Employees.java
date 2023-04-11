package com.emailsender.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author: Mostafa Murad
 * @created: 4/11/2023 on 12:02 PM
 **/
@Entity(name = "employees")
@Data@AllArgsConstructor@NoArgsConstructor
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String email;
    private String address;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "job_title")
    private String jobTitle;
    private String name;
    private String phone;
}
