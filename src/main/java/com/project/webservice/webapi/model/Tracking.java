package com.project.webservice.webapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "data_trackings")
public class Tracking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String productId;
    private String sender_first_name;
    private String sender_last_name;
    private String sender_post_code;
    private String sender_address;
    private String sender_email;
    private String sender_mobile;
    private Long sender_reciver;
    private String reciver_first_name;
    private String reciver_last_name;
    private String reciver_post_code;
    private String reciver_address;
    private String reciver_email;
    private String reciver_mobile;
    private String payment_type;
    private Double track_value;
    private Long track_status;
    private String track_date;
    private String driver_name;
    private String driver_mobile;
}
