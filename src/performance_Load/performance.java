package performance_Load;

public class performance {
	

	/*
	 Performance Testing:
	 Applications --> Test / QA -->
	 Measure the performance of application: 
	 speed
	 responsiveness
	 stability of server
	 network 
	 
	  Adding load
	  ------------------------------------
	  
	  launched tekarch application --> it took some amount of time to load it.
	  break this section into two pieces
	  1. Frontend - Browser part 
	  	-- Download from the front end server --
	  2. Backend - API part
	  `	-- got  data --> Srinidhi, He go tthe data. 
	  	-- in a second 500 concurrent request - how do you test or mimic this situation 
	  	
	  	
	  	JMeter -- Using this we can send concurrent request and find the threshold of your server
	  	
	  	will talk about how to work on JMeter
	  	how to create concurrent request for a given API  
	  
	  Lets say you have an API-->
	  
	  5 minutes of Break 10:45AM PST
	  
	  jmeter.bat --> windows
	  jmeter.sh  --> mac
	  
	  -- Start with 5 or 10 request 
	  -- We need what API? Required Information of an API?
	  1.TestPLan will be there
	  2. Inside a test plan - We have to create Thread group
	   right click on Test plan --> Add --> Threeads --> ThreadGroup
	   
	   i. Number Of Threads  --> 5  
	   ii. Ramp-up-period  --> every 1 / 2 / 5
	   iii. Loop count --> 5 times
	   
	   5 Request 1 seconds 60 times
	   300 Requests
	   
	  3. Adding HTTP Header Manager inside Thread group
	  4. Add HTTP request below Thread group
	   - right click on Thread group --> Add --> Sampler --> HTTP Request
	   - Fill all the required information for the API
	   
	   Throughput
	   
	   1. More than 1 API in a Test Plan
	   2. Parameterizing the data's -- For login API
	   
	   Assignment:
	   1. Parameterizing the data's -- For login API
	   
	   Jmeter for an front end System --> Tomorrow.
	   
	  
	 * */

}
