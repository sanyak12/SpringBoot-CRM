package com.example.CRM.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customertab")
public class Customer {
    @Id
    @Column(name="custid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer custId;

    @Column(name="custfname")
    private String custFname;

    @Column(name="custlname")
    private String custLname;

    @Column(name="custemail")
    private String custEmail;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustFname() {
        return custFname;
    }

    public void setCustFname(String custFname) {
        this.custFname = custFname;
    }

    public String getCustLname() {
        return custLname;
    }

    public void setCustLname(String custLname) {
        this.custLname = custLname;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }
}
