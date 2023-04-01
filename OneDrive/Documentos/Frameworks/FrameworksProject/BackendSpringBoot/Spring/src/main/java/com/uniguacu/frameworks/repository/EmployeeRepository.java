
package com.uniguacu.frameworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguacu.frameworks.model.Cliente;

@Repository
public class EmployeeRepository extends JpaRepository<Cliente, Long> {
    
}
