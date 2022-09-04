package uz.jl.springbootfeatures.dtos.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jboss.jandex.Index;

import javax.persistence.Entity;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 21:24:31
 * @product Name:  spring-boot-161
 * @Class Name: TaskLabelCreateDto
 * IntelliJ IDEA
 **/

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskLabelCreateDto {
    private String name;
    private String color;

    private String workspace;
    private String username;
}
