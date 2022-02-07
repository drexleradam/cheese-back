package hu.alkund.cheeseback.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Cheese {
    private int id;
    private String name;
    private Date expiryDate;
    private boolean available;
}
