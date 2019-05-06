package com.mijninzet.projectteamdrie.repository;


import com.mijninzet.projectteamdrie.model.entity.StaffAvailability;
import com.mijninzet.projectteamdrie.model.entity.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffAvailibilityRepository extends JpaRepository<StaffAvailability,Integer> {

    List<StaffAvailability> findStaffAvailabilityByUser(int userId);
}