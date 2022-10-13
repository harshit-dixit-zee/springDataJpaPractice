package com.jpa.springDataJpaPractice.repository;

import com.jpa.springDataJpaPractice.entity.Guardian;
import com.jpa.springDataJpaPractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String name);

    public List<Student> findByFirstNameContaining(String name);

    public List<Student> findByLastName(String name);

    public List<Student> findByFirstNameAndLastName(String firstName, String lastName);

    //
    public List<Student> findByGuardianName(String guardianName);

    // JPQL
    @Query("select s from Student s where s.emailId = ?1")
    public Student getStudentByEmailId(String email);

    @Query("select s.firstName from Student s where s.emailId = ?1")
    public String getStudentNameByEmailId(String email);

    @Query("select s.firstName from Student s where s.guardian.name= ?1 ")
    public String getNameByGuardianName(String name);

    // If you have complex queries so spring data jpa provides support for native queries as well.
    // Native Queries

    // Native Param Queries
    @Query(
            value = "SELECT * FROM tbl_student s where s.email_address = :emailId",
            nativeQuery = true
    )
    public Student getNameByEmailIdNativeParam( String emailId);

    @Query(
            value = "select * from tbl_student s where s.first_name =:firstName and last_name=:lastName",
            nativeQuery = true
    )
    public Student getDetailsFromTwoParam(@Param("firstName") String firstName, String lastName);



    // All the methods till now are used to fetch the record from the db.
    // Now we are learning how to modify the data in db(update and delete)

    //@Transactional-- Give this annotation to service layer, and service layer calls repository, once it come back from repository then onlt the transaction will be commited
    // Whenever we modify the database, either update or delete, we use transactional as no other operation can be performed in between the transaction
    // Else transaction will be cancelled.
    // Once this function is called and return back to calling statement then the changes are finally commited to the databse.
    // Means transaction is complete
    @Modifying
    @Transactional
    @Query(
            value = "update tbl_student s set s.first_name =?1 where s.email_address=?2 ",
            nativeQuery = true
    )
    public void updateFirstNameByEmail(String firstName, String email);

}
