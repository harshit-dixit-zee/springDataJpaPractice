package com.jpa.springDataJpaPractice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// Ab hmne Guardian ek alag table ni bana di, instead studebt ke saath embedded kr diya
// Ab iske properties ko map krna hoga student ke saath kyunki dono ke pass email, phone , name hai
// Whenever there is parent child relationship or inheritance, then we use embedable
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name="guardian_name")
        ),
        @AttributeOverride(
                name="email",
                column =@Column(name="guarduan_email")
        ),
        @AttributeOverride(
                name="mobile",
                column = @Column(name="guardian_mobile")
        )
})
public class Guardian {

    private String name;
    private String email;
    private String mobile;
}
