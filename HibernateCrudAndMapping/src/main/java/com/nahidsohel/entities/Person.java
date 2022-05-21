package com.nahidsohel.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Persons")
public class Person {
	
	@Id
	@SequenceGenerator(name = "PERSON_SEQ_GEN", sequenceName = "PERSON_ID_SEQ", initialValue = 11, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSON_SEQ_GEN")
	private int id;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;
}
