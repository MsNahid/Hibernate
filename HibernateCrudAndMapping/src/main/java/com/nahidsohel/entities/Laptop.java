package com.nahidsohel.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Laptops")
public class Laptop {
	
	@Id
	@SequenceGenerator(name = "LAPTOP_SEQ_GEN", sequenceName = "LAPTOP_ID_SEQ", initialValue = 11, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LAPTOP_SEQ_GEN")
	private int id;
	
	private String brand;
	
	@OneToOne(mappedBy = "laptop")
	private Person person;
	
	@OneToMany(mappedBy = "laptop",
			cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
	private List<Ram> ramList;
	
	public void addMappingProperty(Ram ram){
		if(ramList == null){
			ramList = new ArrayList<>();
		}
		ramList.add(ram);
		
		ram.setLaptop(this); // by directional
	}
	
	@Override
	public String toString() {
		return "Laptop{" +
				"id=" + id +
				", brand='" + brand + '\'' +
				'}';
	}
}
