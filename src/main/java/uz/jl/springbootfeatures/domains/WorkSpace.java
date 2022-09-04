package uz.jl.springbootfeatures.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author: Shohimardon Abdurashitov
 * @since; August  Monday 13:20:59
 * @product Name:  spring-boot-161
 * @Class Name: WorkSpace
 * IntelliJ IDEA
 **/
@Setter
@Getter
@Entity
public class WorkSpace extends Audible {
    private String username;
}
