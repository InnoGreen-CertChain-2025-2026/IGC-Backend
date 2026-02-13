package iuh.innogreen.blockchain.igc.entity;

import iuh.innogreen.blockchain.igc.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * Admin 2/9/2026
 *
 **/
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String hashedPassword;

    @Column(nullable = true)
    private String address;

    @Column(nullable = true)
    private LocalDate dob;

    @Column(nullable = true, name = "avatar_url")
    private String avatarUrl;

}
