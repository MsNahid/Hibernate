package com.nahidsohel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@Entity
@ToString
@Table(name = "Teachers")
public class Teacher {
	
	@Id
	@SequenceGenerator(name = "TEACHER_SEQ_GEN", sequenceName = "TEACHER_ID_SEQ", initialValue = 11, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEACHER_SEQ_GEN")
	private int id;
	
	@Column(name = "teacher_name")
	private String teacherName;
	
	@Column(name = "teacher_rank")
	private String teacherRank;
}
