package com.cognizantBasicsPgm;

	public class FunctionPgm {
		private String name;
		private String address;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		void printData()
		{
			System.out.println("Student Name is "+this.getName());
			System.out.println("Address is "+this.getAddress());
		}
		

	}

