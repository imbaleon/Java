package com.imbaleon;

public class Main {

    public static void main(String[] args) {
        VipCustomer patrick = new VipCustomer();
        System.out.println(patrick.getCreditLimit());

        VipCustomer monica = new VipCustomer("mon","nibu@asd,cin");
        System.out.println(monica.getCreditLimit());

        VipCustomer tim = new VipCustomer("mon",9876,"nibu@asd,cin");
        System.out.println(tim.getCreditLimit());

    }

}
