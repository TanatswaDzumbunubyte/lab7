package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

        BufferedReader tj= new BufferedReader(new InputStreamReader(System.in));
        String SurnameDzumbunu56874,FirstnameAlexandr56874,StreetDzumbunu56874,CityDzumbunu56874;
        int ZipcodeDzumbunu56874;

        void Initialize() throws IOException{
            System.out.println("PLEASE TYPE IN YOUR FIRST NAME- ");
            FirstnameAlexandr56874=tj.readLine();
            System.out.println("PLEASE TYPE IN YOUR SURNAME-");
            SurnameDzumbunu56874= tj.readLine();
            System.out.println("PLEASE TYPE IN STREET NAME-");
            StreetDzumbunu56874= tj.readLine();
            System.out.println("PLEASE TYPE IN A CITY-");
            CityDzumbunu56874=tj.readLine();
            System.out.println("PLEASE TYPE IN A ZIP CODE-");
            ZipcodeDzumbunu56874=Integer.parseInt(tj.readLine());
        }
        void PrintData()
        {
            System.out.println("FIRST NAME-" + FirstnameAlexandr56874);
            System.out.println("SURNAME-"+ SurnameDzumbunu56874);
            System.out.println("STREET-"+StreetDzumbunu56874);
            System.out.println("CITY-"+ CityDzumbunu56874);
            System.out.println("ZIPCODE-"+ZipcodeDzumbunu56874);
        }

    }
    class Staff extends Person
    {
        String EducationDzumbunu56874, Position56874;
        void Initialize1() throws IOException {
            Initialize();
            System.out.println("PLEASE ENTER EDUCATION");
            EducationDzumbunu56874 = tj.readLine();
            System.out.println("PLEASE ENTER POSITION");
            Position56874 = tj.readLine();

        }
        void Print1(){
            PrintData();
            System.out.println("EDUCATION: "+EducationDzumbunu56874);
            System.out.println("POSITION: "+Position56874);

    }
}

