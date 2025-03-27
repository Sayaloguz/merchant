package com.sarawipay.practica.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

@DynamoDBTable(tableName = "MainTable")
public class Merchant extends MainTable{

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "address")
    private String address;

    @DynamoDBAttribute(attributeName = "merchantType")
    private MerchantType merchantType;


}