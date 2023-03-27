import com.freightbooking.booking.externalservice.IUserService;
import com.freightbooking.booking.model.request.GetUserTypeAndCompanyByUser;
import com.freightbooking.booking.model.response.UserTypeAndCompanyByUser;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

    @Override
    public UserDto get(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getUsers() {
        return new ArrayList<>();
    }
    
    @Override
    public UserDto getUserByUsername(String username) {
        return null;
    }


}
