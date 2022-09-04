package uz.jl.springbootfeatures.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jl.springbootfeatures.domains.WorkSpace;

/**
 * @author: Shohimardon Abdurashitov
 * @since; August  Monday 19:11:19
 * @product Name:  spring-boot-161
 * @Class Name: WorkSpace
 * IntelliJ IDEA
 **/
public interface WorkSpaceRepository extends JpaRepository<WorkSpace, Long> {
}
