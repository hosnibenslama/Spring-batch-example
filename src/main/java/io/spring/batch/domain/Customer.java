/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.spring.batch.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Hosni
 */

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	private Long id;

	@Column(name = "FIRSTNAME")
	private  String firstName;

	@Column(name = "LASTNAME")
	private  String lastName;

	@Column(name = "BIRTHDATE")
	private  Date birthdate;


	public Customer()
	{


	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Customer(long id, String firstName, String lastName, Date birthdate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;

		this.birthdate = birthdate;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", birthdate=" + birthdate +
				'}';
	}
}
