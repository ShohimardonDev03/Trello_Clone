package uz.jl.springbootfeatures.dtos.checklist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Sunday 11:51:04
 * @product Name:  spring-boot-161
 * @Class Name: CheckListMarkDto
 * IntelliJ IDEA
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckListMarkDto extends CheckListDeleteDto {
    boolean isDone;
}
