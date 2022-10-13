package com.jpa.springDataJpaPractice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
// It adds the builder pattern to the entity class
@Builder
// Give the name of the table in mysql
// unique constraints can be given to some columns in table
@Table(
        name="tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailid_unique",
                columnNames = "email_address"
        )
)
public class Student {

    // sequence generator - This is used to generate the sequence according to the way we want.
    // sequence name- Is namm se ek tabkle banegi
    // name is like id jisse Generated value me pass krenge
    // allocationSize =  base Value * allocation Size se increment hoga
    @SequenceGenerator(
            name = "student",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student"
    )
    @Id
    private Long studentId;
    private String firstName;
    private String lastName;

    //cannot be null
    @Column(
            name="email_address",
            nullable = false
    )
    private String emailId;

    @Embedded
    private Guardian guardian;
}
