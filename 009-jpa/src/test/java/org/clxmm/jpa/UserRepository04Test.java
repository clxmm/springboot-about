package org.clxmm.jpa;

import org.clxmm.jpa.repository.UserRepository04;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.Soundbank;

/**
 * @author clx
 * @date 2020/8/19 15:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepository04Test {



    @Autowired
    private UserRepository04 userRepository;



    @Test
    public void testFindIdByUsername01() {
        System.out.println(userRepository.findByUsername01("e0ac1228-4650-4091-824a-8b9d99218eb2"));
    }


    @Test
    public void testFindIdByUsername02() {
        System.out.println(userRepository.findByUsername02("e0ac1228-4650-4091-824a-8b9d99218eb2"));
    }


    @Test
    public void testFindIdByUsername03() {
        System.out.println(userRepository.findByUsername03("e0ac1228-4650-4091-824a-8b9d99218eb2"));
    }




    @Test
    public void testUpdateUsernameById() {
        userRepository.updateUsernameById(4,"clx");
    }










}
