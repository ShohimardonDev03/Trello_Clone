package uz.jl.springbootfeatures.dtos.checklist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 23:18:34
 * @product Name:  spring-boot-161
 * @Class Name: CheckListUpdateDto
 * IntelliJ IDEA
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckListUpdateDto extends CheckListDeleteDto {

    private String toText;


}
