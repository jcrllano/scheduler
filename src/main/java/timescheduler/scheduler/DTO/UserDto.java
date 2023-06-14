package timescheduler.scheduler.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "user_schedule")
public class UserDto {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String Email;
}
