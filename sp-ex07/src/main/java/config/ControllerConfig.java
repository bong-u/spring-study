package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.RegisterController;
import controller.SurveyController;
import spring.MemberRegisterService;

@Configuration
public class ControllerConfig {

    private MemberRegisterService memberRegSvc;
    
    @Bean
    public RegisterController registerController() {
        RegisterController controller = new RegisterController();
        controller.setMemberRegisterService(memberRegSvc);
        return controller; 
    }

    @Bean
    public SurveyController surveyController() {
        return new SurveyController();
    }
}
