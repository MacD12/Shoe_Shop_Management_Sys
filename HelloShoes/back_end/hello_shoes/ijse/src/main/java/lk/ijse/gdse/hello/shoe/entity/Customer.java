package lk.ijse.gdse.hello.shoe.entity;
import jakarta.persistence.*;
import lk.ijse.gdse66.footflex.demo.util.CustomerLoyaltyLevel;
import lk.ijse.gdse66.footflex.demo.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
//@GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String contact;
    private Date dob;
    private String addressLine1;
    private String addressLine2;
    private Date loyaltyDate;

    @Enumerated(EnumType.STRING)
    private CustomerLoyaltyLevel loyaltyLevel;

    private Integer loyaltyPoints;
    private Timestamp recentPurchaseDate;
}
