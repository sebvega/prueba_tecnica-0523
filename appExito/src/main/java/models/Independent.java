package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Independent {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String id;
    private String year;
    private String month;
    private String day;
    private String cellphone;
}
