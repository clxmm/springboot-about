package org.clxmm.jpa;

import org.clxmm.jpa.dataobject.UserDO;
import org.clxmm.jpa.repository.UserRepository02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

/**
 * @author clx
 * @date 2020/8/19 14:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepository02Test {


    @Autowired
    UserRepository02 userRepository02;


    @Test
    public void testFindAllDesc() {
        Sort.Order order = new Sort.Order(Sort.Direction.DESC, "id");
        Iterable<UserDO> all = userRepository02.findAll(Sort.by(order));
        all.forEach(System.out::println);
    }


    @Test
    public void testPage() {
        Sort.Order order = new Sort.Order(Sort.Direction.DESC, "id");
        Sort sort = Sort.by(order);


        Pageable pageable = PageRequest.of(1, 10, sort);
        Page<UserDO> all = userRepository02.findAll(pageable);

        System.out.println(all.getTotalElements());
        System.out.println(all.getTotalPages());
    }







    @Test
    public void testFindByUsername() {
        UserDO userDO = userRepository02.findByUsername("e0ac1228-4650-4091-824a-8b9d99218eb2");
        System.out.println(userDO);
    }



    @Test
    public void testFindByCreateTimeAfter() {
        // 创建分页条件
        Pageable pageable = PageRequest.of(0, 10);
        Date createTime = new Date(2018 - 1990, Calendar.FEBRUARY, 24); // 临时 Demo ，实际不建议这么写
        Page<UserDO> page = userRepository02.findByCreateTimeAfter(createTime, pageable);
        Stream<UserDO> userDOStream = page.get();
        userDOStream.forEach(System.out::println);
        // 打印
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());

    }


}
