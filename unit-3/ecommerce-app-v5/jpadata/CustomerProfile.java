package org.ncu.ecommerce_app.jpadata;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "custom_profile")
public class CustomerProfile {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long customerId;
	
	@Column(length = 20, nullable = false)
	private String fullName;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private String location;
	
	public CustomerProfile() {}

	public CustomerProfile(Long customerId, String fullName, String email, String location) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.email = email;
		this.location = location;
	}



	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "CustomerProfile [customerId=" + customerId + ", fullName=" + fullName + ", email=" + email
				+ ", location=" + location + "]";
	}
	
	
}
