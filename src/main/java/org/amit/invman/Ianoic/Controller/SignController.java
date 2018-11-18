package org.amit.invman.Ianoic.Controller;

import org.amit.invman.Ianoic.model.ReturnMessage;
import org.amit.invman.Ianoic.model.ShopRegistration;
import org.amit.invman.Ianoic.service.IuserRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userinfo")
public class SignController {

	private Logger log = LoggerFactory.getLogger(SignController.class);
	
    @Autowired
    private IuserRegistration iuserRegistration;

    @Autowired
    private ReturnMessage returnMessage;
    
   /* @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;*/

    @GetMapping("/shopdetail/{shopID}")
    public ReturnMessage getShopbyID(@PathVariable("shopID") String shopID){
    	log.info("Incoming shopID:"+shopID);
        String shopDetail = iuserRegistration.isUserhasEntry(shopID);
        log.info("User Details:"+shopDetail);
        if(shopDetail.equalsIgnoreCase("success")){
            returnMessage.setRcCode(00);
            returnMessage.setReasonCode("00");
            returnMessage.setRsMessage("User found!!");
            returnMessage.setReasonMessage("Success");

        }
        else{
            returnMessage.setRcCode(8);
            returnMessage.setReasonCode("09");
            returnMessage.setRsMessage("User not found!!");
            returnMessage.setReasonMessage("fail");


        }
        return returnMessage;
    }

    @PostMapping("/shop/registration")
    public ReturnMessage shopRegistrationProcess(@RequestBody ShopRegistration shopRegistration){
    	boolean registrationExecution = iuserRegistration.shopRegistration(shopRegistration);
    	if(registrationExecution){
    		returnMessage.setRcCode(00);
            returnMessage.setReasonCode("00");
            returnMessage.setRsMessage("Registration Completed Successfully.");
            returnMessage.setReasonMessage("Success");

        }
        else{
            returnMessage.setRcCode(8);
            returnMessage.setReasonCode("09");
            returnMessage.setRsMessage("Shop Registration Fail, please retry once.");
            returnMessage.setReasonMessage("fail");


        }
        return returnMessage;
     }
    
    /*@RequestMapping("/kafka/{datastream}")
    public String kafkaProducerController(@PathVariable("datastream") final String data){
    	String topicName = "testtopic";
    	log.info("Kafka Message:"+data);
    	log.info("Kafka topic"+topicName);
    	kafkaTemplate.send(topicName, data);
    	
		return null;
    	
    }*/
}
