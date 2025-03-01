package com.appointment.booking.service;

import com.appointment.booking.common.dto.AppointmentDTO;
import com.appointment.booking.common.entity.AppointmentModel;

import java.util.List;
import java.util.Optional;

// @Service annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
public interface AppointmentService {

    // @Override annotation informs the compiler that the element is meant to override an element declared in a superclass.
    Optional<AppointmentModel> getAppointmentById(Long id);

    List<AppointmentModel> getAllAppointments();

    // @PutMapping annotation is used to map HTTP PUT requests onto specific handler methods.
    AppointmentDTO updateAppointment(Long id, AppointmentDTO appointmentDTO);

    void deleteAppointment(Long id);

}
