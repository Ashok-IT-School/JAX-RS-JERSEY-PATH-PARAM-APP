package com.ibm.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ibm.domain.Employee;

/**
 * This class is Exposed as Rest Component
 * 
 * @author Ashok
 *
 */
@Path("/emp")
public class EmpResource {

	/**
	 * This method is used to to handle get request
	 * 
	 * @param empId
	 * @return Employee
	 */
	@GET
	@Produces({ "application/json", "application/xml" })
	@Path("{empId}")
	public Employee findById(@PathParam("empId") String empId) {
		// logic goes here

		System.out.println("Path Parameter Value : " + empId);

		// setting dummy data to reponse
		Employee emp = new Employee();
		emp.setEmpId(Integer.parseInt(empId));
		emp.setEmpName("Charles");
		emp.setEmpSalary(55000.00);

		// return employee object
		return emp;
	}

}
