package com.maxim.api.repositories;

import com.maxim.api.models.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer> {}
