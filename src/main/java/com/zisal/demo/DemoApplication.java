package com.zisal.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			try{
				List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
				messageConverters.add(new MappingJackson2HttpMessageConverter());
				messageConverters.add(new StringHttpMessageConverter());
				restTemplate.setMessageConverters(messageConverters);

				HttpHeaders headers = new HttpHeaders();
//				headers.setContentType(MediaType.APPLICATION_JSON);

				RequestReconcileContentDTO requestReconcileContentDTO = new RequestReconcileContentDTO();
				requestReconcileContentDTO.setPlaza("99");
				requestReconcileContentDTO.setLane("20");
				requestReconcileContentDTO.setShifdate("201707180000");
				requestReconcileContentDTO.setShift("1");
				requestReconcileContentDTO.setPerioda("1");
				requestReconcileContentDTO.setIdpull(88802);
				requestReconcileContentDTO.setIdkspt(99901);
				requestReconcileContentDTO.setWaktubuka("20170718 00:00:00");
				requestReconcileContentDTO.setWaktututup("20170718 00:00:00");
				requestReconcileContentDTO.setLalinjmpass1(0);
				requestReconcileContentDTO.setLalinjmpass2(0);
				requestReconcileContentDTO.setLalinjmpass3(0);
				requestReconcileContentDTO.setLalinjmpass4(0);
				requestReconcileContentDTO.setLalinjmpass5(0);
				requestReconcileContentDTO.setRpjmpass(0);
				requestReconcileContentDTO.setRevisitariff("20151101 00:00:00");
				requestReconcileContentDTO.setFlag1(0);
				requestReconcileContentDTO.setFlag2(0);
				requestReconcileContentDTO.setFlag3(0);
				requestReconcileContentDTO.setSignature("$2y$10$/zmtdYFeeIk8ZOHpPTg83ejWohSWhpcKrIA6hrjRMdbUJ5Iym7rs.");

				RequestReconcileDTO requestReconcileDTO = new RequestReconcileDTO();
				requestReconcileDTO.setBody(requestReconcileContentDTO);

				ObjectMapper mapper = new ObjectMapper();

				System.out.println("JSON : "+mapper.writeValueAsString(requestReconcileDTO));

				/*HttpEntity<String> request = new HttpEntity<>(mapper.writeValueAsString(requestReconcileDTO), headers);
				String strRequest = "{\"body\":{\"plaza\":\"99\",\"lane\":\"20\",\"shifdate\":\"201707180000\",\"shift\":\"1\",\"perioda\":\"1\",\"idpull\":0,\"idkspt\":0,\"waktubuka\":\"20170718 00:00:00\",\"waktututup\":\"20170718 00:00:00\",\"lalinjmpass1\":0,\"lalinjmpass2\":0,\"lalinjmpass3\":0,\"lalinjmpass4\":0,\"lalinjmpass5\":0,\"rpjmpass\":0,\"revisitariff\":\"20151101 00:00:00\",\"flag1\":0,\"flag2\":0,\"flag3\":0,\"signature\":\"$2y$10$/zmtdYFeeIk8ZOHpPTg83ejWohSWhpcKrIA6hrjRMdbUJ5Iym7rs.\"}}";*/

				ResponseEntity<ResponseReconcileDTO> response = restTemplate.postForEntity("http://180.250.242.164/ccbs-api/api/reconcile_trx", requestReconcileDTO, ResponseReconcileDTO.class);

				LOGGER.info("Make Reconcile Response : "+response.getBody().toString());

				/*MultiValueMap<String, Object> innerMap = new LinkedMultiValueMap<>();
				innerMap.add("plaza", requestReconcileContentDTO.getPlaza());
				innerMap.add("lane", requestReconcileContentDTO.getLane());
				innerMap.add("shifdate", requestReconcileContentDTO.getShifdate());
				innerMap.add("shift", requestReconcileContentDTO.getShift());
				innerMap.add("perioda", requestReconcileContentDTO.getPerioda());
				innerMap.add("idpull", requestReconcileContentDTO.getIdpull());
				innerMap.add("idkspt", requestReconcileContentDTO.getIdkspt());
				innerMap.add("waktubuka", requestReconcileContentDTO.getWaktubuka());
				innerMap.add("waktututup", requestReconcileContentDTO.getWaktututup());
				innerMap.add("lalinjmpass1", requestReconcileContentDTO.getLalinjmpass1());
				innerMap.add("lalinjmpass2", requestReconcileContentDTO.getLalinjmpass2());
				innerMap.add("lalinjmpass3", requestReconcileContentDTO.getLalinjmpass3());
				innerMap.add("lalinjmpass4", requestReconcileContentDTO.getLalinjmpass4());
				innerMap.add("lalinjmpass5", requestReconcileContentDTO.getLalinjmpass5());
				innerMap.add("rpjmpass", requestReconcileContentDTO.getRpjmpass());
				innerMap.add("revisitariff", requestReconcileContentDTO.getRevisitariff());
				innerMap.add("flag1", requestReconcileContentDTO.getFlag1());
				innerMap.add("flag2", requestReconcileContentDTO.getFlag2());
				innerMap.add("flag3", requestReconcileContentDTO.getFlag3());
				innerMap.add("signature", requestReconcileContentDTO.getSignature());

				MultiValueMap<String, Object> outerMap = new LinkedMultiValueMap<>();
				outerMap.add("body", innerMap);
				System.out.println(innerMap.get("plaza"));

				HttpEntity<MultiValueMap<String,Object>> httpEntity = new HttpEntity<>(outerMap, headers);
				System.out.println(httpEntity.getBody().get("body"));

				ResponseReconcileDTO response = restTemplate.postForObject("http://180.250.242.164/ccbs-api/api/reconcile_trx", httpEntity, ResponseReconcileDTO.class);
				LOGGER.info("Make Reconcile Response 2: "+response.toString());*/
			}catch (Exception e){
				System.out.println("EROR  "+e.toString());
			}

		};
	}
}
