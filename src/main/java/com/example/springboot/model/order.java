package com.example.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "customer_table")
	public class order {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "sid")
		private int customer_id;
		@Column(name = "sname", nullable = false, length = 50)
		private String Name;
		@Column(name = "sphonenumber", nullable = false, length = 10)
		private String Phonenumber;
		@Column(name = "sdob", nullable = false, length = 20)
		private String DOB;
		@Column(name = "scustomer", nullable = false, length = 30)
		private String CustomerName;
		public int getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getPhonenumber() {
			return Phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			Phonenumber = phonenumber;
		}
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		public String getCustomerName() {
			return CustomerName;
		}
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}
	}
		
		
		
		