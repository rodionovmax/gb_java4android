package lesson14.annotation.main;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
/*@MyAnnotation*/
public class Cat {
    @MyAnnotation(priority = 1)
    public int age = 5;

    @MyAnnotation
    public Cat(int age) {
        this.age = age;
    }

    public void doWork(/*@MyAnnotation */ @NonNull String s) {
        System.out.println(s.toUpperCase());
    }
}
