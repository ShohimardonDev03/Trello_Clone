package uz.jl.springbootfeatures.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jl.springbootfeatures.domains.Activity;

/**
 * @author: Shohimardon Abdurashitov
 * @since; August  Monday 19:13:48
 * @product Name:  spring-boot-161
 * @Class Name: AcitivityRepository
 * IntelliJ IDEA
 **/
public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
