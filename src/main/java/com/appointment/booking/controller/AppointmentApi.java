package com.appointment.booking.controller;

import com.appointment.booking.common.dto.AppointmentDTO;
import com.appointment.booking.common.entity.AppointmentModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// @RestController annotation is used to create RESTful web services using Spring MVC.
public interface AppointmentApi {

    @GetMapping("/appointments/{id}")
    ResponseEntity<Optional<AppointmentModel>> getAppointmentById(@PathVariable Long id);

    @GetMapping("/appointments")
    ResponseEntity<List<AppointmentModel>> getAllAppointments();

    @PutMapping("/appointments/{id}")
    ResponseEntity<AppointmentDTO> updateAppointment(@PathVariable Long id, @RequestBody AppointmentDTO appointmentDTO);

    @DeleteMapping("/appointments/{id}")
    ResponseEntity<Void> deleteAppointment(@PathVariable Long id);
}
