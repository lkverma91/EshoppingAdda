package eshop.adda.eshoppingadda.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;  
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")    
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role; // CUSTOMER, ADMIN, SELLER

    // getters and setters
}