
import feign.Request;
import feign.RetryableException;
import feign.Retryer;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@NoArgsConstructor
public class CustomRetryer implements Retryer {

    private int retryMaxAttempt;

    private long retryInterval;

    private int attempt = 1;

    public CustomRetryer(int retryMaxAttempt, Long retryInterval) {
        this.retryMaxAttempt = retryMaxAttempt;
        this.retryInterval = retryInterval;
    }

    @Override
    public void continueOrPropagate(RetryableException e) {
        log.info("Feign retry attempt {} due to {} ", attempt, e.getMessage());

        if(!e.method().equals(Request.HttpMethod.GET) ||     attempt++ == retryMaxAttempt){
            throw e;
        }
        try {
            Thread.sleep(retryInterval);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }


    }

    @Override
    public Retryer clone() {
        return new CustomRetryer(6, 2000L);
    }
}
