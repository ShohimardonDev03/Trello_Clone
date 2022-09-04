package uz.jl.springbootfeatures.domains;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author: Shohimardon Abdurashitov
 * @since; August  Monday 13:15:42
 * @product Name:  spring-boot-161
 * @Class Name: Audible
 * IntelliJ IDEA
 **/

@Setter
@Getter
@MappedSuperclass
@Inheritance

public class Audible implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @CreationTimestamp
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(columnDefinition = "bigint default -1")
    private Long createdBy;

    @Column
    private Timestamp updatedAt;

    private Long updatedBy;

    @Column(columnDefinition = "smallint default 0")
    @Convert(converter = org.hibernate.type.NumericBooleanConverter.class)
    private boolean deleted;


}
