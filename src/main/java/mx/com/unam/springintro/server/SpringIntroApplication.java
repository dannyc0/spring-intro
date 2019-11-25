package mx.com.unam.springintro.server;

import mx.com.unam.springintro.bean.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"mx.com.unam.springintro.bean"})
@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringIntroApplication.class, args);

		BinarySearchImpl binarySearch = ctx.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}

}
