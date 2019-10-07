package com.example.natifire.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cities")
@ApiModel(description = "All details about the Customer. ")
public class NatifireEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database generated the cities Id")
    @Column(name = "id")
    private Long id;
    @ApiModelProperty(notes = "The name city")
    @Column(name = "city")
    private String city;
}
