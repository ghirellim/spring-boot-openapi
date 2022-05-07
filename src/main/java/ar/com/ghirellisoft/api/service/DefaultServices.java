package ar.com.ghirellisoft.api.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultServices {

    public Object createEmployee(String name, String empId) {

        return "Employee created with name: " + name + " and empId: " + empId;
    }

}