package in.swadhin.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.student.address;
import in.student.college_details;

@Configuration
public class javaconfiguration 
{
   @Bean
   public address address()
   {
	   address add=new address();
	   add.setHouseno(101);
	   add.setCity("bbsr");
	   add.setPin(123456);
	   return add;
   }
   @Bean
   public college_details student()
   {
	   college_details add1=new college_details();
	   add1.setName("Lipu");
	   add1.setRollno(555);
	   add1.setAdd(address());
	   return add1;
   }
}
