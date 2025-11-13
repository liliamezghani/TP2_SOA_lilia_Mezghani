package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(
        name = "CalculatriceWS",
        targetNamespace = "http://service.calculatrice/"
)
public interface ICalculatrice {

    @WebMethod(operationName = "addition")
    double somme(
            @WebParam(name = "nombreA") double a,
            @WebParam(name = "nombreB") double b
    );

    @WebMethod(operationName = "multiplication")
    double multiplication(
            @WebParam(name = "nombreA") double a,
            @WebParam(name = "nombreB") double b
    );

    @WebMethod(operationName = "soustraction")
    double soustraction(
            @WebParam(name = "nombreA") double a,
            @WebParam(name = "nombreB") double b
    );

    @WebMethod(operationName = "division")
    double division(
            @WebParam(name = "dividende") double a,
            @WebParam(name = "diviseur") double b
    );
}