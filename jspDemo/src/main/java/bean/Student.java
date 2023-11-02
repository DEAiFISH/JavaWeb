package bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description TODO
 *
 * @className Student
 * @author DEAiFISH
 * @date 2023/9/26 08:39
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Student() {
        this.id = 241;
        this.name = "lisi";
        this.age = 12;
    }
}
