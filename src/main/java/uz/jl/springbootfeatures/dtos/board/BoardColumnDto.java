package uz.jl.springbootfeatures.dtos.board;

import uz.jl.springbootfeatures.domains.Activity;
import uz.jl.springbootfeatures.domains.Task;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 12:32:55
 * @product Name:  spring-boot-161
 * @Class Name: BoardColumnDto
 * IntelliJ IDEA
 **/
public class BoardColumnDto {
    private String name;
    private int index;


    private Collection<Task> tasks;

    private Collection<Activity> activities;

}
