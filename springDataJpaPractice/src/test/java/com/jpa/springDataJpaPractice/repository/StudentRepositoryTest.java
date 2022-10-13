package com.jpa.springDataJpaPractice.repository;

import com.jpa.springDataJpaPractice.entity.Guardian;
import com.jpa.springDataJpaPractice.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


// Test is used for testing isi me aage mockito bhi ayega
@SpringBootTest
@Slf4j
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    // Before every function, write @Test to test that function
    @Test
    public void saveStudent() {
        Guardian guardian = Guardian.builder()
                .name("guardian4")
                .email("grd4@gmail.com")
                .mobile("9283746501")
                .build();

        Student student = Student.builder()
                .emailId("aditya@gmail.com")
                .firstName("aditya")
                .lastName("ydv")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void findAll() {
        System.out.println(studentRepository.findAll());
    }

    @Test
    public void findByName() {
        List<Student> s = studentRepository.findByFirstName("Harshit");
        for (Student s1 : s) {
            log.info("first log");
            log.info("The first student object is :{}", s1);
            System.out.println(s1);
            System.out.println(s1.getEmailId());
        }

    }

    @Test
    public void findByIdfunc() {
        Optional<Student> s = studentRepository.findById(2l);
        System.out.println(s);
        System.out.println(s.get().getEmailId());
    }

    @Test
    public void findBySomeName() {
        List<Student> s = studentRepository.findByFirstNameContaining("an");
        System.out.println(s);
    }

    @Test
    public void LastName() {
        List<Student> s = studentRepository.findByLastName("Dixit");
        System.out.println(s);
    }

    @Test
    public void FirstameAndLastName() {
        List<Student> s = studentRepository.findByFirstNameAndLastName("Mani", "hghgy");
        System.out.println(s);
    }

    @Test
    public void EmailId() {
        System.out.println("--------------------------------------------------");
        Student s = studentRepository.getStudentByEmailId("mani@gmail.com");
        System.out.println(s);
        System.out.println("------------------------------------------------------");
    }

    @Test
    public void g() {
        System.out.println("--------------------------------------------------");
        List<Student> s = studentRepository.findByGuardianName("guardian2");
        System.out.println(s);
        System.out.println("------------------------------------------------------");
    }


    @Test
    public void GuardianName() {
        String s = studentRepository.getStudentNameByEmailId("mani@gmail.com");
        System.out.println(s);
    }

    @Test
    public void getcheck() {
        String s = studentRepository.getNameByGuardianName("guardian2");
        System.out.println(s);
    }
    @Test
    public void getNameByEmailIdNativeParam()
    {
        Student s = studentRepository.getNameByEmailIdNativeParam("mani@gmail.com");
        System.out.println(s);
    }
    @Test
    public void getNameUsingTwoParam()
    {
        System.out.println("-------------------------------------------------------------------------------");
        Student s =  studentRepository.getDetailsFromTwoParam("Harshit", "Dixit");
        System.out.println(s);
        System.out.println("-------------------------------------------------------------------------------");
    }

    @Test
    public void updateNameByEmail()
    {
        System.out.println("-------------------------------------------------------------------------------");
        studentRepository.updateFirstNameByEmail("HD", "harshit@gmail.com");
        log.info("update done");
        System.out.println("-------------------------------------------------------------------------------");
    }
}