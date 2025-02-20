/*
 * Copyright 2017-Present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 package io.spring.cloud.samples.fortuneteller.ui.services.fortunes;

import io.spring.cloud.samples.fortuneteller.ui.config.UIConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;


//@EnableConfigurationProperties(FortuneProperties.class)
@Service
public class FortuneService {


    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    private UIConfig config;
    Fortune fortune = null;

    public Fortune randomFortune() {
    	
    	try {
    		
    		fortune=restTemplate.getForObject("http://fortunes:8080/random", Fortune.class);
    		if(fortune!=null)
    			return fortune;
    		    return new Fortune(42L, defaultFortune());
    			
    	}
    	catch(Exception e)
    	{
    		System.out.println("im in exception");
    		return new Fortune(42L, defaultFortune());
    	}	
    	        
        
    }
   

    @GetMapping
    public String defaultFortune() {
    	return config.getMessage();
    }
    
    

}