
import com.freightbooking.booking.externalservice.IUserService;
import com.freightbooking.booking.externalservice.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserServiceFallback implements FallbackFactory<IUserService> {

    @Override
    public IUserService create(Throwable cause) {
        log.debug("An exception occurred when calling the UserService", cause);
        return new UserService();
    }
}
