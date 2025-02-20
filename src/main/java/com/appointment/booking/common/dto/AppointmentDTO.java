package com.appointment.booking.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@Builder
// @Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together
public class AppointmentDTO {

    private Long id;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String patientName;
    private String doctorName;
    private String appointmentReason;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
