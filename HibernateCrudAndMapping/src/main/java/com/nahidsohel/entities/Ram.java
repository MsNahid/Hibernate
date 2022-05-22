package com.nahidsohel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "Rams")
public class Ram {
	
	@Id
	@SequenceGenerator(name = "RAM_SEQ_GEN", sequenceName = "RAM_ID_SEQ", initialValue = 11, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RAM_SEQ_GEN")
	private int id;
	
	private short space;
	
	private String brand;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;
	
}
