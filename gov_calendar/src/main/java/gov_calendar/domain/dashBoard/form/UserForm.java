package gov_calendar.domain.dashBoard.form;


import gov_calendar.domain.dashBoard.Entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class UserForm {
    private String name;

    public User GetUser() {
        return User.builder()
                .name(this.name)
                .build();
    }
}
