package com;

import com.Response.MultiResponse400;
import com.type.N1N2MessageTransferRspData;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.apache.servicecomb.swagger.invocation.exception.CommonExceptionData;
import org.apache.servicecomb.swagger.invocation.exception.InvocationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class N1TestCousmer {
    private static RestTemplate restTemplate = RestTemplateBuilder.create();
   private static MultiResponse400 m400;
    private static Object s;
    public static void invoke(){
        //service url is : cse://serviceName/operation
        //另外还有关于post的各种使用。
//        ResponseEntity<N1N2MessageTransferRspData> res = restTemplate.postForEntity("cse://business-service1/ue-contexts/id?n1_n2_messages=jhc",null, N1N2MessageTransferRspData.class);
//        System.out.println(res.getBody());
//        System.out.println(res.getStatusCodeValue());
        try{
           restTemplate.postForEntity("cse://business-service1/ue-contexts/id?n1_n2_messages=jhc",null,N1N2MessageTransferRspData.class);
        }catch(InvocationException e){
           s= e.getErrorData() ;

        }

//        CommonExceptionData
//        System.out.println(s);
        System.out.println(s.toString());
//        System.out.println(s.getClass());
//        System.out.println(s.getCode()+" "+s.getCode());
//          System.out.println(m400.getMessage()+" "+m400.getCode());
    }

}
