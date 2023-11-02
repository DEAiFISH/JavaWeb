package bean;

import lombok.*;

/**
 * @description TODO
 *
 * @className Triangle
 * @author DEAiFISH
 * @date 2023/9/28 09:42
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Triangle {
    private double a;
    private double b;
    private double c;

    public boolean isTrue() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
