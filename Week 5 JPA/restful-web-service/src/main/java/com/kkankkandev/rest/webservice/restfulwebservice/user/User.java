package com.kkankkandev.rest.webservice.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User {
	@JsonProperty("user-id")
	private Integer id;
	@Size(min=2, message = "이름은 최소 2글자 이상이어야 합니다")
	@JsonProperty("user_name")
	private String name;
	@Past(message = "birthDate는 과거의 날짜여야 합니다 ^^ ㅎㅎ 머저껀")
	@JsonProperty("brith_date")
	private LocalDate birthDate;

	public User(Integer id, String name, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String  toString() {
		return "User{" +
			"id=" + id +
			", name='" + name + '\'' +
			", birthDate=" + birthDate +
			'}';
	}
}