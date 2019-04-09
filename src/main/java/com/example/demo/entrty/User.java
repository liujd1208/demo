package com.example.demo.entrty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 * @Description: java类作用描述
 * @Author: Mr.Ljd
 * @Date: 2019/4/8 18:15
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 *
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User  implements Serializable {

  private String id;
  private String name;
  private long age;
  private String sex;

}
