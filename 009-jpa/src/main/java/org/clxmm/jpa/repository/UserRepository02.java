package org.clxmm.jpa.repository;

import org.clxmm.jpa.dataobject.UserDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * @author clx
 * @date 2020/8/19 14:23
 */
public interface UserRepository02 extends PagingAndSortingRepository<UserDO,Integer> {

    UserDO findByUsername(String username);

    Page<UserDO> findByCreateTimeAfter(Date createTime, Pageable pageable);



}
