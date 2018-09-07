package com;


import com.Exception.ConflictException;
import com.Exception.GateWayTimeOutException;
import com.Exception.NotFoundExceptionNew;
import com.Response.*;
import com.type.N1N2MessageTransferCause;
import com.type.N1N2MessageTransferRspData;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.swagger.invocation.exception.InvocationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
/*

          /*
               目前不清楚到底是怎么判断message的内容所以暂时没有写怎么判断message的内容，但是根据API可以知道，目前大概分为
               五种情况
               其中内容成功的话分为两种
                一种是 200 表示成功信息成功初始化
                一种是202  表示信息被接受
               失败的内容分为三种
               一种是307 重定向
               一种是 404 没有发现资源
               一种是409 内容冲突
               一种是 504 网关超时
               默认 没有预期的错误
 */



@RestSchema(schemaId="checkInformation")//不知道是为啥
@RequestMapping(path="/")
public class checkInformation {
    @RequestMapping(path="/ue-contexts/id", method= RequestMethod.POST)
    @ApiResponses({
            @ApiResponse(code=200,response = N1N2MessageTransferRspData.class,message = "initial success"),
            @ApiResponse(code=202, response = N1N2MessageTransferRspData.class,message="messsage accept"),
            @ApiResponse(code=307,response = MultiResponse300.class,message="temporary redirect" ),
            @ApiResponse(code=404,response=MultiResponse400.class,message="Not Found"),
            @ApiResponse(code=409,response=MultiResponse400.class,message="Confilct"),
            @ApiResponse(code=504,response=MultiResponse500.class,message="GateWay Time out")
    })
    public ResponseEntity<?>   check(@RequestParam String n1_n2_messages){//not allow complex type for query parameter, method=com.checkInformation:check

            N1N2MessageTransferRspData mes_202 = new N1N2MessageTransferRspData(N1N2MessageTransferCause.ATTEMPTING_TO_REACH_UE);
            N1N2MessageTransferRspData mes_200 =  new N1N2MessageTransferRspData(N1N2MessageTransferCause.N1_N2_TRANSFER_INITIATED);
            String flag = judge(n1_n2_messages);
            switch(flag){
                case "Accept":
                    return new ResponseEntity<>(mes_202,HttpStatus.OK);
                case "Initiated":
                    return new ResponseEntity<>(mes_200,HttpStatus.ACCEPTED);
                case  "Conflict":
                    MultiResponse400 r = new MultiResponse400(409,"Conflict");
                    throw new InvocationException(Response.Status.BAD_REQUEST,r);
//                case "Not Found":
//
//                    throw new InvocationException(Response.Status.NOT_FOUND，r);//dont know InvocationExcepiton's api
//                case "GateWay Timeout":
//                    throw new GateWayTimeOutException("Gate way time out");
                default:
                   return new ResponseEntity<>("",HttpStatus.BAD_REQUEST);
            }

    }

    public String judge(String message){
        String result = "";
        if(message.equals("jhc")){
            result = "Conflict";
        }

        return result;
    }

//    @ExceptionHandler(NotFoundExceptionNew.class)
//    public ResponseEntity<String> notFound(NotFoundExceptionNew e){
//        String cause = e.getExCause();
//        return new ResponseEntity<>(cause,HttpStatus.NOT_FOUND);
//    }
//
//
//    @ExceptionHandler(ConflictException.class)
//    public ResponseEntity<String> conflict(ConflictException e){
//        String cause = e.getExCause();
//        return new ResponseEntity<String>(cause,HttpStatus.TEMPORARY_REDIRECT);
//    }
//
//    @ExceptionHandler(GateWayTimeOutException.class)
//    public ResponseEntity<String> gateWayTimeOut(GateWayTimeOutException e){
//        String cause = e.getExCause();
//        return new ResponseEntity<>(cause,HttpStatus.GATEWAY_TIMEOUT);
}










