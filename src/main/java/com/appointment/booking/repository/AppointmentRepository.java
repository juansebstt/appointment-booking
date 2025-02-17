package com.appointment.booking.repository;

import com.appointment.booking.common.entity.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentModel, Long> {


}
