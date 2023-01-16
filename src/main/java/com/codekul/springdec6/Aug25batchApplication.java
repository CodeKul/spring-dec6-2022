package com.codekul.springdec6;

import com.codekul.springdec6.aop.BoyStudent;
import com.codekul.springdec6.validation.GirlStudent;
import com.codekul.springdec6.di.Company;
import com.codekul.springdec6.ioc.SimConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aug25batchApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Aug25batchApplication.class, args);

//		ApplicationContext context1 = new ClassPathXmlApplicationContext();

		SimConfig obj = context.getBean(SimConfig.class);

		Company company = context.getBean(Company.class);

		company.display();
		obj.getObj();
//		Vodafone vodafone = new Vodafone();
//		vodafone.msg();

		BoyStudent boyStudent = context.getBean(BoyStudent.class);
		GirlStudent girlStudent = context.getBean(GirlStudent.class);
//		Human human = context.getBean(Human.class);

		boyStudent.study(1);
		girlStudent.studied("","");
	}

	@GetMapping("hii")
	public String helloMsg(){
		return "Hello Spring";
	}

}
