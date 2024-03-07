package com.innoventes.test.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class CompanyDTO {

	private Long id;



	@NotEmpty
	@Size(min=5)
	private String companyName;

	@NotEmpty
	@Email
	private String email;

	@PositiveOrZero
	private Integer strength;
	
	private String webSiteURL;
}
