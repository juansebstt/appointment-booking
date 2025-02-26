package com.appointment.booking.common.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "appointments")
// @Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together
public class AppointmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column annotation is used to specify the mapped column for a persistent property or field.
    private LocalDate appointmentDate;

    // @Column annotation is used to specify the mapped column for a persistent property or field.
    private LocalTime appointmentTime;

    // @Column annotation is used to specify the mapped column for a persistent property or field.
    private String patientName;
    private String doctorName;
    private String appointmentReason;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
