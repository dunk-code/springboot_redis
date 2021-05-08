package shool.xauat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author ：zsy
 * @date ：Created 2021/5/8 21:22
 * @description：用户类
 */
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {
    private String name;
    private String password;
}
