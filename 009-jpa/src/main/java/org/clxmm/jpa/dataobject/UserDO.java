package org.clxmm.jpa.dataobject;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author clx
 * @date 2020/8/19 13:39
 */
@Entity
@Table(name = "users")
@Data
public class UserDO {


    public UserDO() {
    }



    /**
     * 用户编号
     * // strategy 设置使用数据库主键自增策略
     * generator 设置插入完成后，查询最后生成的 ID 填充到该属性中。
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    private Integer id;


    /**
     * 账号
     */
    @Column(nullable = false)
    private String username;


    @Column(nullable = false)
    private String password;


    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false)
    private Date createTime;


}
