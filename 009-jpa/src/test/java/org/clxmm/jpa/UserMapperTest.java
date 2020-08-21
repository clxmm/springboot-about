package org.clxmm.jpa;

import org.clxmm.jpa.dataobject.UserDO;
import org.clxmm.jpa.repository.UserRepository01;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @author clx
 * @date 2020/8/19 13:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserRepository01 userRepository;


    @Test
    public void testSave() {
        for (int i = 0; i < 10; i++) {
            UserDO userDO = new UserDO();
            userDO.setUsername(UUID.randomUUID().toString());
            userDO.setPassword("nicai");
            userDO.setCreateTime(new Date());
            userRepository.save(userDO);
        }
    }


    @Test
    public void testUpdateById() {
        UserDO userDO = userRepository.findById(4).get();
        userDO.setPassword("cccc1111");
        userRepository.save(userDO);
    }


    @Test
    public void testDelete() {
        userRepository.deleteById(5);
    }


    @Test
    public void testSelectByIds() {
        List<Integer> iterable = Arrays.asList(6, 4);
        Iterable<UserDO> allById = userRepository.findAllById(iterable);
        allById.forEach(System.out::println);

    }


}
