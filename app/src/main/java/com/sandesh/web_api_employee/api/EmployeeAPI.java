package com.sandesh.web_api_employee.api;

import com.sandesh.web_api_employee.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getAllEmployees();
}
