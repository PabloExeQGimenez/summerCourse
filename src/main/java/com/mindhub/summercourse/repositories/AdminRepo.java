package com.mindhub.summercourse.repositories;

import com.mindhub.summercourse.models.subclass.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
}
